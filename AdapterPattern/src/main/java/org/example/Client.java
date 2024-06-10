package org.example;

// This class will use the adapter to work with the temperature sensor in Celsius.
public class Client {
    public static void main(String[] args) {

        FahrenheitSensor fahrenheitSensor = new FahrenheitSensor();
        TemperatureSensor sensor = new TemperatureAdapter(fahrenheitSensor);
        System.out.println("fahrenheitSensor.getTemperature(): " + fahrenheitSensor.getTemperature());

        System.out.println("---Adapter---");
        System.out.println("Temperature in Celsius: " + sensor.getTemperature());
    }
}
