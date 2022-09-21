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


    public Yard(List<Domino> aList) {
        this.aList = aList;


        Collections.addAll(aList,D0,D1,D2,D3,D4,D5,D6,D7,D8,D9,D10,
    D11,D12,D13,D14,D15,D16,D17,D18,D19,D20,D21,D22,D23,D24,D25,D26,D27);

}
    

    public List<Domino> getRandomElement(List<Domino> aList, int totalItems) {

        Random rand = new Random();

        List<Domino> newList = new ArrayList<>();
        for (int i = 0; i < totalItems; i++) {

            int randomIndex = rand.nextInt(aList.size());
            newList.add(aList.get(randomIndex));

            aList.remove(randomIndex);

        }
        return newList;
    }

}

