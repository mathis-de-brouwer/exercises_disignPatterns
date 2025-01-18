package ducking2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Duck md = new MallardDuck();
        Duck rd = new RedNeckDuck();
        List<Duck> ducks = new ArrayList<>();
        ducks.add(md);
        ducks.add(rd);
        for (Duck d : ducks){
            d.display();
            d.makeFly();
            d.makeQuack();
            System.out.println("--------------------");
        }

        ducks.get(0).setFb(new FlyNoWay());

        for (Duck d : ducks){
            d.display();
            d.makeFly();
            d.makeQuack();
            System.out.println("--------------------");
        }

    }
}
