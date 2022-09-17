package dominos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Player {

    int first, second;

    List<Domino> pList = new ArrayList<>();
    //List<Domino> cList = new ArrayList<>();
    //Domino pD = new Domino(first, second);
    //Domino cD = new Domino(first, second);

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

    /*public boolean playerList(List<Domino> pList, Domino pD) {
        int i;
        System.out.println("Which Domino?");
        Scanner scanner = new Scanner(System.in);

        for (i = 0; i < pList.size(); i++) {
            pList.get(i).equals(pD.getSecond());
        }
        i = scanner.nextInt();

        //System.out.println(pList.get(i));//This line is just testing to see correct index
        pPlaceList.add(pList.remove(i));
        //System.out.println(pList.get(i).getFirst());
    }*/


   /*public void update(int amount) {
        List<Domino> ppList = new ArrayList<>();
        computerTray(ppList, amount);

        int size = ppList.size();
        System.out.println(size);

   }*/
}
