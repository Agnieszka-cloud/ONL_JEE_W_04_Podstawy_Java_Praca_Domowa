/*
    W pakiecie `pl.coderslab.homeworks.datainput`, w pliku `Main01.java` stwórz metodę o sygnaturze:

        `public static void printTriangle()`.

        1. uzupełnij ciało metody tak,
        aby wczytała z konsoli wartość typu `int`,
        2. wypisze na konsoli trójkąt zbudowany
        ze znaku `x`, w którym obie przyprostokątne
        będą równe wczytanej wartości.
        Przykład dla wczytanej wartości równej 5.

        ````
        x
        x x
        x x x
        x x x x
        x x x x x
        ````
        */
package pl.coderslab.homeworks.datainput;

import java.util.Scanner;

public class Main01 {

    public static void main(String[] args) {
        printTriangle();
}
    public static void printTriangle() {
        Scanner scanner = new Scanner(System.in);
        int liczba;
        System.out.println("podaj liczbe");
        while (!scanner.hasNextInt()) {
            System.out.println("Niewłaściwy format. " +
                    "Podaj liczbę całkowitą dodatnią:");
            scanner.next();
        }
        liczba = scanner.nextInt();

        for (int i = 0; i < liczba; i++) {
            for (int j = 0; j <=i; j++) {
                System.out.print("x");
            }
            System.out.println();
        }
    }
}
