package turk;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        turk ti = new Turki();
        notTurk nt = new notTurki();
        notTurk adapt = new adapter(ti);
        List<notTurk> list = new ArrayList<>();

        list.add(nt);
        list.add(adapt);

        for (notTurk n : list){
            n.eatdurum();
            n.livingInGermany();
            System.out.println();
        }

    }
}
