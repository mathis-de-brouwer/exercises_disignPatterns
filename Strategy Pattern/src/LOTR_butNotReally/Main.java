package LOTR_butNotReally;

import LOTR_fake_notgood.Character;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Characters k = new King();
        Characters d = new Dwarfism();
        List<Characters> c = new ArrayList<>();

        c.add(k);
        c.add(d);

        for (Characters ch : c ){
            ch.fight();
            System.out.println("------");
        }

        c.get(1).changeWp(new BowEArrow());

        for (Characters ch : c ){
            ch.fight();
            System.out.println("------");
        }
    }
}
