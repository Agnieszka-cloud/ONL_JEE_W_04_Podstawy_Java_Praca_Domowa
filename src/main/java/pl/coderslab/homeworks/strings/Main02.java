/*
W pakiecie `pl.coderslab.homeworks.strings`, w pliku `Main02.java` umieść metodę o sygnaturze:

        `public static String replaceStr(String str, String forReplace, String replacement)`.

        1. Uzupełnij ciało metody tak, aby zwracała napis powstały z zamiany w napisie `str`
        wszystkich wystąpień napisu `forReplace` przez napis `replacement`.
*/

package pl.coderslab.homeworks.strings;

import java.util.Arrays;

public class Main02 {
    public static void main(String[] args) {
        System.out.println("replaceStr: " + replaceStr("agnieszka kocha przemka i przemek kocha przemka","przemka", "Olę"));
        System.out.println("replaceStr: " + replacesStr("I love you monster", "monster", "Przemek"));
        System.out.println("=================================================");
        System.out.println("replace: " + replace("agnieszka kocha przemka i przemek kocha przemka","przemka", "Olę"));
        System.out.println("=================================================");
        System.out.println("replace: " + replace("I love you monster", "monster", "Przemek"));
    }
    public static String replaceStr(String str,String forReplace, String replacement){
        String changed = str.replaceAll(forReplace,replacement);
        return changed;
    }
    public static String replacesStr(String str, String forReplacing, String replacement){
        String replaced = str.replaceAll(forReplacing,replacement);
        return replaced;
    }
    public static String replace (String str, String forReplace, String replacement){
        String zamiana = "";
        String [] tablica = str.split(" ");
        System.out.println(Arrays.toString(tablica));
        for (int i = 0; i < tablica.length; i++) {
            if ( tablica[i].equals(forReplace)){
                tablica[i] = replacement;
            }
            zamiana = zamiana + tablica[i] + " ";
        }
        return zamiana;
    }
}
