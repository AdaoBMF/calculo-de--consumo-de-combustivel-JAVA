package com.bmfsolutions.frota.models;

public class Trip {
    private String name;
    private double length;

    public Trip(String name, double length) {
        this.name = name;
        this.length = length;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getLength() {
        return this.length;
    }

    public void setLength(double len) {
        this.length = len;
    }

    @Override
    public String toString() {
        return "\nTrip"
                + "\nNome: " + this.name
                + "\nDustância: " + this.length;
    }
}
