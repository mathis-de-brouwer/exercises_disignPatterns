package HoemIsHere;

public class Main {
    public static void main(String[] args) {

        Garage g = new Garage("Garage in the house");
        Command gd = new GarageController(g);
        Button b = new Button(gd);
        b.pressButton();
    }
}
