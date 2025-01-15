package CombatAndConquer;

public class FarmerFight implements Charakter{
    private Farmer fr;

    public FarmerFight(Farmer fr){
        this.fr = fr;
    }

    public void fight(){
        fr.getDressed();
        fr.takeStick();
        fr.beatWStick();
    }
}
