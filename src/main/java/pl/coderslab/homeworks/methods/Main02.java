package pl.coderslab.homeworks.methods;
//## Zadanie 2
//
//        W pakiecie `pl.coderslab.homeworks.arrays`,
//        w pliku `Main02.java` umieść metodę o sygnaturze
//        `public static boolean divisibleBy(int a, int b )`:
//        1. Uzupełnij ciało metody tak aby zwracała `true`
//        bądź `false` w zależności czy zmienna `a` jest
//        podzielna przez `b`.


public class Main02 {

    public static void main(String[] args) {
        System.out.println(divisibleByy(5, 9));
        System.out.println(divisibleBy(5, 9));
        System.out.println(podzielny(9,9));
        czyPodzielny(9,3);
    }

    public static boolean divisibleByy(int a, int b) {
        if (a % b == 0) {
            return true;
        } else
            return false;
    }
    // powinno być tak!!!! return a % b == 0; Przemek byłby zadowolony a on się zna

    public static boolean divisibleBy(int a, int b) {
        if (a % b == 0) {
            return true;
        } else
            return false;
    }
    // powinno być tak!!!! return a % b == 0; Przemek byłby zadowolony a on się zna
    public static boolean podzielny(int a, int b){
        if (a % b == 0){
            return true;
        }
        return false;
    }
    public static void czyPodzielny ( int a, int b){
        if ( a % b == 0 ){
            System.out.println("podzielny");
        } else {
            System.out.println("niepodzielny");
        }
    }
}