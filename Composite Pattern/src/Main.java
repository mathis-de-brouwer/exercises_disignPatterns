import Menu.*;
import PhotoLibrary.*;

import javax.sound.sampled.FloatControl;


public class Main {
    public static void main(String[] args) {
        PhotoComponents one = new Photo("photo one");
        PhotoComponents two = new Photo("photo two");
        PhotoComponents three = new Photo("photo three");

        Location l1 = new Location("Bruxelles");
        Location l2 = new Location("Paris");
        Location l3 = new Location("Belgique");
        Location l4 = new Location("France");
        Location l5 = new Location("Europe");

        l1.add(one);
        l1.add(three);
        l2.add(two);
        l3.add(l1);
        l4.add(l2);
        l5.add(l3);
        l5.add(l4);

        l5.print();





//        MenuComponent m1 = new MenuItem("m1", "emme un", 3);
//        MenuComponent m2 = new MenuItem("m2", "emme deux", 2);
//        MenuComponent m3 = new MenuItem("m3", "emme trois", 5);
//        MenuComponent m4 = new MenuItem("m4", "emme quatre", 15);
//        Menu m = new Menu("EMME", "descr");
//
//        m.add(m1);
//        m.add(m2);
//        m.add(m3);
//        m.add(m4);
//
//        m.print();



    }
}