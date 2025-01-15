package HomeAutomation;

public class GarageDoor {
    private String location;

    public GarageDoor(String location){
        this.location = location;
    }

    public void up(){
        System.out.println(location + " Garage door up");
    }

    public void down(){
        System.out.println(location + " Garage door down");
    }

    public void lighOn(){
        System.out.println(location + " Garage light on");
    }
    public void lightOff(){
        System.out.println(location + " Garage light off");
    }
}
