package Menue;

import java.util.ArrayList;
import java.util.List;

public class MenuFolder extends AbstractComp{

    protected List<MenuComponent> items;
    public MenuFolder(String name1, String descri) {
        super(name1, descri);
        items = new ArrayList<>();
    }

    public void addd(MenuComponent m) {
        items.add(m);
    }

    public void remove(MenuComponent m) {
        items.remove(m);
    }

    public MenuComponent getChild(int index){
        return items.get(index);
    }

    public void operation() {
        System.out.println(name1 + ", " +" -- " + descri);
        System.out.println("=============");
        for (MenuComponent i : items){
            i.operation();
        }
    }
}
