package com.company;

import java.util.Scanner;

public class Main {

    /**
     * Se citeste un numar n intreg pozitiv
     * Se verifica daca este numar intreg in structura try catch
     * Se verifica daca este pozitiv
     * Se afiseaza numerele de la 1 la n fiecare de i ori
     *
     * @param args
     */
    public static void main(String[] args) {
        int n = 0;
        Scanner console = new Scanner(System.in);
        System.out.println("Dati lungimea sirului");
        try {
            n = console.nextInt();
            if (n < 0) {
                System.out.println("Lungimea introdusa a sirului este negativa");
            }
        } catch (Exception e) {
            System.out.println("Nu a fost introdus un numar intreg");
        }
        for (int i = 1; i <= n; ++i) {
            for (int j = 1; j <= i; ++j) {
                System.out.print(i + " ");
            }
        }
    }
}
