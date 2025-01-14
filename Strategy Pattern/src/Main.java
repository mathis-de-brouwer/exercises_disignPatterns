import ducking.*;
import LOTR.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Charakter> chr = new ArrayList<>();
        chr.add(new King());
        chr.add(new Dwarf());
        chr.add(new Elf());
        chr.add(new Hobbit());

        for (Charakter charakter : chr){
            charakter.display();
        }




//        List<Duck> ducks = new ArrayList<>();
//        ducks.add(new MallardDuck());
//        ducks.add(new RedHeadDuck());
//        ducks.add(new FakeDuck());
//        ducks.add(new DecoyDuck());
//
//        for (Duck duck : ducks){
//            duck.display();
//            duck.swim();
//            duck.performFly();
//            duck.performQuack();
//            System.out.println();
//        }
//
//        ducks.get(0).setFb(new FlyNoWay());
//        ducks.get(3).setQb(new Quack());
//
//        System.out.println("after changes");
//        for (Duck duck : ducks){
//            duck.display();
//            duck.swim();
//            duck.performFly();
//            duck.performQuack();
//            System.out.println();
//        }

    }
}