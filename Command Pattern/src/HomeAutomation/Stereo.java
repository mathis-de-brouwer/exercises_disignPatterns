package HomeAutomation;

public class Stereo {
    private String location;

    public Stereo(String location){
        this.location = location;
    }

    public void on(){
        System.out.println(location + " Stereo is on");
    }
    public void off(){
        System.out.println(location + " Stereo is off");
    }

    public void selectCD(){
        System.out.println(location + " Stereo select cd-mode");
    }
    public void setVolume(int volume){
        System.out.println(location + " Stereo volume set to: " + volume);
    }


}
