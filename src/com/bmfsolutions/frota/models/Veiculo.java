package com.bmfsolutions.frota.models;

public class Veiculo {

    private String name;
    private double fuelAvg;
    private int passengers;
    private Character fuel;


    public Veiculo(String name) {
        this.name = name;
        this.fuelAvg = 0;
        this.passengers = 0;
        this.fuel = null;
    }

    public Veiculo(String name, double fuelAvg, int passengers, Character fuel) {
        this.name = name;
        this.fuelAvg = fuelAvg;
        this.passengers = passengers;
        this.fuel = Character.toUpperCase(fuel);
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getFuelAvg() {
        return this.fuelAvg;
    }

    public void setFuelAvg(double fuelAvg) {
        this.fuelAvg = fuelAvg;
    }

    public int getPassengers() {
        return this.passengers;
    }

    public void setPassengers(int qty) {
        this.passengers = qty;
    }

    public char getFuel() {
        return this.fuel;
    }

    public void setFuel(char fuel) {
        this.fuel = Character.toUpperCase(fuel);
    }

    @Override
    public String toString() {
        return "\nVeículo"
                + "\nNome: " + this.name
                + "\nCapacidade: " + this.passengers
                + "\nCombustivel: " + this.fuel
                + "\nMédia: " + this.fuelAvg;
    }

}
