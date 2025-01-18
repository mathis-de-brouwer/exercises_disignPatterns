package Weather2point0;

public class Phone implements Devices{
    @Override
    public void updating(int h, int t, int p) {
        System.out.println("PHONE LINGING LINGING YO PHONE LINGING i got updated");
        System.out.println("Humidity: "+ h +"\ntemp: " + t + "\nPressure: "+ p);
    }
}
