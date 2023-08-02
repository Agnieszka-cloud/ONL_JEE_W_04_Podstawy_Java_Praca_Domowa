// W pakiecie pl.coderslab.homeworks.files,
// w pliku Main01.java stwórz metodę o sygnaturze:
// public static int count(String fileName).
// uzupełnij ciało metody tak, aby zliczała i
// zwracała ilość znaków z pliku.
package pl.coderslab.homeworks.files;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main04 {

    public static void main(String[] args) {

    }
    public static int count(String fileName){
        File file = new File("text3.txt");
        int sum = 0;
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()){

            }
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }
        return
    }
}
