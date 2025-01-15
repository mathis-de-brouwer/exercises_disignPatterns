package Olympics;

import java.util.ArrayList;
import java.util.List;

public class CentralizedSystem implements Subject{
    double sdle;
    String profile;
    String result;

    List<Observer> observers = new ArrayList<>();

    public void registerObserver(Observer o){
        observers.add(o);
    }
    public void removeObserver(Observer o){
        observers.add(o);
    }

    public void notifyObserver(){
        for (Observer o : observers){
            o.update();
        }
    }

    public void setData(double sdle, String profile, String result){
        this.sdle = sdle;
        this.profile = profile;
        this.result = result;
        notifyObserver();
    }

    public double getSdle() {
        return sdle;
    }

    public String getProfile() {
        return profile;
    }

    public String getResult() {
        return result;
    }

}
