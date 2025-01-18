package ducking2;

public class MallardDuck extends Duck{
    public MallardDuck(){
        fb = new Fly();
        qb = new Quack2();
    }

    public void display(){
        System.out.println("IM MALLARDUCK WITH DOUBLE D");
    }


}
