//# Zadanie 2
//        W pakiecie `pl.coderslab.homeworks.arrays`,
//        w pliku `Main02.java` umieść metodę o sygnaturze:
//        `public static int[] append(int[] arr)`.
//        1. Uzupełnij ciało metody tak, aby dla otrzymanej tablicy
//        jej zawartość została skopiowana do tymczasowej tablicy,
//        której rozmiar ma być 2-krotnie większy od tablicy podanej.

//        2. Uzupełnij brakujące elementy tymczasowej tablicy
//        elementami tablicy pierwotnej w odwrotnej kolejności.

//        3. Metoda ma zwrócić skopiowaną i uzupełnioną tablicę.
//        Przykład: dla tablicy int arr[] = {1,2,3}; ma zostać
//        zwrócona tablica int arrTmp[] = {1,2,3,3,2,1};

package pl.coderslab.homeworks.arrays;
import java.util.Arrays;
public class Main02 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(append1(new int[]{5, 9, 3})));
        System.out.println(Arrays.toString(append2(new int[4])));
        int [] sample = {3,4,6,8}; // 4
        System.out.println(Arrays.toString(dodaj(sample)));
    }

    public static int [] append1(int[] arr){
        //int [] arrTemp = Arrays.copyOf(arr,arr.length*2);
        System.out.println("Arrays.toString(copyOf(arr,arr.length*2): " + Arrays.toString(Arrays.copyOf(arr,arr.length*2)));
        int [] arrTemp = new int[arr.length*2];
        for (int i = 0; i < arrTemp.length; i++){
            if( i < arrTemp.length/2){
                arrTemp[i] = arr[i];
            } else {
                arrTemp[i] = arr[arr.length - i + arr.length - 1];
                // 3 - 3 = 0 + ostatni
            }
        }
        return arrTemp;
    }

    public static int[] append2(int[] arr) {
        int[] arrTempp = new int[arr.length * 2];
        int [] arrTemp = Arrays.copyOf(arr,arr.length*2);
        for (int i = 0; i < arrTempp.length; i++) {
            if (i < arrTempp.length / 2) {
                arrTempp[i] = arr[i];
            } else {
                arrTempp[i] = arr[arr.length - i + arr.length - 1];
                // 3 - 3 = 0 + ostatni
            }
        }
        return arrTempp;
    }

    public static int[] dodaj(int[]arr){
        int [] sample = {3,4,6,8}; // 4
        int [] arrTem = Arrays.copyOf(arr,arr.length *2);
        for (int i = 0; i < arrTem.length; i++) {
            if (i < arrTem.length/2){
                arrTem[i] = arr[i];
            } else arrTem[i] = arr[arr.length + arr.length -1 - i];
        }
        return arrTem;
    }
}
