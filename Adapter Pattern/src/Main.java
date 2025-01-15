import Turkey.Duck;
import Turkey.MallardDuck;
import Turkey.Turkeyadapter;
import Turkey.WildTurkey;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Duck> ducks = new ArrayList<>();

        ducks.add(new MallardDuck());
        ducks.add(new Turkeyadapter(new WildTurkey()));
        for (Duck d : ducks){
            d.quack();
            d.fly();
            System.out.println();
        }

    }
}