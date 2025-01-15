package Turkey;

public class Turkeyadapter implements Duck{
    private Turkey turkey;

    public Turkeyadapter(Turkey turkey){
        this.turkey = turkey;
    }
    public void quack(){
        turkey.gobble();
    }
    public void fly(){
        turkey.fly();
    }
}
