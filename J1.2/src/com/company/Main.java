package com.company;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        LinkedList<String> sirPersoane = new LinkedList<>();
        int n;
        int c;
        int i = 0;

        Scanner console = new Scanner(System.in);
        System.out.println("Dati lungimea sirului n");
        try {
            try {
                n = console.nextInt();
                if (n < 0) {
                    throw new Exception("Numar negativ");
                }
            } catch (Exception e) {
                throw e;
            }
            try {
                c = console.nextInt();
                if (c < 0) {
                    throw new Exception("Numar negativ");
                }
            } catch (Exception e) {
                throw e;
            }

            do {
                try {
                    sirPersoane.add(console.next());
                } catch (Exception e) {
                    throw e;
                }
                ++i;
            } while (i < n);
            c -= 1;
            for (i = 0; i < n; ++i) {
                System.out.println(sirPersoane.get((i + c) % n));
            }

        } catch (Exception e) {
            System.out.println("Eroare introducere");
        }
    }
}
