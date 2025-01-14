package LOTR_fake_notgood;

public abstract class Character {
    protected Fight ft;
    protected Weapon wp;

    public void setFight(Fight ft) {
        this.ft = ft;
    }

    public void performFight(){
        ft.fight();
    }

    public void setWp(Weapon wp) {
        this.wp = wp;
    }

    public void eat(){
        System.out.println("lemme eat you pig");
    }

    public abstract void display();
}
