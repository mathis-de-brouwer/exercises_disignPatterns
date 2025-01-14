package LOTR;

public abstract class Charakter {
    protected Weapon wp;

    public void setWp(Weapon wp) {
        this.wp = wp;
    }

    public void changeWp(Weapon newWp) {
        this.wp = newWp;
    }

    public abstract void display();
}



