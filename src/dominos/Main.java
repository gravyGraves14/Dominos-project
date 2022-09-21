package dominos;

import java.sql.PseudoColumnUsage;
import java.util.*;

import static java.lang.System.lineSeparator;

public class Main {

    static List<Domino> myList = new ArrayList<>();
    static List<Domino> pList = new ArrayList<>();
    static List<Domino> cList = new ArrayList<>();
    static Deque<Domino> pPlaceList = new ArrayDeque<>();
    static Deque<Domino> cPlaceList = new ArrayDeque<>();

    static List<Domino> putDown = new ArrayList<>();

    static Player player = new Player();
    static int first;
    static int second;


    public static void main(String[] args) {

        /* Here I'm just testing whether or not I can pull 7 random dominos from my yard class that has
         * the addDom() method. I can but instead of giving me the number of each domino it's just giving
         * me the address of them. So it is sort of working but I need to find a way to make it give me their
         * numbers. */

        Yard myYard = new Yard(myList);
        int numElements = 7;
        int sameNum = 7;


        Scanner scnr = new Scanner(System.in);



        Player comp = new Player();

        System.out.println("Dominos!");

        char input;

        System.out.println();


        pList.addAll(player.tray(myList, numElements));
        cList.addAll(player.computerTray(myList, sameNum));

       // theGame(putDown);
        System.out.println();


        int addOne = 1;

        while (!gameOver(myList)) {
            String newLine = System.getProperty(lineSeparator());

            System.out.println("Computer has " + cList.size() + " dominos");
            System.out.println("Computer Tray" + cList);
            System.out.println("Boneyard contains " + myList.size() + " dominos");
            System.out.println();

            theGame(putDown);
            System.out.println();

            System.out.println("Tray: " + pList);


            /*if(your turn) {
            then enter this switch statement*/

            System.out.println("[p] Play Domino");
            System.out.println("[d] Draw from boneyard");
            System.out.println("[q] Quit");

            input = scnr.next().charAt(0);


            switch (input) {

                case 'p' -> {
                    if (playerTrayList(pList)) {


                        myFirst(putDown, cList);
                        System.out.println();
                        System.out.println("Your score is: " + trackScore(pPlaceList));
                    }
                }
                case 'd' -> {
                    System.out.println("Drawing from Boneyard");
                    pList.addAll(player.tray(myList, addOne)); //Working with this on player
                }
                case 'q' -> System.exit(0);

            }
            System.out.println();
        }
    }


    public static boolean playerTrayList(List<Domino> pList) {
        int i;
        char input;


        /*Might need to change putDown back to pPlaceList*/

        System.out.println("Which Domino?");
        Scanner scanner = new Scanner(System.in);
        Scanner numScan = new Scanner(System.in);
        Scanner nextScan =  new Scanner(System.in);




            for (i = 0; i < pList.size() - 1; i++) {
                //pList.get(i);

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
                    System.out.println("No valid moves draw");
                }
                break;

        }


        return true;
    }

    public static boolean humanMove(List<Domino> putDown, List<Domino> pList) {
        int addOne = 1;
        for(int k = 0; k < pList.size() - 1; k++) {
            if(putDown.get(0).getOne() == pList.get(k).getOne()) {
                return true;
            } else if (putDown.get(0).getOne() == pList.get(k).getTwo()) {
                return true;
            } else if (putDown.get(putDown.size() - 1).getTwo() == pList.get(k).getOne()) {
                return true;
            } else if(putDown.get(putDown.size() - 1).getTwo() == pList.get(k).getTwo()) {
                return true;
            }
        }
        return false;
    }

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

    public static void myFirst(List<Domino> putDown, List<Domino> cList) {
        int addOne = 1;
        if(!compMove(putDown, cList)) {
            cList.addAll(player.computerTray(myList, addOne));
        } else {
            for (int i = 0; i < cList.size() - 1; i++) {
                if (putDown.get(0).getOne() == cList.get(i).getOne() ||  putDown.get(0).getOne() == 0 || cList.get(i).getOne() == 0) {
                    cList.get(i).Swap();
                    putDown.add(0, cList.remove(i));
                    return;
                } else if (putDown.get(0).getOne() == cList.get(i).getTwo() ||  putDown.get(0).getOne() == 0 || cList.get(i).getTwo() == 0) {
                    putDown.add(0, cList.remove(i));
                    return;
                } else if (putDown.get(putDown.size() - 1).getTwo() == cList.get(i).getOne() ||  putDown.get(putDown.size() - 1).getOne() == 0 || cList.get(i).getOne() == 0) {
                    putDown.add(cList.remove(i));
                    return;
                } else if (putDown.get(putDown.size() - 1).getTwo() == cList.get(i).getTwo() ||  putDown.get(putDown.size() - 1).getOne() == 0 || cList.get(i).getTwo() == 0) {
                    cList.get(i).Swap();
                    putDown.add(cList.remove(i));
                    return;
                }

                System.out.println("Computer is placing " + "[" + putDown.get(i).getOne() + " " + putDown.get(i).getTwo());

            }
        }

    }

    public static void theGame(List<Domino> putDown) {

        for(int i = 0; i < putDown.size(); i++) {
            if (i % 2 == 0) {
                System.out.print("[" + putDown.get(i).getOne() + "  " + putDown.get(i).getTwo() + "]");
            }
            i++;
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
    public static int trackScore(Deque<Domino> pPlaceList) {
        int playCount = 0;
        int p1;
        int p2;
        for(Domino p : pPlaceList) {
            p1 = p.getOne();
            p2 = p.getTwo();

            playCount = p1 + p2;
            playCount++;
        }
        return playCount;
    }


    /*This method will determine if the boneyard is empty.
     * If it is, the game will end. I need more fucntionallity in here
     * such as both players choose not to put down dominos*/
    public static boolean gameOver(List<Domino> myList) {
        return myList.isEmpty();
    }


}
