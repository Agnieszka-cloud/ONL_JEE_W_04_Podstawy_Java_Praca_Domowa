// W pakiecie pl.coderslab.homeworks.files,
// w pliku Main04.java stwórz metodę o sygnaturze:
// public static void rewrite().
// uzupełnij ciało metody tak, aby wczytała z konsoli nazwę pliku,
// sprawdzi czy plik istnieje i jeżeli istnieje stworzy drugi plik z sufiksem "_2", do którego 2-krotnie zostanie zapisana zawartość pliku wzorcowego.
// Przykład dla nazwy pliku text1.txt, z zawartością abc,
// zostanie utworzony plik, o nazwie text1_2.txt i zawartości:
package pl.coderslab.homeworks.files;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Locale;
import java.util.Scanner;

public class Main04 {

    public static void main(String[] args) {

        rewriten();
    }
    public static void rewriten () {
        PrintWriter printWriter = null;
        System.out.println("Podaj nazwę pliku:");
        try{
            Scanner scanner = new Scanner(System.in);
            StringBuilder sb = new StringBuilder();
            String fileName = scanner.nextLine();
            File fil = new File(fileName);
            /*if(!fil.exists()){
                System.out.println("Plik wyjściowy nie istnieje.");
            }*/
            scanner = new Scanner(new File(fileName));
            String fileName_2 = fileName.substring(0,fileName.lastIndexOf('.'))+ "_2" + fileName.substring(fileName.lastIndexOf('.'));
            //String fileName_22 = fileName.substring(0,fileName.lastIndexOf('.'))+ "_22" + fileName.substring(fileName.lastIndexOf('.'));
            File file = new File(fileName_2);
            if(file.exists()){
                System.out.println("Plik docelowy już istnieje.");
            }else {
                /*System.out.println(fileName_2);
            System.out.println(fileName.lastIndexOf('.'));
            System.out.println(fileName.substring(0,fileName.lastIndexOf('.')));
            System.out.println(fileName.substring(0,fileName.lastIndexOf('.')) + "_2");
            System.out.println(fileName.substring(fileName.lastIndexOf('.')));
            System.out.println(fileName + "_2");*/

                /*  System.out.println
                    (str != null ?
                    str.length() : "Obiekt jest nullem czyli nie istnieje.");   */

                /*  String fileName_2 =

                    (fileName.lastIndexOf('.') != -1) ?
                    (fileName.substring(0, fileName.lastIndexOf('.')) + "_2" +
                            fileName.substring(fileName.lastIndexOf('.'))) : (fileName + "_2");

            File file_2 = new File(fileName_2);*/

                //printWriter = new PrintWriter(fileName.substring(0,fileName.lastIndexOf('.'))+ "_2" + fileName.substring(fileName.lastIndexOf('.')));
                printWriter = new PrintWriter(fileName_2);
                while (scanner.hasNextLine()) {
                    String line = scanner.nextLine();
                    sb.append(line + "\n");
                    System.out.println(line);
                }
                printWriter.println(sb.toString() + sb.toString());
            }
        }catch (FileNotFoundException e){
            System.out.println("Nie ma takiego pliku ani katalogu.");
        }
        finally {
            if(printWriter != null)
                printWriter.close();
        }
    }
}
