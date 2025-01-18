package LOTR_butNotReally;

public class Dwarfism extends Characters{
    public Dwarfism(){
        wp = new Axe();
    }

    public void fight(){
        System.out.println("Im a dwarf and i will fight with my weapon: ");
        wp.attack();
    }
}
