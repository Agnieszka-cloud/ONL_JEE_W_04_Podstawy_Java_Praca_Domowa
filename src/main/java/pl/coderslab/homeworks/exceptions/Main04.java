// W pakiecie pl.coderslab.homeworks.exceptions,
// w pliku Main04.java umieść metodę o sygnaturze:
// public static int toInt(String str).
// uzupełnij ciało metody tak, aby zwracała
// napis str zamieniony na typ int,
// obsłuż możliwe wyjątki.
package pl.coderslab.homeworks.exceptions;
public class Main04 {
    public static void main(String[] args) {
        try {
            System.out.println(toInt(null));
        }catch (NumberFormatException e){
            System.out.println("Wyjątek dotyczący formatu liczb");
            e.printStackTrace();
        }catch(NullPointerException e){
            System.out.println("Str nie może być nullem czyli pusty. " +
                    "Argument nie istnieje");
            e.printStackTrace();
        }
    }
    public static int toInt(String str){
        return
                Integer.parseInt(str);
    }
}
