package dominos;

import java.util.*;


public class Main {

    static List<Domino> myList = new ArrayList<>();
    static List<Domino> pList = new ArrayList<>();
    static List<Domino> cList = new ArrayList<>();

    static List<Domino> putDown = new ArrayList<>();

    static Player player = new Player();



    public static void main(String[] args) {


        Yard myYard = new Yard(myList);
        int numElements = 7;
        int sameNum = 7;


        Scanner scnr = new Scanner(System.in);


        System.out.println("Dominos!");

        char input;

        pList.addAll(player.tray(myList, numElements));
        cList.addAll(player.computerTray(myList, sameNum));


        System.out.println();
        int addOne = 1;

        /*The loop where the main game
        * selections occur*/
        while (!gameOver()) {

            System.out.println("Computer has " + cList.size() + " dominos");
            System.out.println("Boneyard contains " + myList.size() + " dominos");
            System.out.println();

            theGame(putDown);
            System.out.println();

            System.out.println("Tray: " + pList);
            System.out.println("Pick 0 - 6");
            System.out.println();

            System.out.println("[p] Play Domino");
            System.out.println("[d] Draw from boneyard");
            System.out.println("[q] Quit");

            input = scnr.next().charAt(0);


            switch (input) {

                case 'p' -> {
                    if (playerTrayList(pList)) {
                      myFirst(putDown, cList);
                    System.out.println();
                    trackScore(pList);
                    }
                }
                case 'd' -> {
                    if(myList.isEmpty()) {
                        System.out.println("BONEYARD IS EMPTY CAN'T DRAW");
                    }
                    if(humanMove(putDown, pList)) {
                        System.out.println("\n");
                        System.out.println("YOU HAVE A VALID MOVE CAN'T DRAW");
                    }
                    else if(!humanMove(putDown, pList) && !myList.isEmpty()) {
                        System.out.println("Drawing from Boneyard");
                        pList.addAll(player.tray(myList, addOne));
                        trackScore(pList);
                    }
                }
                case 'q' -> System.exit(0);

                default -> System.out.println("You have entered incorrectly try again");

            }
            System.out.println();
            if(myList.isEmpty() && trackComp(cList) < trackScore(pList)) {
                System.out.println("COMPUTER WINS!");
                System.exit(0);
            }
             if (myList.isEmpty() && trackScore(pList) < trackComp(cList)){
                System.out.println("HUMAN WINS");
                System.exit(0);
            }
        }
    }


    /*This is the method that allows the human player to actually
    * choose what domino they want, and lets them place it*/
    public static boolean playerTrayList(List<Domino> pList) {
        int i;
        char input;


        System.out.println("Which Domino?");
        Scanner scanner = new Scanner(System.in);
        Scanner numScan = new Scanner(System.in);
        Scanner nextScan =  new Scanner(System.in);

            for (i = 0; i < pList.size(); i++) {

                i = scanner.nextInt();

                System.out.println("Left or right");
                input = scanner.next().charAt(0);

                if (input == 'l') {
                        System.out.println("Rotate y/n");
                        input = numScan.next().charAt(0);

                        if (input == 'y') {
                            pList.get(i).Swap();
                            putDown.add(0, pList.remove(i));
                        } else {
                            putDown.add(0, pList.remove(i));
                     }
                }
                if (input == 'r') {
                    System.out.println("Rotate y/n");
                    input = nextScan.next().charAt(0);
                    if (input == 'y') {
                        pList.get(i).Swap();
                        putDown.add(pList.remove(i));
                    } else {
                        putDown.add(pList.remove(i));
                   }
                }
                if(!humanMove(putDown, pList)) {
                    System.out.println();
                    System.out.println("No valid moves, draw from boneyard");
                }
             break;
        }
        return true;
    }

    /*Checks to see a move you the player makes is valid or not*/
    public static boolean humanMove(List<Domino> putDown, List<Domino> pList) {
        int addOne = 1;
        for(int k = 0; k < pList.size() - 1; k++) {
            if(putDown.get(0).getOne() == pList.get(k).getOne() || putDown.get(0).getOne() == 0 || pList.get(k).getOne() == 0) {
                return true;
            } else if (putDown.get(0).getOne() == pList.get(k).getTwo() || putDown.get(0).getOne() == 0 || pList.get(k).getTwo() == 0) {
                return true;
            } else if (putDown.get(putDown.size() - 1).getTwo() == pList.get(k).getOne() || putDown.get(putDown.size() - 1).getTwo() == 0 || pList.get(k).getOne() == 0) {
                return true;
            } else if(putDown.get(putDown.size() - 1).getTwo() == pList.get(k).getTwo() || putDown.get(putDown.size() - 1).getTwo() == 0 || pList.get(k).getTwo() == 0) {
                return true;
            }
        }
        return false;
    }

    /*This method checks if any domino numbers match any of those in the play area,
    * if they do, then it returns true. If not then false.*/
    public static boolean compMove(List<Domino> putDown, List<Domino> cList) {
        for(int j = 0; j < cList.size() - 1; j++) {
            if(putDown.get(0).getOne() == cList.get(j).getOne() || putDown.get(0).getOne() == 0 || cList.get(j).getOne() == 0) {
                return true;
            }
            else if((putDown.get(0).getOne() == cList.get(j).getTwo()) || putDown.get(0).getOne() == 0 || cList.get(j).getTwo() == 0) {
                return true;
            }
            else if(putDown.get(putDown.size() - 1).getTwo() == cList.get(j).getTwo() || putDown.get(putDown.size() - 1).getTwo() == 0 || cList.get(j).getTwo() == 0) {
                return true;
            }
            else if(putDown.get(putDown.size() - 1).getTwo() == cList.get(j).getOne() || putDown.get(putDown.size() - 1).getTwo() == 0 || cList.get(j).getOne() == 0) {
                return true;
            }
        }
        return false;
    }

    /*This method compares the numbers of each domino in the
    * computer tray and checks whether they match with another
    * domino already in the main play area. If so, it will place them
    * in the main game area.*/
    public static void myFirst(List<Domino> putDown, List<Domino> cList) {
        int addOne = 1;
        while(!compMove(putDown, cList) && !myList.isEmpty()) {
            cList.addAll(player.computerTray(myList, addOne));
        }
            for (int i = 0; i < cList.size() - 1; i++) {
                if (putDown.get(0).getOne() == cList.get(i).getOne() ||  putDown.get(0).getOne() == 0 || cList.get(i).getOne() == 0) {
                    cList.get(i).Swap();
                    putDown.add(0, cList.remove(i));
                    return;
                } else if (putDown.get(0).getOne() == cList.get(i).getTwo() ||  putDown.get(0).getOne() == 0 || cList.get(i).getTwo() == 0) {
                    putDown.add(0, cList.remove(i));

                    return;
                } else if (putDown.get(putDown.size() - 1).getTwo() == cList.get(i).getOne() ||  putDown.get(putDown.size() - 1).getTwo() == 0 || cList.get(i).getOne() == 0) {
                    putDown.add(cList.remove(i));

                    return;
                } else if (putDown.get(putDown.size() - 1).getTwo() == cList.get(i).getTwo() ||  putDown.get(putDown.size() - 1).getTwo() == 0 || cList.get(i).getTwo() == 0) {
                    cList.get(i).Swap();
                    putDown.add(cList.remove(i));

                    return;
                }
            }
        }

    /*This method takes the selected domino's from both the human
    * and the computer players and puts them into a list. This method
    * then prints them out in a staggered fashion.*/
    public static void theGame(List<Domino> putDown) {

        for(int i = 0; i < putDown.size(); i++) {
            if (i % 2 == 0) {
                System.out.print("[" + putDown.get(i).getOne() + "  " + putDown.get(i).getTwo() + "]");
            }
        }
        System.out.println();
        System.out.print("   ");
            for(int j = 0; j < putDown.size(); j++) {
            if(j % 2 == 1) {
                System.out.print("[" + putDown.get(j).getOne() + "  " + putDown.get(j).getTwo() + "]");
            }
        }
            System.out.println();
    }

    /*Adds up left and right number of each domino in
    * the players tray*/
    public static int trackScore(List<Domino> pList) {
        int playCount = 0;

        for (Domino p : pList) {
            playCount += p.getOne() + p.getTwo();
        }
        return playCount;
    }

    /*Adds up left and right numbers of each domino
    * in the computers tray*/
    public static int trackComp(List<Domino> cList) {
        int playCount = 0;
        for(Domino c : cList) {
            playCount += c.getOne() + c.getTwo();
        }
        return playCount;
    }


    /*This method is purely for the sake of keeping
    * the while loop running*/
    public static boolean gameOver() {

            return false;
    }


}
