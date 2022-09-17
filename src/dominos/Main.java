package dominos;

import java.sql.PseudoColumnUsage;
import java.util.*;

public class Main {


    static List<Domino> myList = new ArrayList<>();
    static List<Domino> pList = new ArrayList<>();
    static Deque<Domino> cList = new ArrayDeque<>();

    static Deque<Domino> pPlaceList = new ArrayDeque<>();
    static Deque<Domino> cPlaceList = new ArrayDeque<>();

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


        /*System.out.println(myYard.getRandomElement(myList, numElements));
        System.out.println(myYard.getRandomElement(myList, sameNum));*/

        Scanner scnr = new Scanner(System.in);
        Scanner numScan = new Scanner(System.in);

        Player player = new Player();
        Player comp = new Player();

        System.out.println("Dominos!");

        char input;

        //comp.computerTray(myList, 7);


        System.out.println();

        //size = myList.size();
        //player.tray(myList, numElements);


        pList.addAll(player.tray(myList, numElements));
        cList.addAll(player.computerTray(myList, sameNum));

        int addOne = 1;

        //getDominoF(myList);

        while (!gameOver(myList)) {

            System.out.println("Computer has " + cList.size() + " dominos");
            System.out.println("Computer Tray" + cList);
            System.out.println("Boneyard contains " + myList.size() + " dominos");
            System.out.println();
            System.out.println("    " + cPlaceList);
            System.out.println(pPlaceList);
            System.out.println();

            // System.out.println(playerTrayList(pList, numScan));


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

                         /*System.out.println("Rotate y/n");
                         if(input != 'n') {
                             for(Domino o : pPlaceList) {
                                 o.g
                             }
                         }*/

                        // getCompDom(cList, pPlaceList);
                         //Working with this on plyaer Class
                         //matching(one, two);
                         //computerTrayList(cList);
                         System.out.print("Dom 1 Element 1: ");
                         myFirst(pPlaceList, cList);
                         System.out.println();
                         //System.out.println(pList.get(one.getFirst()));
                     }
                }
                case 'd' -> {
                    System.out.println("Drawing from Boneyard");
                    pList.addAll(player.tray(myList, addOne)); //Working with this on player
                    cList.addAll(player.computerTray(myList, addOne));
                }
                case 'q' -> System.exit(0);

            }
        }
    }



    public static boolean playerTrayList(List<Domino> pList) {
        int i;
        char input;


        System.out.println("Which Domino?");
        Scanner scanner = new Scanner(System.in);
        Scanner cScanner = new Scanner(System.in);

            /*for (i = 0; i < pList.size(); i++) {
                pList.get(i);
            }*/
            i = scanner.nextInt();
            pPlaceList.add(pList.remove(i));

            System.out.println("Rotate y/n");
            input = scanner.next().charAt(0);
            if(input == 'y') {
                for(Domino p : pPlaceList) {
                    /*int one = p.getFirst();
                    int two = p.getSecond();
                    int temp = one;
                    one = two;
                    two = temp;*/

                    p.Swap();

                }

            }

        return true;


    }



   /* public static void computerTrayList(List<Domino> cList) {
        int j;
            Random rand = new Random();
            int randIndex = rand.nextInt(cList.size());
            cList.get(randIndex);
            cPlaceList.add(cList.remove(randIndex));

    }*/


    /*public static int getCompDom(List<Domino> cList, List<Domino> pPlaceList) {
        int i;
        for(Domino p : pPlaceList) {
            for(i = 0; i < cList.size(); i++) {
                 for (Domino c : cList) {
                if (c.getFirst() == p.getSecond()) {
                    cList.get(i).getSecond();
                    cPlaceList.add(cList.remove(i));
                }
                }
            }
        }


        return 0;
        //return aList.get(i).getFirst();

    }*/

    public static void myFirst(Deque<Domino> pPlaceList, Deque<Domino> cList) {

        for(Domino c : cList) {
            //c.getFirst();
            for(Domino p : pPlaceList) {
                  System.out.print(" [" + p.getFirst() + "] ");
                    if (c.getFirst() == p.getSecond()) {

                        cList.remove(c);
                        cPlaceList.add(c);
                        return;

                } else if(c.getFirst() != p.getSecond() && c.getSecond() == p.getSecond()) {

                        c.Swap();
                        cList.remove(c);
                        cPlaceList.add(c);
                        return;
                    }
                   // break;

            }
            /*With this break above blocked out, it sort of
            * works but i'll jump in increments of two sometimes three*/
        }
    }


    /*This method will determine if the boneyard is empty.
     * If it is, the game will end. I need more fucntionallity in here
     * such as both players choose not to put down dominos*/
    public static boolean gameOver(List<Domino> myList) {
        return myList.isEmpty();
    }

    /*@Override
    public int compare(Domino one, Domino two) {
        for (int i = 0; i < cList.size(); i++) {
            cList.get(i);

            if (two.getFirst() == one.getSecond()) {
                cPlaceList.add(cList.remove(i));
                return 0;
            }
        }
            return -1;
    }*/
}
