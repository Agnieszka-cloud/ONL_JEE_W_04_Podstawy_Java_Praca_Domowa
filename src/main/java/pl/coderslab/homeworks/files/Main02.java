// W pakiecie pl.coderslab.homeworks.files,
// w pliku Main02.java stwórz metodę o sygnaturze:
// public static int count(String fileName).
// uzupełnij ciało metody tak, aby zliczyła i
// zwracała ilość słów z pliku.

package pl.coderslab.homeworks.files;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main02 {

    public static void main(String[] args) {
        try {
            System.out.println(count("text2.txt"));
        }catch (FileNotFoundException e){
            System.out.println("Brak pliku.");
        }
    }
    public static int count(String fileName) throws FileNotFoundException {
        File file = new File(fileName);
        Scanner scanner = new Scanner(file);
        int liczbaSłów = 0;
        while (scanner.hasNextLine()){
            String [] tablicaSłówWLinii = scanner.nextLine().split(" ");
            liczbaSłów = liczbaSłów + tablicaSłówWLinii.length;
        }
        return liczbaSłów;
    }
}
