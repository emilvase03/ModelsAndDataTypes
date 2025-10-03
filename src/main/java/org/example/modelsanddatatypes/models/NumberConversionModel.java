package org.example.modelsanddatatypes.models;

public class NumberConversionModel {
    public double getMilesFromKilometers(double km) {
        return km * 0.621371;
    }
    public double getKilometersFromMiles(double miles) {
        return miles * 1.60934;
    }

    public String getGreetingsMessage(String name) {
        return "Hello, " + name + ". Greetings from the top Java developer class in town";
    }
}
