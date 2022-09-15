package dominos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Yard {

    //Zero set
    List<Domino> alist = new ArrayList<>();
    public Yard(List<Domino> aList) {



        this.alist = aList;
    Domino D0 = new Domino(0, 0);
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

    Domino D27 = new Domino(6, 6);

        Collections.addAll(aList,D0,D1,D2,D3,D4,D5,D6,D7,D8,D9,D10,
    D11,D12,D13,D14,D15,D16,D17,D18,D19,D20,D21,D22,D23,D24,D25,D26,D27);

}
    

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
    
    public List<Domino> getRandomElement(List<Domino> alist, int totalItems) {

        Random rand = new Random();

        List<Domino> newList = new ArrayList<>();
        for (int i = 0; i < totalItems; i++) {

            int randomIndex = rand.nextInt(alist.size());
            newList.add(alist.get(randomIndex));

            alist.remove(randomIndex);
           // System.out.println("Index size is: " + list.size() + " ");

        }
//        System.out.println(newList);
//        System.out.println(alist);
        return newList;
    }

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

