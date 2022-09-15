package dominos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {






    public static void main(String[] args) {

        /* Here I'm just testing whether or not I can pull 7 random dominos from my yard class that has
         * the addDom() method. I can but instead of giving me the number of each domino it's just giving
         * me the address of them. So it is sort of working but I need to find a way to make it give me their
         * numbers. */


        List<Domino> myList = new ArrayList<>();
        List<Domino> pList = new ArrayList<>();
        List<Domino> cList = new ArrayList<>();
        Yard myYard = new Yard(myList);
        int numElements = 7;
        int sameNum = 7;
        int i;



        /*System.out.println(myYard.getRandomElement(myList, numElements));
        System.out.println(myYard.getRandomElement(myList, sameNum));*/

        Scanner scnr = new Scanner(System.in);

        Player player = new Player();
        Player comp = new Player();

        System.out.println("Dominos!");

        char input;

        //comp.computerTray(myList, sameNum);


        System.out.println();

        //size = myList.size();
        //player.tray(myList, numElements);


        pList.addAll(player.tray(myList, numElements));
        cList.addAll(player.computerTray(myList, sameNum));

        for (i = 0; i <= cList.size(); i++) {
            cList.size();
        }

        int addOne = 1;


        while(!gameOver(myList)) {

            System.out.println("Computer has " + cList.size() + " dominos");
            System.out.println("Boneyard contains " + myList.size() + " dominos");
            System.out.println();
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
                        System.out.println("Playing domino");
//                    player.update(7);
                    }
                    case 'd' -> {
                        System.out.println("Drawing from Boneyard");
                        pList.addAll(player.tray(myList, addOne));
                    }
                    case 'q' -> System.exit(0);


                }

            }



        }


    public void playerTrayList() {

    }

    /*This method will determine if the boneyard is empty.
    * If it is, the game will end. I need more fucntionallity in here
    * such as both players choose not to put down dominos*/
    public static boolean gameOver(List<Domino> myList) {
        return myList.isEmpty();
    }
}
