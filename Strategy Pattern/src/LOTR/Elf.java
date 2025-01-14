package LOTR;

public class Elf extends Charakter {
    public Elf(){
        wp = new BowandArrow();
    }
    public void display(){
        System.out.println("i am an elf and i dont know whi tf anakin is");
        wp.attack();
    }
}
