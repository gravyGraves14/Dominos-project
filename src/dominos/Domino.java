package dominos;

import java.util.Comparator;

public class Domino {
    private int one;
    private int two;
    
    Domino(int one, int two) {
        this.one = one;
        this.two = two;
    }

    public void Swap() {

        int temp = one;
        one = two;
        two = temp;
    }

    public int getOne() {
        return this.one;
    }

    public int getTwo() {
        return this.two;
    }


    public String toString() {
        return "[" + one + "  " + two + "]";

    }

}
