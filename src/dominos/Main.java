package dominos;

import java.util.*;

public class Main {


    static List<Domino> myList = new ArrayList<>();
    static List<Domino> pList = new ArrayList<>();
    static List<Domino> cList = new ArrayList<>();

    static List<Domino> pPlaceList = new ArrayList<>();
    static List<Domino> cPlaceList = new ArrayList<>();

    static int first;
    static int second;

    static Domino one = new Domino(first, second);
    static Domino two = new Domino(first, second);


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

        while (!gameOver(myList)) {

            System.out.println("Computer has " + cList.size() + " dominos");
            System.out.println("Boneyard contains " + myList.size() + " dominos");
            System.out.println();
            System.out.println("    " + cPlaceList);
            System.out.println(pPlaceList);
            System.out.println();

            // System.out.println(playerTrayList(pList, numScan));


            System.out.println("Tray: " + pList);


            /*if(your turn) {
            then enter this switch statement
            }*/

            System.out.println("[p] Play Domino");
            System.out.println("[d] Draw from boneyard");
            System.out.println("[q] Quit");

            input = scnr.next().charAt(0);

            switch (input) {

                case 'p' -> {
                     if(playerTrayList(pList)) {

                         /*if(playerTrayList(pList, one, two))  Working with this on plyaer Class */
                         //matching(one, two);
                         computerTrayList(cList);
                         System.out.println("First Element is: " + pList.equals(one.getFirst()));
                         System.out.println("Second Element is: " + cList.equals(one.getFirst()));
                         System.out.println(pList.get(one.getFirst()));
                     }
                }
                case 'd' -> {
                    System.out.println("Drawing from Boneyard");
                   // pList.addAll(player.tray(myList, addOne)); Working with this on player
                }
                case 'q' -> System.exit(0);

            }
        }
    }

    public static boolean playerTrayList(List<Domino> pList) {
        int i;
        int j;

        System.out.println("Which Domino?");
        Scanner scanner = new Scanner(System.in);

        for (i = 0; i < pList.size(); i++) {
            pList.get(i).equals(one.getSecond());
        }
        i = scanner.nextInt();

        //System.out.println(pList.get(i));//This line is just testing to see correct index
        pPlaceList.add(pList.remove(i));
        //System.out.println(pList.get(i).getFirst());

       /*for(j = 0; j < cList.size() - 1; j++) {
            cList.get(j).equals(two.getFirst());

            if (cList.get(j).equals(pPlaceList)) {
                cPlaceList.add(cList.remove(j));
            }
        }*/
        return true;


    }


    public static void computerTrayList(List<Domino> cList) {
        int j;
            Random rand = new Random();
            int randIndex = rand.nextInt(cList.size());
            cList.get(randIndex);
            cPlaceList.add(cList.remove(randIndex));

    }




    /*public static void compare(List<Domino> pPlaceList, List<Domino> cList) {
        int i;
        int j;


        for (i = 0; i < pPlaceList.size() - 1; i++) {
            pPlaceList.get(i).getSecond();
            for (j = 0; j < cList.size() - 1; j++) {
                cList.get(j).getFirst();
            }
            if (pPlaceList.get(i).getSecond() == cList.get(j).getFirst()) {
                cPlaceList.add(cList.remove(j));
        }

        }

    }*/

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
