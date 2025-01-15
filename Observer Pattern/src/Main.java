import Olympics.*;
import Olympics.Observer;

import Weatherstation.*;


public class Main {
    public static void main(String[] args) {

        CentralizedSystem cs = new CentralizedSystem();
        Observer ai = new AthleteIntranet(cs);
        Observer pi = new PressIntranet(cs);
        Observer ew = new EventWebsite(cs);
        Observer ji = new JudgeIntranet(cs);

        cs.registerObserver(ai);
        cs.registerObserver(pi);
        cs.registerObserver(ew);
        cs.registerObserver(ji);

        cs.setData(30, "profiling", "10/10");

        cs.removeObserver(ai);




//        Weatherdata wd = new Weatherdata();
//        Observer sm = new Smartphone();
//        Observer tb = new Tablet();
//        wd.registerObserver(sm);
//        wd.registerObserver(tb);
//        wd.setMesurements(22, 43,23);
//        wd.removeObserver(sm);
//        wd.setMesurements(34, 101, 1010);
    }
}