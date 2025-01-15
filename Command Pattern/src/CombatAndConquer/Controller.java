package CombatAndConquer;

public class Controller {
    private Charakter charakter;
    public void setChar(Charakter charakter){
        this.charakter = charakter;
    }
    public void fighting(){
        charakter.fight();
    }
}
