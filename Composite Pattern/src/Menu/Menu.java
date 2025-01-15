package Menu;

import java.util.ArrayList;
import java.util.List;

public class Menu implements MenuComponent{
    private String name;
    private String description;
    List<MenuComponent> items = new ArrayList<>();

    public Menu(String name, String description){
        this.name = name;
        this.description = description;
    }

    public void add(MenuComponent item){
        items.add(item);
    }

    public void print(){
        System.out.println("\n"+ name + ", "+ description);
        System.out.println("-----");
        for (MenuComponent item : items){
            item.print();
        }
    }


}
