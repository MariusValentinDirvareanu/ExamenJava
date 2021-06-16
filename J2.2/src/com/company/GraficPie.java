package com.company;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.ui.ApplicationFrame;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.general.PieDataset;

import javax.swing.*;
import java.util.Random;

public class GraficPie extends ApplicationFrame {

    private final Random rnd = new Random();
    private int pp = 0;
    private int nopp = 0;


    public GraficPie(String title) {
        super(title);
        setContentPane(createDemoPanel());
    }

    /**
     * Daca radicalul unui numar este egal cu partea intreaga din acelasi radical
     * atunci e patrat perfect
     */
    private void calcul() {
        int numar;
        for (int i = 0; i < 1000; ++i) {
            numar = rnd.nextInt(100) + 1;
            if (Math.sqrt(numar) == (int) (Math.sqrt(numar))) {
                pp++;
            } else {
                nopp++;
            }
        }
    }

    private PieDataset createDataset() {
        calcul();
        DefaultPieDataset dataset = new DefaultPieDataset();

        dataset.setValue("Numere care sunt patrate perfecte", pp);
        dataset.setValue("Numere care nu sunt patrate perfecte", nopp);

        return dataset;
    }

    private JFreeChart createChart(PieDataset dataset) {
        JFreeChart chart = ChartFactory.createPieChart(
                "Numere",   // chart title
                dataset,          // data
                true,             // include legend
                true,
                false);

        return chart;
    }

    public JPanel createDemoPanel() {
        JFreeChart chart = createChart(createDataset());
        return new ChartPanel(chart);
    }
}
