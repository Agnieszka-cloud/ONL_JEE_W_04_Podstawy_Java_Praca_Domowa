package pl.coderslab.homeworks.strings;
//W pakiecie `pl.coderslab.homeworks.strings`, w pliku `Main07.java` umieść metodę o sygnaturze:
//
//        `public static String censor(String str, String[] words)`.
//
//        1. Metoda:
//
//        * rozbije łańcuch tekstowy na tablicę wyrazów,
//        * sprawdzi, czy nie znajdują się w nim słowa niedozwolone zawarte w tablicy `words`,
//        * jeśli tak -- zamieni je na cztery gwiazdki (****)
//        * ponownie połączy tablicę w string i zwróci wartość.

import java.util.Arrays;

public class Main07 {
    public static void main(String[] args) {
        String [] word = new String[]{"s", "pis", "ragan"};
        System.out.println(censor1("wulgaryzm psy kwiatki", new String[]{"wulgaryzm", "kos", "kota"}));
        System.out.println("===============================");
        System.out.println(censor1("blabla pis kot",word));
        System.out.println("===============================");
        System.out.println(ocenzurowanie("pis kotki psy",word));
        System.out.println("===============================");
        System.out.println(cenzurka("strstrunastragan",word));
        System.out.println("===============================");
        System.out.println(again("koń klacz klon",new String []{"ko","klacz","klon"}));
        System.out.println("===============================");
        System.out.println(censor2("koń klacz klon",new String []{"ko","klacz","klon"}));
        System.out.println("===============================");
    }
    public static String censor1(String str, String[] words) {
        System.out.println("censor1");
        String censored = "";
        String[] tablicaWyrazów= str.split(" ");
        //System.out.println(Arrays.toString(tablicaWyrazów));
        for (int i = 0; i < tablicaWyrazów.length; i++) {
            for (int j = 0; j < words.length; j++) {
                if (tablicaWyrazów[i].equals(words[j])) {
                    tablicaWyrazów[i] = "****";
                }
            }
            censored = censored + " " + tablicaWyrazów[i];
        }
        //censored = String.join(", ",  tablicaWyrazów);
        //censored = String.join(" ",  tablicaWyrazów);
        //return String.join(" ",  tablicaWyrazów);
        //System.out.println(Arrays.toString(tablicaWyrazów));
        return censored;
    }
    public static String ocenzurowanie(String str, String [] words){
        System.out.println("ocenzurowanie");
        String ocenzurowany = "";
        String [] tablicaWyrazówStr = str.split(" ");
        for (int i = 0; i < tablicaWyrazówStr.length; i++) {
            for (int j = 0; j < words.length; j ++) {
                if(tablicaWyrazówStr[i].equals(words[j])){
                    tablicaWyrazówStr[i] = "****";
                }
            }
            ocenzurowany = ocenzurowany + " " + tablicaWyrazówStr[i];
        }
        return ocenzurowany;
    }
    public static String cenzurka (String str, String [] words) {
        System.out.println("cenzurka");
        String [] tablicaSplitem = str.split("t");
        System.out.println(Arrays.toString(tablicaSplitem));
        String ocenzurowakno = " ";
        for (int i = 0; i < tablicaSplitem.length; i++) {
            //System.out.print(" " + tablicaSplitem[i]);
            for (int j = 0; j < words.length; j++) {
                //System.out.println(" " + words[j]);
                if (tablicaSplitem[i].equals(words[j])){
                    tablicaSplitem[i] = "****";
                }
            }
            ocenzurowakno = ocenzurowakno + tablicaSplitem[i] + " ";
        }
        return ocenzurowakno;
    }
    public static String again (String str, String [] words){
        System.out.println("again");
        String cenzurowanko = " ";
        String [] tablicaZŁańcuchaTekstowego = str.split(" ");
        System.out.println(Arrays.toString(tablicaZŁańcuchaTekstowego));
        for (int i = 0; i < tablicaZŁańcuchaTekstowego.length; i++) {
            for (int j = 0; j < words.length; j++) {
                if (tablicaZŁańcuchaTekstowego[i].equals(words[j])) {
                    tablicaZŁańcuchaTekstowego[i] = "****";
                }
            }
            cenzurowanko = cenzurowanko + tablicaZŁańcuchaTekstowego[i] + " ";
            //cenzurowanko = String.join(" ",tablicaZŁańcuchaTekstowego[i]);
            //System.out.println(cenzurowanko);
        }
        return cenzurowanko;
    }

    public static String censor2(String str, String[] words) {
        System.out.println("censor2");
        String[] strWords = str.split(" ", 0);
        System.out.println(Arrays.toString(strWords));
        for (int i = 0; i < strWords.length; i++) {
            for (String word : words) {
                if (strWords[i].toLowerCase().equals(word)) {
                    strWords[i] = "****";
                    break;
                }
            }
        }
        return String.join(" ", strWords);
    }
}
