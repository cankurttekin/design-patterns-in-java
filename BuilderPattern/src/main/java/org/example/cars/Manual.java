package org.example.cars;

import org.example.components.Engine;
import org.example.components.GPSNavigator;
import org.example.components.Transmission;
import org.example.components.TripComputer;

public class Manual {
    private final CarType carType;
    private final int seats;
    private final Engine engine;
    private final Transmission transmission;
    private final TripComputer tripComputer;
    private final GPSNavigator gpsNavigator;

    public Manual(CarType carType, int seats, Engine engine, Transmission transmission, TripComputer tripComputer, GPSNavigator gpsNavigator) {
        this.carType = carType;
        this.seats = seats;
        this.engine = engine;
        this.transmission = transmission;
        this.tripComputer = tripComputer;
        this.gpsNavigator = gpsNavigator;
    }


    public String print() {
        String info = "Manual{" +
                "carType=" + carType +
                ", seats=" + seats +
                ", engine=" + engine.getVolume() +
                ", transmission=" + transmission +
                ", tripComputer=";
        if (tripComputer != null) {
            info += "functional";
        } else {
            info += "not functional";
        }

        info += ", gpsNavigator=";

        if (gpsNavigator != null) {
            info += "functional";
        } else {
            info += "not functional";
        }
        return info;
    }
}
