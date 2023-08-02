// W pakiecie pl.coderslab.homeworks.exceptions,
// w pliku Main02.java umieść metodę o sygnaturze:
// public static String safeGet(String[] strTab, int index).
// uzupełnij ciało metody tak, aby zwracała element
// tablicy strTab zawarty pod indeksem index,
// dodaj obsługę odpowiedniego wyjątku,
// przetestuj działanie programu.
package pl.coderslab.homeworks.exceptions;
public class Main02 {
    public static void main(String[] args) {
        try {
            System.out.println(safeGet(new
                    String[]{"ji", "jij","hh","ji"},10));
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Wartość indeksu " +
                    "wykracza poza długość tablicy");
            e.printStackTrace();
        }
    }
    public static String safeGet(String[] strTab,int index){
        return strTab[index];
    }
}
