package dominos;

import java.util.Comparator;

public class Domino {
    private int first;
    private int second;
    
    Domino(int first, int second) {
        this.first = first;
        this.second = second;
    }

    public int getFirst() {
        return this.first;
    }

    public int getSecond() {
        return this.second;
    }

    public String toString() {
        return "[" +first + "  " + second + "]";

    }

}
