package com.example.android.sunshine.app.models;

public class City {

    Coord coord;

    String name;

    public String getName() {
        return name;
    }

    public Coord getCoord() {
        return coord;
    }

    public class Coord{

        double lon;
        double lat;

        public double getLat() {
            return lat;
        }

        public double getLon() {
            return lon;
        }
    }

}
