package LOTR_fake_notgood;

public class Sword extends Weapon{
    public Sword(){
        dmg = new NoRange();
    }

    public void display(){
        System.out.println("I am the sword saint");
    }

}
