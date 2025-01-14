package LOTR;

public class Dwarf extends Charakter {
    public Dwarf(){
        wp = new Axe();
    }
    public void display(){
        System.out.println("Me Dwarf, me not like shower");
        wp.attack();
    }
}
