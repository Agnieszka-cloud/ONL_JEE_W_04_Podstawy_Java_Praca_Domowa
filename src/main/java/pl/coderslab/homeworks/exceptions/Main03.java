// W pakiecie pl.coderslab.homeworks.exceptions,
// w pliku Main03.java umieść metodę o sygnaturze:
// public static int getLength(String str).
// uzupełnij ciało metody tak, aby zwracała długość napisu str,
// przetestuj działanie metody przekazując do niej parametr
// o wartości null,
// zabezpiecz program przed wystąpieniem wyjątku
// NullPointerException.
package pl.coderslab.homeworks.exceptions;
public class Main03 {
    public static void main(String[] args) {
        String str = null;
        try {
            System.out.println(getLength(str));
        } catch (NullPointerException e) {
            System.out.println("str nie może być nullem czyli pusty");
            e.printStackTrace();
        }
    }
    public static int getLength(String str){
        return str.length();
    }
}
