package Macudonaludo;

import StarBuzz.Beverage;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Beverages dr = new DarkRoast();
        Beverages mr = new McRoast();
        condimenTing m = new Miluku(dr);
        condimenTing mo = new Mocha(m);

        List<Beverages> items = new ArrayList<>();
        items.add(dr);
        items.add(mr);
        items.add(m);
        items.add(mo);
        for (Beverages b : items){
            System.out.println(b.getDesription());
            System.out.println(b.getPrice());
        }
    }
}
