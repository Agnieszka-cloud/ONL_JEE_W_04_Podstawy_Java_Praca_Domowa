// W pakiecie pl.coderslab.homeworks.files,
// w pliku Main04.java stwórz metodę o sygnaturze:
// public static void rewrite().
// uzupełnij ciało metody tak, aby wczytała z konsoli nazwę pliku,
// sprawdzi czy plik istnieje i jeżeli istnieje stworzy drugi plik z sufiksem "_2", do którego 2-krotnie zostanie zapisana zawartość pliku wzorcowego.
// Przykład dla nazwy pliku text1.txt, z zawartością abc,
// zostanie utworzony plik, o nazwie text1_2.txt i zawartości:
package pl.coderslab.homeworks.files;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;
import java.util.List;
import java.util.Scanner;

public class zadanie4 {
    public static void main(String [] args){
        rewrite();
    }
    public static void rewrite() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj nazwę pliku");
        String fileName = scan.nextLine();
        File file = new File(fileName);
        if (!file.exists()) {
            System.out.println("Plik nie istnieje");
        } else {
            String fileName_2 = (fileName.lastIndexOf('.') != -1) ?
                    (fileName.substring(0, fileName.lastIndexOf('.')) + "_2" +
                            fileName.substring(fileName.lastIndexOf('.'))) : (fileName + "_2");
            File file_2 = new File(fileName_2);
            if (file_2.exists()) {
                System.out.println("Błąd - plik docelowy już istnieje");
            } else {
                try {
                    file_2.createNewFile();
                    List<String> fileContent = Files.readAllLines(file.toPath());
                    Files.write(file_2.toPath(), fileContent, StandardOpenOption.APPEND);
                    Files.write(file_2.toPath(), fileContent, StandardOpenOption.APPEND);
                    System.out.println("Operacja wykonana");
                } catch (IOException e) {
                    System.out.println("Błąd dostępu");
                    e.printStackTrace();
                }
            }
        }
    }

// rozwiązanie Coderslab
    /*public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj nazwę pliku");
        String fileName = scan.nextLine();
        System.out.println(count(fileName));
        //System.out.println("Plik zawiera " + count(fileName) + " znaków");
    }

    public static int count(String fileName) {
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
    }*/
}

