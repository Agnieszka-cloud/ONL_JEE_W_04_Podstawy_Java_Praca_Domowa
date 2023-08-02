/*
W pakiecie `pl.coderslab.homeworks.strings`, w pliku `Main04.java`
umieść  metodę  o sygnaturze `public static int tripple(String str)`
1. Metoda zwraca ilość potrójnych wystąpień znaków w napisie
Przykład dla qazbbbwsx -> 1, dla aaawsxbbb ->2
*/
package pl.coderslab.homeworks.strings;

public class Main04 {
    public static void main(String[] args) {
        String str = "aaaawsxbbb";
        System.out.println("W tekście \"" + str + "\" potrójne wystąpienia " +
                "znaków pojawiają się " +
                triple1(str) + " razy");      // \" co to znaczy? cudzysłów w javie

        System.out.println(triple2("ee"));
        System.out.println(triple1(str));
        System.out.println(triple2(str));
        System.out.println(szukajPotrójnychWystąpień(str));
        System.out.println(szukajPotrójnychWystąpień("uuukkokijuihikkkbybiylll"));

    }

    public static int triple1(String str) {
        if (str.length() < 3) {
            return 0;
        }
        int triples = 0;
        for (int i = 2; i < str.length(); i++) {
            if (str.charAt(i - 1) == str.charAt(i) && str.charAt(i - 1) == str.charAt(i - 2)) {
                triples++;
                i +=2;
                // i +=2; po co to? bez tego też działa a już wiem po co żeby nie liczył aaaa jako dwóch tripletów
            }
        }
        return triples;
    }

    public static int triple2 (String str){
        int ilośćPotrójnych = 0;
        for( int i = 2; i < str.length() ; i++){
            if ( str.charAt(i) == str.charAt(i -1) && str.charAt(i - 1) == str.charAt(i -2) ) {
                ilośćPotrójnych++;
                i +=2;
            }
        }
        return ilośćPotrójnych;
    }
    public static int szukajPotrójnychWystąpień (String str){
        int ilośćWystapieńPotrójnych = 0;
        for (int i = 2; i < str.length(); i++) {
            if (str.charAt(i) == str.charAt(i-1) && str.charAt(i-2) == str.charAt(i)){
                ilośćWystapieńPotrójnych ++;
                // tu policzy wszystkie możliwości tripletów
            }
        }
        return ilośćWystapieńPotrójnych;
    }
}
