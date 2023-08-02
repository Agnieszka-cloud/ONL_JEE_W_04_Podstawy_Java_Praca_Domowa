/*
W pakiecie `pl.coderslab.homeworks.strings`, w pliku `Main03.java`
umieść metodę o sygnaturze:
`public static String upperCase(String str, int index)` .

1. Metoda zwraca napis `str`, w którym znaki zostały
zamienione na duże w pozycjach podzielnych przez `index`.

*/
package pl.coderslab.homeworks.strings;


public class Main03 {

    public static void main(String[] args) {
        System.out.println(upperCase1("agnieszka kocha przemka", 2));
        System.out.println(zmieńNaDuże("agnieszka", 3));
        System.out.println(upperCase2("agnieszka", 3));
        System.out.println(upperCase3("agnieszka", 4));

    }
    public static String upperCase1(String str, int index){
        String changed = "";
        for(int i = 0; i < str.length(); i++){
            if( i % index == 0){
                changed = changed + str.toUpperCase().charAt(i);
            }else changed = changed + str.charAt(i);
        }
        return changed;
    }
    public static String zmieńNaDuże (String str, int index){
        String zmieniony = "";
        for (int i = 0; i < str.length(); i++) {
            if(i % index == 0){
                zmieniony = zmieniony + str.toUpperCase().charAt(i);
            } else {
                zmieniony = zmieniony + str.charAt(i);
            }
        }
        return zmieniony;
    }
    public static String upperCase2(String str, int index) {
        if (index == 0) {
            return "indeks nie może być równy zero";
        }
        char[] letters = str.toCharArray();
        for (int i = 0; i < letters.length; i ++) {
            if (i % index == 0)
                letters[i] = Character.toUpperCase(letters[i]);
        }
        return String.copyValueOf(letters);
    }
    public static String upperCase3(String str, int index) {
        if (index == 0) {
            return "indeks nie może być równy zero";
        }
        char[] letters = str.toCharArray();
        for (int i = 0; i < letters.length; i += 4) // nie rozumiem tego, już rozumiem i += index
            // czyli przejdź tyle miejsc ile cyfra wynosi i tyle równa się i
        {
            letters[i] = Character.toUpperCase(letters[i]);
        }
        return String.copyValueOf(letters);
    }
}
