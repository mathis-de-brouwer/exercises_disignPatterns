import StarBuzz.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Beverage b = new DarkRoast();
        b = new Mocha(b);
        b = new Milk(b);

        Beverage a = new HouseRoast();
        a = new Milk(a);

        System.out.println(b.getDescription() +", $ "+b.getCost());
        System.out.println(a.getDescription() +", $ "+a.getCost());

    }
}