package Weatherstation;

import java.util.ArrayList;
import java.util.List;

public class Weatherdata implements Subject{
    private double temp;
    private double hum;
    private double prs;
    private List<Observer> observers = new ArrayList<>();

    public void registerObserver(Observer o){
        observers.add(o);
    }
    public void removeObserver(Observer o){
        observers.remove(o);
    }
    public void notifyObservers(){
        for (Observer observer : observers){
            observer.update(temp, hum, prs);
        }
    }

    public void setMesurements(double temp, double hum, double prs){
        this.temp = temp;
        this.hum = hum;
        this.prs = prs;
        notifyObservers();
    }

}
