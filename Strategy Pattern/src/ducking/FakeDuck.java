package ducking;

public class FakeDuck extends Duck{
    public FakeDuck(){
        qb = new Squeak();
        fb = new FlyNoWay();
    }

    public void display(){
        System.out.println("me fake Duck me plastic");
    }
}
