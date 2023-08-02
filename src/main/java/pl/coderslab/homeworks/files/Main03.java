// W pakiecie pl.coderslab.homeworks.files,
// w pliku Main03.java stwórz metodę o sygnaturze:
// public static boolean checkFileExist().
// uzupełnij ciało metody tak, aby wczytała
// z konsoli nazwę pliku,
// sprawdzi czy plik istnieje a następnie
// wypisze true lub false.
package pl.coderslab.homeworks.files;

import java.io.File;
import java.util.Scanner;

public class Main03 {

    public static void main(String[] args) {
        System.out.println(checkFileExist());
    }
    public static boolean checkFileExist(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj nazwę pliku");
        String filename = scanner.nextLine(); // obiekt
        // przechowujący nazwę pliku do sprawdzenia
        File file = new File(filename);
        // metoda na klasie file która sprawdza czy istnieje?
        return file.exists();
    }
}
