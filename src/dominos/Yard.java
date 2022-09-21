package dominos;

import java.util.*;

public class Yard {

    public static List<Domino> aList = new ArrayList<>();

    static int first;
    static int second;

    static Domino D0 = new Domino(0, 0);
    static Domino D1 = new Domino(0, 1);
    static Domino D2 = new Domino(0, 2);
    static Domino D3 = new Domino(0, 3);
    static Domino D4 = new Domino(0, 4);
    static Domino D5 = new Domino(0, 5);
    static Domino D6 = new Domino(0, 6);
    static Domino D7 = new Domino(1, 1);
    static Domino D8 = new Domino(1, 2);
    static Domino D9 = new Domino(1, 3);
    static Domino D10 = new Domino(1, 4);
    static Domino D11 = new Domino(1, 5);
    static Domino D12 = new Domino(1, 6);

    static Domino D13 = new Domino(2, 2);
    static Domino D14 = new Domino(2, 3);
    static Domino D15 = new Domino(2, 4);
    static Domino D16 = new Domino(2, 5);
    static Domino D17 = new Domino(2, 6);

    static Domino D18 = new Domino(3, 3);
    static Domino D19 = new Domino(3, 4);
    static Domino D20 = new Domino(3, 5);
    static Domino D21 = new Domino(3, 6);

    static Domino D22 = new Domino(4, 4);
    static Domino D23 = new Domino(4, 5);
    static Domino D24 = new Domino(4, 6);

    static Domino D25 = new Domino(5, 5);
    static Domino D26 = new Domino(5, 6);

    static Domino D27 = new Domino(6, 6);


    //Zero set


 /*public List<Domino> add() {
    *//*aList.add(D0);
    aList.add(D1);
    aList.add(D2);
    aList.add(D3);
    aList.add(D4);
    aList.add(D5);
    aList.add(D6);
    aList.add(D7);
    aList.add(D8);
    aList.add(D9);
    aList.add(D10);
    aList.add(D11);
    aList.add(D12);
    aList.add(D13);
    aList.add(D14);
    aList.add(D15);
    aList.add(D16);
    aList.add(D17);
    aList.add(D18);
    aList.add(D19);
    aList.add(D20);
    aList.add(D21);
    aList.add(D22);
    aList.add(D23);
    aList.add(D24);
    aList.add(D25);
    aList.add(D26);
    aList.add(D27);*//*

     Collections.addAll(aList, D0,D1,D2,D3,D4,D5,D6,D7,D8,D9,D10,
             D11,D12,D13,D14,D15,D16,D17,D18,D19,D20,D21,D22,D23,D24,D25,D26,D27);

     return aList;
}*/



    public Yard(List<Domino> aList) {
        this.aList = aList;
        /*Domino D0 = new Domino(0, 0);
         Domino D1 = new Domino(0, 1);
         Domino D2 = new Domino(0, 2);
         Domino D3 = new Domino(0, 3);
         Domino D4 = new Domino(0, 4);
         Domino D5 = new Domino(0, 5);
         Domino D6 = new Domino(0, 6);
         Domino D7 = new Domino(1, 1);
         Domino D8 = new Domino(1, 2);
         Domino D9 = new Domino(1, 3);
         Domino D10 = new Domino(1, 4);
         Domino D11 = new Domino(1, 5);
         Domino D12 = new Domino(1, 6);

         Domino D13 = new Domino(2, 2);
         Domino D14 = new Domino(2, 3);
         Domino D15 = new Domino(2, 4);
         Domino D16 = new Domino(2, 5);
         Domino D17 = new Domino(2, 6);

         Domino D18 = new Domino(3, 3);
         Domino D19 = new Domino(3, 4);
         Domino D20 = new Domino(3, 5);
         Domino D21 = new Domino(3, 6);

         Domino D22 = new Domino(4, 4);
         Domino D23 = new Domino(4, 5);
         Domino D24 = new Domino(4, 6);

         Domino D25 = new Domino(5, 5);
         Domino D26 = new Domino(5, 6);

         Domino D27 = new Domino(6, 6);*/

        Collections.addAll(aList,D0,D1,D2,D3,D4,D5,D6,D7,D8,D9,D10,
    D11,D12,D13,D14,D15,D16,D17,D18,D19,D20,D21,D22,D23,D24,D25,D26,D27);

}

    /*public List<Domino> putDoms(List<Domino> aList) {
        aList.addAll(D0,D1,D2,D3,D4,D5,D6,D7,D8,D9,D10,
                D11,D12,D13,D14,D15,D16,D17,D18,D19,D20,D21,D22,D23,D24,D25,D26,D27);

        return aList;
    }*/
    

    /*When I called yard.addDom() in main it didn't work, and it made me
    * chanve addDom() from void to return a list to work. That managed to work
    * but like I said in the main class, it is only returning the addresses*/
   /* public List<Domino> addDom() {
        List<Domino> myList = new ArrayList<>();
        Collections.addAll(myList, D0, D1, D2, D3, D4, D5, D6, D7, D8, D9, D10,
                D11, D12, D13, D14, D15, D16, D17, D18, D19, D20, D21, D22, D23, D24, D25, D26, D27);

        String listString = myList.toString();

        return myList;
    }*/

    public List<Domino> getRandomElement(List<Domino> aList, int totalItems) {

        Random rand = new Random();

        List<Domino> newList = new ArrayList<>();
        for (int i = 0; i < totalItems; i++) {

            int randomIndex = rand.nextInt(aList.size());
            newList.add(aList.get(randomIndex));

            aList.remove(randomIndex);
            //System.out.println("Index size is: " + list.size() + " ");

        }
//        System.out.println(newList);
//        System.out.println(alist);
        return newList;
    }


    /*public static Domino getDominoF(List<Domino> aList) {
        Domino one = new Domino(first, second);
        int i = 0;
        int count = 0;
        int first, second;
        for(Domino o : aList) {
            // aList.get(i).getFirst();
            //aList.get(i).getSecond();
            //return domino.getFirst();
            // o.getFirst();
            if (!aList.isEmpty()) {
                System.out.print(" (1) [" + o + "] ");

            }

            System.out.println();
            for (Domino b : aList) {
                if(b.getFirst() == o.getSecond())
                System.out.print("     (2)  [" + b + "] ");
            }
        }

        return one;
        //return aList.get(i).getFirst();

    }*/

  /*  public static int getDominoS(List<Domino> aList) {
        int i;
        for (i = 0; i < aList.size() - 1; i++) {
            if(aList.get(i).getSecond() == aList.get(i).getFirst()) {
                System.out.print("[" + aList.get(i).getFirst() +  "  ," + "]");
                System.out.println();
                System.out.print("[" + "  ," + aList.get(i).getSecond() + "]");
            }
        }
        return aList.get(i).getSecond();
    }*/

   /* public static void main(String[] args) {


        //add();
        //System.out.println(getDominoF(aList));
        getDominoF(aList);
        System.out.println();
       //getDominoS(aList);
    }*/

    /*Trying to find a way to delete the initial 7 items that each player
    * get at the very beginning. Still don't know if this is the best place
    * for it. Not even sure if it will work*/
     /*public boolean calledDoms() {

        int totalItems = 7;

        if(calledDoms()) {
            alist.remove(getRandomElement(alist, totalItems));
            System.out.println(alist);

        }
        return false;
    }*/



}

