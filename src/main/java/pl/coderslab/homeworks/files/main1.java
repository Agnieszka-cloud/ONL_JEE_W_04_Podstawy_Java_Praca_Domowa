// W pakiecie pl.coderslab.homeworks.files,
// w pliku Main01.java stwórz metodę o sygnaturze:
// public static int count(String fileName).
// uzupełnij ciało metody tak, aby zliczała i
// zwracała ilość znaków z pliku.
package pl.coderslab.homeworks.files;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;
import java.util.List;
import java.util.Scanner;

public class main1 {
    public static void main(String [] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj nazwę pliku");
        String fileName = scan.nextLine();
        System.out.println(count(fileName));
        //System.out.println("Plik zawiera " + count(fileName) + " znaków");
    }

    public static int count (String fileName){
        File file = new File(fileName);
        int charNumber = 0;
        if (!file.exists()) {
            return 0;
        } else {
            try {
                Scanner scan = new Scanner(file);
                while (scan.hasNextLine()) {
                    charNumber += scan.nextLine().length();
                }
            } catch (FileNotFoundException e) {
                System.out.println("Błąd odczytu");
                return 0;
            }
        }
        return charNumber;
    }
}
