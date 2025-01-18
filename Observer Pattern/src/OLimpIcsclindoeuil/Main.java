package OLimpIcsclindoeuil;

public class Main {
    public static void main(String[] args) {
        CentralisedSystem cs = new CentralisedSystem("asdasdas","fasafa", 7);
        Oserve p = new PressIntranet(cs);

        cs.registerO(p);
        cs.setInfo("schedule is kaka", "ta daronne", 98);
    }
}
