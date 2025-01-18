package ducking2;

public class RedNeckDuck extends Duck {
    public RedNeckDuck(){
        qb = new HellYea();
        fb = new FlyRocket();
    }

    public void display(){
        System.out.println("I LIKE TRUCKS AND BUDWEISER");
    }

}
