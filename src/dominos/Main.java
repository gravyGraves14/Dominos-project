package dominos;

public class Main {

    public static void main(String[] args) {

        /* Here I'm just testing whether or not I can pull 7 random dominos from my yard class that has
        * the addDom() method. I can but instead of giving me the number of each domino it's just giving
        * me the address of them. So it is sort of working but I need to find a way to make it give me their
        * numbers. */

        Yard myYard = new Yard();
        int numElements = 7;

        myYard.addDom();

        System.out.println(myYard.getRandomElement(myYard.addDom(), numElements));
    }
}
