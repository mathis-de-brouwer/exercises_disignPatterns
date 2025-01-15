package StarBuzz;

public class Milk extends CondimentDecorator{
    public Milk(Beverage b){
        super(b);
    }
    public String getDescription(){
        return b.getDescription() + ", Milk";
    }
    public double getCost(){
        return b.getCost() + 0.2;
    }
}
