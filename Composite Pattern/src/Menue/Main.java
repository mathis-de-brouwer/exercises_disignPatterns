package Menue;

public class Main {
    public static void main(String[] args) {
        MenuComponent m = new MenuItem("nameing", "Descritioning", 98);
        MenuComponent m1 = new MenuFolder("folder", "this is a folder");

        m1.addd(m);
        m1.addd(new MenuItem("ahahhahah", "i am godge", 92));

        m1.operation();
        m1.getChild(1).operation();

    }
}
