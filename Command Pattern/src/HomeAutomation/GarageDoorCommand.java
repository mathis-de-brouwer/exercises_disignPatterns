package HomeAutomation;

public class GarageDoorCommand implements Command{
    private GarageDoor gd;

    public GarageDoorCommand(GarageDoor gd){
        this.gd = gd;
    }

    public void execute(){
        gd.up();
        gd.lighOn();
    }

    public void executeOff(){
        gd.down();
        gd.lightOff();
    }


}
