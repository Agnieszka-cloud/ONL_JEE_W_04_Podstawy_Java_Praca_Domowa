package pl.coderslab.homeworks.methods;
//## Zadanie 1
//        W pakiecie `pl.coderslab.homeworks,methods
//        `, w pliku
//        `Main01.java` umieść metodę o sygnaturze `public static
//        double dogAge(double dogAge)` , która przeliczy wiek psa
//        w psich latach.
//        * funkcja powinna przyjmować wiek psa jako parametr,
//        * dla pierwszych dwóch lat, każdy rok życia psa jest równy
//        10.5 ludzkiego roku,
//        * powyżej dwóch lat, każdy rok życia psa, to 4 ludzkie lata,
//        * funkcja powinna zwrócić wiek psa.
//        ##### Przykład:
//        dogAge(1.5)  # spodziewany wynik: 1.5 * 10.5 = 15.75
//        dogAge(5)  # spodziewany wynik: 2 * 10.5 + 3 * 4 = 33

public class Main01 {
    public static void main(String[] args) {
        System.out.println(dogAge(9));
        System.out.println(dogAgedog(9));
        System.out.println(wiekPsa(9));
        System.out.println(wiekPsi(9));
    }

    public static double dogAge(double dogAge) {
        if (dogAge <= 2) {
            return dogAge * 10.5;
        } else {
            return 2 * 10.5 + (dogAge - 2) * 4;
        }
    }

    public static double dogAgedog(double dogAge) {
        if (dogAge <= 2) {
            return dogAge * 10.5;
        } else {
            return 2 * 10.5 + (dogAge - 2) * 4;
        }
    }
//    dla pierwszych dwóch lat, każdy rok życia psa jest równy
//        10.5 ludzkiego roku,
//        * powyżej dwóch lat, każdy rok życia psa, to 4 ludzkie lata,
//        * funkcja powinna zwrócić wiek psa.
//        ##### Przykład:
//        dogAge(1.5)  # spodziewany wynik: 1.5 * 10.5 = 15.75
//        dogAge(5)  # spodziewany wynik: 2 * 10.5 + 3 * 4 = 33

    public static double wiekPsa(double wiekL) {
        double wiekPsi = 0;
        if (wiekL <= 2) {
            wiekPsi = wiekL * 10.5;
        } else if (wiekL > 2) {
            wiekPsi = 2 * 10.5 + (wiekL - 2) * 4;
        }
        return wiekPsi;
    }

    public static double wiekPsi (double wiekPsa){
        if (wiekPsa <= 2){
            return wiekPsa * 10.5;
        } else {
            return 2 * 10.5 + (wiekPsa - 2) * 4;
        }
    }

}
