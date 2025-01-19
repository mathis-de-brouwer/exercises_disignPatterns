package Menue;

public interface MenuComponent {
    void operation();
    void addd(MenuComponent m);
    void remove(MenuComponent m);
    MenuComponent getChild(int index);

}
