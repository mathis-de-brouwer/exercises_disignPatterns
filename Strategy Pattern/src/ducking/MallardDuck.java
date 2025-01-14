package ducking;

public class MallardDuck extends Duck{
    public MallardDuck(){
        qb = new Quack();
        fb = new FlyWithWings();
    }

    public void display(){
        System.out.println("me real MallardDuck");
    }
}
