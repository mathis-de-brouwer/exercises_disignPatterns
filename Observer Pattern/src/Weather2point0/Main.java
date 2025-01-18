package Weather2point0;

public class Main {
    public static void main(String[] args) {
        WeatherStation ws = new WeatherStation(5,7,3343);
        Devices s = new Phone();
        Devices t = new Tablett();

        ws.registerDevice(s);
        ws.registerDevice(t);
        ws.setMesurements(45, 32, 1012);
    }
}
