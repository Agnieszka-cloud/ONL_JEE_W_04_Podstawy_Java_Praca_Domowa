/*
W pakiecie `pl.coderslab.homeworks.strings`, w pliku `Main01.java`
        umieść metodę o sygnaturze:
        `public static String replaceChar(String str, char forReplace, char replacement)`.

        1. Uzupełnij ciało metody tak, aby zwracała napis powstały z zamiany
        w napisie `str`
        wszystkich znaków `forReplace` przez znaki `replacement`.
*/
package pl.coderslab.homeworks.strings;

public class Main01 {

    public static void main(String[] args) {

        System.out.println("replaceChar: " + replaceChar("agnieszka kocha przemka", 'k', 'l'));
        System.out.println("replaceChar1:  " + replaceChar1("aknieszka", 'k', 'g'));
        System.out.println("replaceChar2: " + replaceChar2("Berlin Lisbona Amsterdam",'A','R'));
    }

    public static String replaceChar(String str, char forReplace, char replacement) {
        String changed = "";
        for (int i = 0; i < str.length(); i++) {
            char single = str.charAt(i);
            if (str.charAt(i) == forReplace) {
                changed = changed + replacement;
            } else changed = changed + str.charAt(i);
        }
        return changed;
    }

    public static String replaceChar1(String str, char forReplace, char replacement) {
        String changed1 = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == forReplace) {
                changed1 = changed1 + replacement;
            } else changed1 = changed1 + str.charAt(i);
        }
        return changed1;
    }

    public static String replaceChar2(String str, char forReplace, char replacement){
        return str.replace(forReplace,replacement);
    }
}
