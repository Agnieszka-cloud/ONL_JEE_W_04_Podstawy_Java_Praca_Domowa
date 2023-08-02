// W pakiecie pl.coderslab.homeworks.files,
// w pliku Main01.java stwórz metodę o sygnaturze:
// public static int count(String fileName).
// uzupełnij ciało metody tak, aby zliczała i
// zwracała ilość znaków z pliku.
package pl.coderslab.homeworks.files;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main01 {

    public static void main(String[] args) {
        try {
            System.out.println(count("text1.txt"));
        }catch (FileNotFoundException e){
            System.out.println("brak pliku");
        }
    }
    public static int count(String fileName) throws FileNotFoundException {
        File file = new File(fileName);
        int sum = 0;
        Scanner scanner = new Scanner(file);
        while (scanner.hasNextLine()) {
            sum = sum + scanner.nextLine().length();
        }
        return sum;
    }
}
