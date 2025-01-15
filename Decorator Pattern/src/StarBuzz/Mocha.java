package StarBuzz;

public class Mocha extends CondimentDecorator{
    public Mocha(Beverage b){
        super(b);
    }
    public String getDescription(){
        return b.getDescription() + ", Mocha";
    }
    public double getCost(){
        return b.getCost() + 0.3;
    }
}
