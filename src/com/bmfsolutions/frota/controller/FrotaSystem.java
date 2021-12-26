package com.bmfsolutions.frota.controller;
import com.bmfsolutions.frota.models.*;
import javax.swing.*;

public class FrotaSystem {
    public static Consumo consumo(Veiculo ve, Trip tp, int qty){
        String name;
        double lapCost;
        double dailyCost;
        double weeklyCost;
        double monthlyCost;
        double price;
        Fuel fl = new Fuel();
        String report;

        name = String.format("%s/%s", ve.getName(),tp.getName());
        switch(ve.getFuel()){
            case 'G':
                fl.setName("Gasolina");
                price = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da Gasolina: ").replace(",","."));
                fl.setPrice(price);
                break;
            case 'D':
                fl.setName("Diesel");
                price = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do diesel: ").replace(",","."));
                fl.setPrice(price);
                break;

        }
        lapCost = (tp.getLength()/ve.getFuelAvg())*fl.getPrice();
        dailyCost = lapCost * qty;
        weeklyCost = dailyCost * 7;
        monthlyCost = dailyCost * 22;

        report = "\nVeículo: " + ve.getName()
                + "\nViagem: " + tp.getName()
                + "\nVoltas: " + qty
                + String.format("\nCusto diário: R$ %.2f", dailyCost)
                + String.format("\nCusto semanal: R$ %.2f", weeklyCost)
                + String.format("\nCusto mensal: R$ %.2f", monthlyCost);
        Consumo cons = new Consumo(name,qty, dailyCost,weeklyCost, monthlyCost, report );
        return cons;
    }
}
