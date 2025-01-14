package Weatherstation;

public class Smartphone implements Observer{
    @Override
    public void update(double temp, double hum, double prs){
        System.out.println("Smartphone recieved update");
        System.out.println("Temperature: "+ temp);
        System.out.println("Humidity: " + hum);
        System.out.println("Pressure: " + prs);
    }

}
