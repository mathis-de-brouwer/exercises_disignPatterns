package LOTR_butNotReally;

public class King extends Characters{
    public King(){
        wp = new BowEArrow();
    }

    public void fight(){
        System.out.println("Im a King and today i will use the ");
        wp.attack();
    }
}
