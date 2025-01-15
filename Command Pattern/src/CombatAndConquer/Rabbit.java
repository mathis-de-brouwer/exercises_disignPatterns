package CombatAndConquer;

public class Rabbit {
    private int numTeeth;
    private float strenght;

    public Rabbit(int numTeeth, float strenght){
        this.numTeeth = numTeeth;
        this.strenght = strenght;
    }

    public void jump(){
        System.out.println("Jump");
    }
    public void sniffl(){
        System.out.println("sniffle");
    }
    public void bite(){
        System.out.println("bite");
    }
}
