package com.company;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.ui.ApplicationFrame;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;

import java.util.LinkedList;
import java.util.Random;

public class Grafic extends ApplicationFrame {

    private final LinkedList<Integer> numere = new LinkedList<>();
    private final LinkedList<Integer> div3 = new LinkedList<>();
    private final LinkedList<Integer> div5 = new LinkedList<>();
    private final LinkedList<Integer> div35 = new LinkedList<>();
    private final LinkedList<Integer> div3n5 = new LinkedList<>();
    private final LinkedList<Integer> prime = new LinkedList<>();
    private final Random rnd = new Random();


    public Grafic(String applicationTitle, String chartTitle) {
        super(applicationTitle);
        JFreeChart barChart = ChartFactory.createBarChart(chartTitle,
                "Categorie",
                "Marime array",
                createDataset(),
                PlotOrientation.VERTICAL,
                true,
                true,
                false);

        ChartPanel chartPanel = new ChartPanel(barChart);
        chartPanel.setPreferredSize(new java.awt.Dimension(560, 367));
        setContentPane(chartPanel);
    }

    private void calcul() {
        for (int i = 0; i < 1000; ++i) {
            numere.add(rnd.nextInt(100) + 1);
        }
        for (Integer numar : numere) {
            if (numar % 3 == 0) {
                div3.add(numar);
            }
            if (numar % 5 == 0) {
                div5.add(numar);
            }
            if (numar % 3 == 0 && numar % 5 == 0) {
                div35.add(numar);
            }
            if (numar % 3 == 0 && numar % 5 != 0) {
                div3n5.add(numar);
            }
            if (isPrime(numar)) {
                prime.add(numar);
            }
        }
    }

    private boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i < Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    private CategoryDataset createDataset() {
        calcul();

        final DefaultCategoryDataset dataset = new DefaultCategoryDataset();

        dataset.addValue(div3.size(), "Tip numere", "div3");
        dataset.addValue(div5.size(), "Tip numere", "div5");
        dataset.addValue(div35.size(), "Tip numere", "div35");
        dataset.addValue(div3n5.size(), "Tip numere", "div3n5");
        dataset.addValue(prime.size(), "Tip numere", "prime");

        return dataset;
    }
}
