package Menu;

public class MenuItem implements MenuComponent{
    private String name;
    private String description;
    private double price;

    public MenuItem(String name, String description, double price){
        this.name = name;
        this.description = description;
        this.price = price;
    }

    public void print(){
        System.out.println(name + ", "+ price+ " -- " + description);
    }
}
