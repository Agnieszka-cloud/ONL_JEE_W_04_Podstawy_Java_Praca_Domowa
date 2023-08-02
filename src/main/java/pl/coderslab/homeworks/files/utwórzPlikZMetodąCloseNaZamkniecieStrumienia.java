package pl.coderslab.homeworks.files;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class utwórzplikzmetodąclosenazamknieciestrumienia {
    public static void main(String[]args){
        try {
            PrintWriter printWriter = new PrintWriter("text2.txt");
            printWriter.println("aga");
            printWriter.println("ola");
            printWriter.println("przemo");
            printWriter.close();
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }
}
