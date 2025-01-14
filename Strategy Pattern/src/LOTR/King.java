package LOTR;

public class King extends Charakter {
    public King(){
        wp = new Sword();
    }

    public void display(){
        System.out.println("I am king");
        wp.attack();
    }
}
