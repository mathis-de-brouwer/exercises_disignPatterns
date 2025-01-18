package Weather2point0;

public interface Weathering {
    void registerDevice(Devices d);
    void deleteDevice(Devices d);
    void notifyDevices();
}
