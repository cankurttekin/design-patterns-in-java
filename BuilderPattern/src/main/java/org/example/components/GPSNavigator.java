package org.example.components;

public class GPSNavigator {
    private String route;

    public GPSNavigator() {
        this.route = "Rıhtım Cd., Beyoğlu/İstanbul";
    }

    public GPSNavigator(String manualRoute) {
        this.route = manualRoute;
    }

    public String getRoute() {
        return route;
    }
}
