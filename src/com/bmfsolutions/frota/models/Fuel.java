package com.bmfsolutions.frota.models;

public class Fuel {
    private String name;
    private double price;

    public Fuel() {
        this.name = "";
        this.price = 0;
    }

    public Fuel(String name, double price) {
        this.name = name;
        this.price = price;
    }


    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "\nFuel"
                + "\nNome: " + this.name
                + "\nPreço: " + this.price;
    }
}
