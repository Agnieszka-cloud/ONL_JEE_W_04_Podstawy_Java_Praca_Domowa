package pl.coderslab.homeworks.files;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class utwórzplik {
    public static void main(String[]args ){
        try (PrintWriter printWriter = new PrintWriter("text1.txt")){
            printWriter.println(2);
            printWriter.println(5);
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }
}
