package ducking;

public class DecoyDuck extends Duck{
    public DecoyDuck(){
        qb = new MuteQuack();
        fb = new FlyNoWay();
    }

    public void display(){
        System.out.println("me DecoyDuck");
    }
}
