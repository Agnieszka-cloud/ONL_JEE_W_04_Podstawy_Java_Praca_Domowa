/*
    W pakiecie w pliku `pl.coderslab.homeworks.datainput`,
    w pliku `Main02.java` stwórz metodę o sygnaturze:

        `public static int[] sortedArray()`.

        1. uzupełnij ciało metody tak, aby
        wczytała z konsoli, ile liczb należy wylosować,
        2. stworzy tablicę oraz umieść w niej
        losowe wartości z zakresu `[0,100]`,
        3. posortuje elementy tablicy, a następnie ją zwróci.
*/
package pl.coderslab.homeworks.datainput;


import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main02 {

    public static void main(String[] args) {

        //System.out.println(Arrays.toString(sortedArray()));
        int[] sortedArray = new int [8];
        sort(sortedArray);
    }

    public static int pobierzLiczbe(Scanner scanner){
        while (!scanner.hasNextInt()) {
            System.out.println("Niepoprawny format. Podaj liczbę całkowitą:");
            scanner.next();
        }
        return scanner.nextInt();
    }

    public static void sort (int[] sortedArray) {
        int[] sorted;
        int ilośćLiczb = 0;
        Scanner scanner = new Scanner(System.in);
        while (ilośćLiczb <= 0) {
            System.out.println("Podaj ilość liczb do wylosowania większą od zera:");
            while (!scanner.hasNextInt()) {
                System.out.println("Niepoprawny format. Podaj liczbę całkowitą:");
                scanner.next();
            }
            ilośćLiczb = scanner.nextInt();
        }
        sorted = new int[ilośćLiczb];
        Random random = new Random();
        for (int i = 0; i < sorted.length; i++) {
            sorted[i] = random.nextInt(100);
        }
        Arrays.sort(sorted);
        System.out.println(Arrays.toString(sorted));
    }
}



