//W pakiecie pl.coderslab.homeworks.exceptions,
// w pliku Main05.java umieść metodę o sygnaturze:
// public static int indexOf(int[] elements, int value).
// uzupełnij ciało metody tak, aby zwracała index elementu
// value zawartego w tablicy elements,
// jeśli tablica nie posiada podanego elementu zwróć wyjątek
// NoSuchElementException,
// przetestuj działanie programu wywołując metodę indexOf z elementem,
// który występuje w tablicy i z takim, który w niej nie występuje,
// przy wywołaniu metody indexOf dodaj obsługę
// wyjątku NoSuchElementException.
// przetestuj ponownie działanie programu.
package pl.coderslab.homeworks.exceptions;

import java.util.NoSuchElementException;

public class Main05 {

    public static void main(String[] args) {
        int[] elements = {1,2,3,4,5,};
        int value = 9;
        try {
            System.out.println(indexOf(elements,value));
        }catch (NoSuchElementException e){
            System.out.println(" indexOf NIE MA TAKIEGO ELEMENTU W TABLICY");
            e.printStackTrace();
        }

    }
    public static int indexOf(int[] elements, int value){
        for (int i = 0; i < elements.length; i++) {
            if (elements[i] == value) {
                //result = i;
                return i;
            }
        }
        throw  new NoSuchElementException();
    }

}
