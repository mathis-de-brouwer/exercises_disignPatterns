import Weatherstation.*;

public class Main {
    public static void main(String[] args) {
        Weatherdata wd = new Weatherdata();
        Smartphone sm = new Smartphone();
        Tablet tb = new Tablet();
        wd.registerObserver(sm);
        wd.registerObserver(tb);
        wd.setMesurements(22, 43,23);
        wd.removeObserver(sm);
        wd.setMesurements(34, 101, 1010);
    }
}