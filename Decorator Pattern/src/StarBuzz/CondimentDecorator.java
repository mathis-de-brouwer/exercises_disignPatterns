package StarBuzz;

public abstract class CondimentDecorator implements Beverage{
    Beverage b;
    public CondimentDecorator(Beverage b){
        this.b = b;
    }
}
