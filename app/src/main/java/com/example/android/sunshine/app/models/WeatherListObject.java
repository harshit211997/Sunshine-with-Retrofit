package com.example.android.sunshine.app.models;

import java.util.List;

public class WeatherListObject {

    Temp temp;

    List<Weather> weather;

    String pressure;

    String humidity;

    String speed;

    double deg;

    public List<Weather> getWeather() {
        return weather;
    }


    public Temp getTemp() {
        return temp;
    }

    public String getHumidity() {
        return humidity;
    }

    public String getPressure() {
        return pressure;
    }

    public double getDeg() {
        return deg;
    }

    public String getSpeed() {
        return speed;
    }
}
