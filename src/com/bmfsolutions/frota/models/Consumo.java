package com.bmfsolutions.frota.models;

public class Consumo {
    private String name;
    private int qty;
    private double dailyCost;
    private double weeklyCost;
    private double monthlyCost;
    private String report;

    public Consumo(String name, int qty, double dc, double wc, double mc, String repo){
        this.name = name;
        this.qty = qty;
        this.dailyCost = dc;
        this.weeklyCost = wc;
        this.monthlyCost = mc;
        this.report = repo;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getQty(){
        return this.qty;
    }
    public void setQty(int qty){
        this.qty = qty;
    }

    public double getDailyCost(){
        return this.dailyCost;
    }

    public void setDailyCost(double dc){
        this.dailyCost = dc;
    }

    public double getWeeklyCost(){
        return this.weeklyCost;
    }

    public void setWeeklyCost(double wc){
        this.weeklyCost = wc;
    }

    public double getMonthlyCost(){
        return this.monthlyCost;
    }

    public void setMonthlyCost(double mc){
        this.monthlyCost = mc;
    }

    public String getRepo(){
        return this.report;
    }

    public void setRepo(String repo){
        this.report = repo;
    }
}
