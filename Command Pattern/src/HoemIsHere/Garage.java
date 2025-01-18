package HoemIsHere;

public class Garage {
    private String location;

    public Garage(String location) {
        this.location = location;
    }

    public void up(){
        System.out.println("Going up"+location);
    }
    public void on(){
        System.out.println("Lights on"+location);
    }
}
