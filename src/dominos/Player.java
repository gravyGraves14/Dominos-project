package dominos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Player {

    List<Domino> pList = new ArrayList<>();

    Yard pYard = new Yard(pList);

    /*Where the domino's are randomly generated for the human tray*/
    public List<Domino> tray(List<Domino> pList, int amount) {
        List<Domino> p1L = new ArrayList<>();
        p1L.addAll(pYard.getRandomElement(pList, amount));

        return p1L;
    }

    /*Where the dominos are generated for the computer tray*/
    public List<Domino> computerTray(List<Domino> pList, int amount) {

        List<Domino> cList = new ArrayList<>();
        cList.addAll(pYard.getRandomElement(pList, amount));

        return cList;
    }

}
