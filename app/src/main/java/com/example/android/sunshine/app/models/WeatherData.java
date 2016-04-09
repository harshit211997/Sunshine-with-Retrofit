package com.example.android.sunshine.app.models;

import java.util.List;

public class WeatherData {

    City city;

    List<WeatherListObject> list;

    public City getCity() {
        return city;
    }

    public List<WeatherListObject> getWeatherList() {
        return list;
    }
}
