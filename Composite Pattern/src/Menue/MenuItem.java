package Menue;

public class MenuItem extends AbstractComp {
    private int price;

    public MenuItem(String name1, String descri, int price) {
        super(name1, descri);
        this.price = price;
    }
    public void operation(){
        System.out.println(name1 + ", "+ price +" -- " + descri);
    }
}
