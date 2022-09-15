package dominos;

import java.util.ArrayList;
import java.util.List;

public class Player {

    int first, second;

    List<Domino> pList = new ArrayList<>();
    Domino aD = new Domino(first, second);
    Yard pYard = new Yard(pList);


    /*Figure this out before moving on*/
    public List<Domino> tray(List<Domino> pList, int amount) {
        List<Domino> p1L = new ArrayList<>();
        p1L.addAll(pYard.getRandomElement(pList, amount));

        return p1L;
    }

    public List<Domino> computerTray(List<Domino> pList, int amount) {
        List<Domino> cList = new ArrayList<>();
        cList.addAll(pYard.getRandomElement(pList, amount));

        return cList;
    }


   /*public void update(int amount) {
        List<Domino> ppList = new ArrayList<>();
        computerTray(ppList, amount);

        int size = ppList.size();
        System.out.println(size);

   }*/
}
