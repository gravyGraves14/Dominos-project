package dominos;

public class Domino {
    private int first;
    private int second;
    
    Domino(int first, int second) {
        this.first = first;
        this.second = second;
    }

    public String toString() {
        return "[" +first + "  " + second + "]";

    }

}
