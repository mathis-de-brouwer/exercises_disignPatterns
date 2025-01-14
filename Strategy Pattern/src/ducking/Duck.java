package ducking;

public abstract class Duck {
    protected FlyBehavior fb;
    protected QuackBehavior qb;

    public void setFb(FlyBehavior fb) {
        this.fb = fb;
    }
    public void setQb(QuackBehavior qb) {
        this.qb = qb;
    }

    public void performFly(){
        fb.fly();
    }

    public void performQuack(){
        qb.quack();
    }

    public void swim(){
        System.out.println("all ducks swim");
    }

    public abstract void display();
}
