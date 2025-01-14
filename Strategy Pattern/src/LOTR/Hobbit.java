package LOTR;

public class Hobbit extends Charakter {

    public Hobbit(){
        wp = new Knife();
    }
    public void display(){
        System.out.println("i dont like shoes");
        wp.attack();
    }
}
