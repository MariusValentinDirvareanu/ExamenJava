package com.company;


import java.util.Random;

public class Main {

    private static int aruncariJucatorUnu = 0;
    private static int aruncariJucatorDoi = 0;

    public static void main(String[] args) {
        int zarUnu = 1;
        int zarDoi = 0;
        Random rnd = new Random();
        while (zarUnu != zarDoi) {
            zarDoi = rnd.nextInt(6) + 1;
            zarUnu = rnd.nextInt(6) + 1;
            aruncariJucatorUnu++;
            System.out.println("Jucatorul 1, aruncarea " + aruncariJucatorUnu + ": [" + zarUnu + ", " + zarDoi + "]");
        }
        System.out.println("Jucatorul 1 a dat o dubla din " + aruncariJucatorUnu + " aruncari.");
        zarUnu = 1;
        zarDoi = 0;
        while (zarUnu != zarDoi) {
            zarDoi = rnd.nextInt(6) + 1;
            zarUnu = rnd.nextInt(6) + 1;
            aruncariJucatorDoi++;
            System.out.println("Jucatorul 2, aruncarea " + aruncariJucatorDoi + ": [" + zarUnu + ", " + zarDoi + "]");
        }
        System.out.println("Jucatorul 2 a dat o dubla din " + aruncariJucatorDoi + " aruncari.");
        RezultatMeci();
    }

    private static void RezultatMeci() {
        if (aruncariJucatorDoi < aruncariJucatorUnu) {
            System.out.println("Jucatorul 2 a castigat");
        } else if (aruncariJucatorDoi > aruncariJucatorUnu) {
            System.out.println("Jucatorul 1 a castigat");
        } else {
            System.out.println("Egalitate");
        }
    }
}
