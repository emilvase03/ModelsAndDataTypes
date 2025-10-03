package org.example.modelsanddatatypes.models;

public class NumberConversionModel {
    public float getMilesFromKilometers(float km) {
        return km * 0.621371f;
    }
    public float getKilometersFromMiles(float miles) {
        return miles * 1.60934f;
    }

    public String getGreetingsMessage(String name) {
        return "Hello, " + name + ". Greetings from the top Java developer class in town";
    }
}
