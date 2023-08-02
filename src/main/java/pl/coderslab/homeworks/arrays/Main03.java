package pl.coderslab.homeworks.arrays;
//## Zadanie 3
//
//        W pakiecie `pl.coderslab.homeworks.arrays`, w pliku `Main03.java` umieść metodę o sygnaturze:
//
//        `public static boolean contains(int[] arr, int element)`.
//
//        1. uzupełnij ciało metody tak, by sprawdzała, czy w tablicy  `arr` istnieje `element`,
//        2. jeżeli tak ma zwracać `true`,
//        3. jeżeli nie ma zwracać `false`.
//

public class Main03 {
    public static void main (String [] args){
        System.out.println(contains(new int[] {2, 5, 8, 3,99,130},130));
        System.out.println(zawiera(new int[] {2, 5, 8, 3,99,130},130));
        System.out.println(czyZawiera(new int [] {77,89,45,99,7,2,190},45));
    }

    public static boolean contains (int[] arr, int element){
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == element){
                return true;
            }
        }
        return false;
    }

    public static boolean zawiera (int[] arr, int element){
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == element){
                return true;
            }
        }
        return false;
    }

//        1. uzupełnij ciało metody tak, by sprawdzała, czy w tablicy  `arr` istnieje `element`,
//        2. jeżeli tak ma zwracać `true`,
//        3. jeżeli nie ma zwracać `false`.
//
    public static boolean czyZawiera (int []arr,int e){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == e) {
                return true;
            }
        }
        return false;
    }
}


