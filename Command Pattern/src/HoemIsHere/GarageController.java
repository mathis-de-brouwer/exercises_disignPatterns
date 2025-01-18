package HoemIsHere;

public class GarageController implements Command{
    private Garage g;

    public GarageController(Garage g) {
        this.g = g;
    }

    public void execute() {
        g.on();
        g.up();
    }
}
