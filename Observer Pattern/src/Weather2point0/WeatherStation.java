package Weather2point0;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements Weathering {
    private int h;
    private int t;
    private int p;
    protected List<Devices> devices = new ArrayList<>();

    public WeatherStation(int h, int t, int p) {
        this.h = h;
        this.t = t;
        this.p = p;
    }

    public void registerDevice(Devices d){
        devices.add(d);
    }
    public void deleteDevice(Devices d){
        devices.remove(d);
    }

    public void notifyDevices(){
        for (Devices d : devices){
            d.updating(h, t, p);
        }
    }

    public void setMesurements(int h, int t, int p){
        this.h = h;
        this.t = t;
        this.p = p;
        notifyDevices();
    }



}
