package ducking;

public class RedHeadDuck extends Duck{
    public RedHeadDuck(){
        qb = new Quack();
        fb = new FlyWithWings();
    }

    public void display(){
        System.out.println("me real RedHeadDuck");
    }
}

