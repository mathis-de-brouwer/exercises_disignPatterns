package OLimpIcsclindoeuil;

import java.util.ArrayList;
import java.util.List;

public class CentralisedSystem implements Sujecd{
    private String schedule;
    private String profile;
    private int result;

    protected List<Oserve> oser = new ArrayList<>();

    public CentralisedSystem(String schedule, String profile, int result) {
        this.schedule = schedule;
        this.profile = profile;
        this.result = result;
    }

    public void registerO(Oserve o){
        oser.add(o);
    }
    public void deleteO(Oserve o){
        oser.remove(o);
    }
    public void notifyO(){
        for (Oserve o : oser){
            o.updating();
        }
    }

    public void setInfo(String schedule, String profile, int result){
        this.schedule = schedule;
        this.profile = profile;
        this.result = result;
        notifyO();
    }

    public String getSchedule() {
        return schedule;
    }

    public String getProfile() {
        return profile;
    }

    public int getResult() {
        return result;
    }
}
