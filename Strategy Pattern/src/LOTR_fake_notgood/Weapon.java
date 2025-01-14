package LOTR_fake_notgood;

public abstract class Weapon {
    protected Damage dmg;

    public void setDmg(Damage dmg) {
        this.dmg = dmg;
    }

    public abstract void display();

}
