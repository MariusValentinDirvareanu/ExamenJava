package com.company;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        LinkedList<String> sirPersoane = new LinkedList<>();
        int n = 0;
        int c = 3;

        Scanner console = new Scanner(System.in);
        System.out.println("Dati lungimea sirului n");
        try {
            n = console.nextInt();
            if (n < 0) {
                System.out.println("Lungimea introdusa a sirului este negativa");
            }
        } catch (Exception e) {
            System.out.println("Nu a fost introdus un numar intreg");
        }
        int i = 0;
        try {
            do {
                try {
                    sirPersoane.add(console.next());
                } catch (Exception e) {
                    throw e;
                }
                ++i;
            } while (i < n);
            for (i = c - 1; (i - c) < n; ++i) {
                System.out.println(sirPersoane.get(i % c));
            }

        } catch (Exception e) {
            System.out.println("Eroare introducere");
        }
    }
}
