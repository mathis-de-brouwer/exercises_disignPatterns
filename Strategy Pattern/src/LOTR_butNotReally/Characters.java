package LOTR_butNotReally;

import javax.sound.midi.Soundbank;

public abstract class Characters {
    protected Weapon wp;

    public void setWp(Weapon wp) {
        this.wp = wp;
    }
    public void changeWp(Weapon wp){
        this.wp = wp;
        System.out.println("Your weapon changed to: "+ this.wp);
    }


    public abstract void fight();
}
