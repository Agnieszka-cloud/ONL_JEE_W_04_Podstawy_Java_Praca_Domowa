//W pakiecie pl.coderslab.homeworks.exceptions,
// w pliku Main01.java umieść metodę o sygnaturze:
//public static void average(String a, String b).
// uzupełnij ciało metody tak, aby dokonała konwersji
// zmiennych a i b na typ liczbowy int i wykonała dzielenie
// zmiennej a przez zmienną b,
// zabezpiecz program przed możliwymi błędami,
// dodaj sekcję, która wykona się zawsze niezależnie od tego,
// czy wystąpi błąd, czy nie,
// pamiętaj o błędzie ArithmeticException,
// zmień typ zmiennych a i b na double i sprawdź jakie otrzymasz wyniki
// w przypadku dzielenia przez 0.
// Zapoznaj się z artykułami:
// https://www.geeksforgeeks.org/g-fact-33-infinity-or-exception/
// https://docs.oracle.com/javase/specs/jls/se7/html/jls-15.html#jls-15.17.2
package pl.coderslab.homeworks.exceptions;

public class Main01 {

    public static void main(String[] args) {
        String a = "6";
        String b = "-2";
        try {
            average(a, b);
        }catch(NumberFormatException e){
            System.out.println("Niepoprawny format liczby");
            e.printStackTrace();
        }catch(ArithmeticException e){
            System.out.println("Błąd dzielenia przez zero");
            e.printStackTrace();
        }finally {
            System.out.println("wykona się tylko na liczbach całkowitych podzielnych przez b");
        }
    }
    public static void average(String a, String b){
        int aInt = Integer.parseInt(a);
        int bInt = Integer.parseInt(b);
        System.out.println(aInt / bInt);
    }

}
