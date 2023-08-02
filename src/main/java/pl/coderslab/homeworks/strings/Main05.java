/*
Szyfr Cezara jest to szyfr, za pomocą którego Juliusz Cezar
szyfrował swoje listy do Cycerona.

W pakiecie `pl.coderslab.homeworks.strings`,
w pliku `Main05.java` umieść metodę o sygnaturze:
`public static String encode(String str)`.
1. Uzupełnij ciało metody tak, by zwracała napis
zaszyfrowany szyfrem Cezara.
*/
package pl.coderslab.homeworks.strings;

public class Main05 {
    public static void main(String[] args) {
        System.out.println("encode1:    " + encode1("niezaleznoscxyz"));
        System.out.println("zaszyfruj: " + zaszyfruj("niezaleznoscxyz"));
        System.out.println("zaszyfruj: " + zaszyfruj("abcdefghijklmnopqrstuvwxyz"));
        System.out.println("encode2:   " + encode2("abcdefghijklmnopqrstuvwyxz",3));
    }

    public static String encode1(String str) {
        // alfabet a-xyz to od 97 do 122
        String cezar = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            char przesunięta = (char) (str.charAt(i) + 3);
            if (str.charAt(i) >= 97 && str.charAt(i) < 120) {
                przesunięta = (char) (str.charAt(i) + 3);
            } else if (str.charAt(i) >= 120) {
                przesunięta = (char) (str.charAt(i) - 23);
            }
            cezar = cezar + przesunięta;
        }
        return cezar;
    }

    public static String zaszyfruj(String str) {
        String zaszyfrowany = "";
        // od 97 włącznie do 122 włącznie
        for (int i = 0; i < str.length(); i++) {
            char alfabetu = str.charAt(i);
            System.out.print(alfabetu + "  ");
            char alfabetOTrzy = (char) (str.charAt(i) + 3);
            if (str.charAt(i) >= 97 && str.charAt(i) < 120) {
                alfabetOTrzy = (char) (str.charAt(i) + 3);
            } else if (str.charAt(i) >= 120) {
                alfabetOTrzy = (char) (str.charAt(i) - 23);
            }
            zaszyfrowany = zaszyfrowany + alfabetOTrzy;
        }
        System.out.println();
        return zaszyfrowany;
    }

    public static String encode2(String str, int shift) {
        char[] letters = str.toCharArray();
        for (int i = 0; i < letters.length; i++) {
            if ((letters[i] >= 65) && (letters[i] <= 90)) {
                letters[i] = letters[i] + shift <= 90
                        ? (char) (letters[i] + shift) : (char) (letters[i] + shift - 26);
            }
            if ((letters[i] >= 97) && (letters[i] <= 122)) {
                letters[i] = letters[i] + shift <= 122
                        ? (char) (letters[i] + shift) : (char) (letters[i] + shift - 26);
            }
        }
        return String.copyValueOf(letters);
    }

}
