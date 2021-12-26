package com.bmfsolutions.frota.view;

import com.bmfsolutions.frota.controller.FrotaSystem;
import com.bmfsolutions.frota.models.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Gui implements ActionListener {

    private final JTextField CAR_NAME_INP;
    private final JTextField FUEL_AVG_INP;
    private final JTextField FUEL_INP;
    private final JTextField TRIP_NAME_INP;
    private final JTextField TRIP_LEN_INP;
    private final JTextField QTY_INP;
    private final JLabel REPORT;
    private final JLabel LAPS;
    private final JLabel DAILY_COST;
    private final JLabel WEEKLY_COST;
    private final JLabel MONTHLY_COST;
    private final JPanel PANEL;

    public Gui() {
        JFrame frame = new JFrame();
        frame.setSize(1024,1024);
        PANEL = new JPanel();
        JButton calc = new JButton("Calcular ");
        JLabel carName = new JLabel("Nome do Veículo ");
        JLabel fuelAvg = new JLabel("Média do Veículo ");
        JLabel fuel = new JLabel("Tipo de combustível ");
        JLabel tripName = new JLabel("Nome da viagem ");
        JLabel tripLen = new JLabel("Distância de cada viagem ");
        JLabel qty = new JLabel("Qtd de viagens ");
        JLabel space1 = new JLabel(" ");
        JLabel space2 = new JLabel(" ");
        JLabel space3 = new JLabel(" ");
        JLabel space4 = new JLabel(" ");
        JLabel space5 = new JLabel(" ");
        JLabel space6 = new JLabel(" ");
        JLabel space7 = new JLabel(" ");
        JLabel space8 = new JLabel(" ");
        JLabel space9 = new JLabel(" ");
        JLabel space10 = new JLabel(" ");
        JLabel space11 = new JLabel(" ");
        JLabel space12 = new JLabel(" ");
        JLabel space13 = new JLabel(" ");
        JLabel space14 = new JLabel(" ");
        JLabel space15 = new JLabel(" ");
        JLabel space16 = new JLabel(" ");
        JLabel space17 = new JLabel(" ");
        JLabel space18 = new JLabel(" ");
        JLabel space19 = new JLabel(" ");
        CAR_NAME_INP = new JTextField();
        FUEL_AVG_INP = new JTextField();
        FUEL_INP = new JTextField();
        TRIP_NAME_INP = new JTextField();
        TRIP_LEN_INP = new JTextField();
        QTY_INP = new JTextField();
        REPORT = new JLabel("");
        REPORT.setSize(300,20);
        LAPS = new JLabel("");
        LAPS.setSize(300,20);
        DAILY_COST = new JLabel("");
        DAILY_COST.setSize(300,20);
        WEEKLY_COST = new JLabel("");
        WEEKLY_COST.setSize(300,20);
        MONTHLY_COST = new JLabel("");
        MONTHLY_COST.setSize(300,20);


        calc.addActionListener(this);

        PANEL.setBorder(BorderFactory.createEmptyBorder(30, 50, 10, 100));
        PANEL.setLayout(new GridLayout(24, 2));

        PANEL.add(carName);
        PANEL.add(CAR_NAME_INP);

        PANEL.add(space1);
        PANEL.add(space2);

        PANEL.add(fuelAvg);
        PANEL.add(FUEL_AVG_INP);

        PANEL.add(space3);
        PANEL.add(space4);

        PANEL.add(fuel);
        PANEL.add(FUEL_INP);

        PANEL.add(space5);
        PANEL.add(space6);

        PANEL.add(tripName);
        PANEL.add(TRIP_NAME_INP);

        PANEL.add(space7);
        PANEL.add(space8);

        PANEL.add(tripLen);
        PANEL.add(TRIP_LEN_INP);

        PANEL.add(space9);
        PANEL.add(space10);

        PANEL.add(qty);
        PANEL.add(QTY_INP);

        PANEL.add(space11);
        PANEL.add(space12);

        PANEL.add(space13);
        PANEL.add(calc);

        PANEL.add(space14);
        PANEL.add(space15);

        PANEL.add(REPORT);
        PANEL.add(space16);

        PANEL.add(LAPS);
        PANEL.add(space17);

        PANEL.add(DAILY_COST);
        PANEL.add(space18);

        PANEL.add(WEEKLY_COST);
        PANEL.add(space19);

        PANEL.add(MONTHLY_COST);


        frame.add(PANEL, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Calcula Consumo");
        frame.pack();
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Veiculo car = new Veiculo(CAR_NAME_INP.getText(), Double.parseDouble(FUEL_AVG_INP.getText()), 0, FUEL_INP.getText().length() == 1 ? FUEL_INP.getText().charAt(0) : null);
        Trip trip = new Trip(TRIP_NAME_INP.getText(), Double.parseDouble(TRIP_LEN_INP.getText()));
        Consumo cons = FrotaSystem.consumo(car, trip, Integer.parseInt(QTY_INP.getText()));

        REPORT.setText("Relatório: " + cons.getName());
        LAPS.setText("Quantidade de voltas: " + cons.getQty());
        DAILY_COST.setText("Custo diário: R$" + String.format("%.2f",cons.getDailyCost()));
        WEEKLY_COST.setText("Custo semanal: R$" + String.format("%.2f",cons.getWeeklyCost()));
        MONTHLY_COST.setText("Consumo mensal: R$" + String.format("%.2f",cons.getMonthlyCost()));
    }
}
