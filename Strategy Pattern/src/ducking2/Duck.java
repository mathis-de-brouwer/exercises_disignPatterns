package ducking2;

public abstract class Duck{
    protected FlyBehaviour fb;
    protected QuackBehaviour qb;

    public void swim(){
        System.out.println("alll duck swim");
    }

    public void setFb(FlyBehaviour fb) {
        this.fb = fb;
    }

    public void setQb(QuackBehaviour qb) {
        this.qb = qb;
    }

    public void makeFly(){
        fb.fly();
    }
    public void makeQuack(){
        qb.quack();
    }
    public abstract void display();
}
