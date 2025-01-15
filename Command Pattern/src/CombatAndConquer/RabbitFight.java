package CombatAndConquer;

public class RabbitFight implements Charakter{
    private Rabbit rb;

    public RabbitFight(Rabbit rb){
        this.rb = rb;
    }

    public void fight(){
        rb.jump();
        rb.bite();
    }
}
