package pl.coderslab.homeworks.arrays;

// W pakiecie `pl.coderslab.homeworks.arrays`, w pliku `Main01.java` umieść metodę o sygnaturze:
//
//        `public static int[] returnUnique(int[] arr)`.
//
//        Uzupełnij ciało metody w taki sposób by z tablicy `arr` wybrała wszystkie występujące liczby
//        ale w taki sposób by sie nie powtarzały,
//        które następnie mają być zwrócone z metody.
//        Przykład dla tablicy [1,1,2,3,3,4], powinniśmy otrzymać [1,2,3,4].

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.stream.Collectors;

public class Main01 {
    public static void main(String[] args) {
        int[] arrr = {1, 2, 1, 4, 2};
        System.out.println("Arrays.toString arrr returnUnique2: " + Arrays.toString(returnUnique2(arrr)));
        System.out.println("==================================");

        int[] arrr1 = {1, 2, 1, 4, 2};
        System.out.println("returnUnique4: " + Arrays.toString(returnUnique4(arrr1)));
        System.out.println("===================================");

        int[] arrr2 = new int[10];
        arrr2 = Arrays.copyOf(arrr, 10);
        System.out.println("długość tablicy arrr2: " + arrr2.length);
        System.out.println("==================================");

        System.out.println("elementy tablicy arrr: " + Arrays.toString(arrr));
        System.out.println("==================================");

        System.out.println("elementy tablicy arrr2: " + Arrays.toString(arrr2));
        System.out.println("==================================");

        Arrays.sort(arrr2);
        System.out.println("Arrays.sort: " + Arrays.toString(arrr2));
        System.out.println("==================================");

        int[] clonedArray = arrr2.clone();
        System.out.println("clone array: " + Arrays.toString(clonedArray));
        System.out.println("==================================");

        Arrays.fill(arrr2, 3);
        System.out.println("Arrays.fill: " + Arrays.toString(arrr2));

        System.out.println("for i ");
        for (int i : arrr2) {
            System.out.print(i + ",");
        }
        System.out.println();
        System.out.println("=====================================");

        System.out.println("Arrays.equals:  " + Arrays.equals(arrr, arrr2));
        System.out.println("===================================");

        int[] arrr3 = {1, 2, 3, 0, 3, 3, 9, 0};
        System.out.println("Arrays.toString arrr3 returnUnique1: "  + Arrays.toString(returnUnique1(arrr3)));
        System.out.println("===================================");

        System.out.println("Arrays.toString distinct: " + Arrays.toString(distinct(new int[]{8, 2, 3, 0, 3, 3, 9, 0})));
        System.out.println("===================================");

        System.out.println("Arrays.toString returnUnique3: " + Arrays.toString(returnUnique3(new int[]{1, 2, 3, 0, 3, 3, 9, 0})));
        System.out.println("===================================");

        System.out.println("Arrays.toString returnUnique4: " + Arrays.toString(returnUnique4(new int[]{1, 2, 3, 0, 3, 3, 9, 0})));
        System.out.println("===================================");

        System.out.println(" StringBuilder s; Integer.parseInt(s.toString()); : " + returnUnique5(new int[]{1, 2, 3, 0, 3, 3, 9, 0}));
        System.out.println("===================================");

        System.out.println("Arrays.toString returnUnique6: " + Arrays.toString(returnUnique6(new int[]{1, 2, 3, 0, 3, 3, 9, 0})));
        System.out.println("===================================");

        System.out.println("Arrays.toString returnUnique7: " + Arrays.toString(returnUnique7(new int[]{8, 2, 3, 0, 3, 3, 9, 0})));
        System.out.println("===================================");

        System.out.print("Arrays.toString zwróćUnikalne: " + Arrays.toString(zwróćUnikalne(new int[]{6, 7, 6, 8, 0})));
        System.out.println();
        System.out.println("===================================");


        int n = 20;
        int[] arr = new int[n];
        Random r = new Random();
        for (int i = 0; i < n; i++) {
            arr[i] = r.nextInt(101);
        }
        int[] arrUnique = returnUnique1(arr).clone();
        for (int i : arrUnique) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.print("=======================================");
    }

    public static int[] returnUnique1(int[] arrn) {
        int[] arTem = new int[arrn.length];
        // to ma długość 8 wypełnione zerami bo taką długość ma arrn
        // int [] arrn = new int[]{1, 2, 3, 0, 3, 3, 9, 0}
        int tem = 0; // po pierwszej pętli 1 //liczba unikalnych, która na początku jest pusta czyli 0
        for (int i = 0; i < arrn.length; i++) {
            int element = arrn[i];
            System.out.print(element + ";");
            if (!contains1(arTem, element, tem)) { // jeśli nie zawiera to dodaj/ 1, 2, 3, 0, 9
                arTem[tem] = element;
                tem++; // dodaj 1
            }
        }
        System.out.println();
        return Arrays.copyOf(arTem, tem);
    }
    public static boolean contains1(int[] arTem, int element, int tem) {
        for (int i = 0; i < tem; i++) {
            if (arTem[i] == element) {
                return true;
            }
        }
        return false;
    }

    public static int[] zwróćUnikalne(int[] przykładowaTablicaCyfr) {
        int[] tablicaDługościPrzykładowej = new int[przykładowaTablicaCyfr.length]; // length żeby sprawdzić jej wszystkie elementy
        int ilośćUnikalnych = 0; // żeby poznać długość nowej tablicy złożonej tylko z niepowtarzających
        for (int i = 0; i < przykładowaTablicaCyfr.length; i++) {
            int ElementWyodrębnionyZPrzykładowej = przykładowaTablicaCyfr[i];
            System.out.println("Elementy przykładowej tablicy: " + przykładowaTablicaCyfr[i] + " ");
            System.out.println("Długość przykładowej tablicy: " + przykładowaTablicaCyfr.length);
            System.out.println("To jest element wyodrębniony z przykładowej tablicy: " + ElementWyodrębnionyZPrzykładowej );

            if (!zawieraElement(tablicaDługościPrzykładowej, ElementWyodrębnionyZPrzykładowej, ilośćUnikalnych)) {
                tablicaDługościPrzykładowej[ilośćUnikalnych] = ElementWyodrębnionyZPrzykładowej;
                ilośćUnikalnych++;
            }
        }
        System.out.println("==============================================");
        System.out.println("ilość unikalnych: " + ilośćUnikalnych);
        System.out.println("==============================================");
        return Arrays.copyOf(tablicaDługościPrzykładowej, ilośćUnikalnych);
    }
    public static boolean zawieraElement(int[] tablicaDLugościPrzykładowej, int ElementWyodrębionyZPrzykładeowej, int ilośćUnikalnych) {
        for (int i = 0; i < ilośćUnikalnych; i++) {
            if (tablicaDLugościPrzykładowej[i] == ElementWyodrębionyZPrzykładeowej) {
                return true;
            }
        }
        return false;
    }

    public static int[] returnUnique2(int[] arr) {
        Arrays.sort(arr);
        int[] arrTemp = new int[arr.length];
        int j = 1;
        arrTemp[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1]) {
                arrTemp[j] = arr[i];
                j++;
            }
        }
        return Arrays.copyOf(arrTemp, j);
    }

    public static int[] returnUnique3(int[] arr) {
        return Arrays.stream(arr)
                .boxed()
                .collect(Collectors.toSet())
                .stream()
                .mapToInt(i -> i)
                .toArray();
    }

    public static int[] returnUnique4(int[] arr) {
        ArrayList<Integer> unique = new ArrayList<Integer>();
        for (int i = 0; i < arr.length; i++) {
            if (!unique.contains(arr[i])) {
                unique.add(arr[i]);
            }
        }
        int[] uniqueArrayInt = new int[unique.size()];
        for (int i = 0; i < uniqueArrayInt.length; i++) {
            uniqueArrayInt[i] = unique.get(i);
        }
        return uniqueArrayInt;
        //return unique.stream().mapToInt(i -> i).toArray();
    }

    public static int returnUnique5(int[] arrr) {
        int[] arrrTemp = new int[arrr.length];
        int newLenght = 0;
        int[] a = new int[1];
        for (int liczba:arrr) {
            System.out.print(liczba + ",");
            boolean result = false;
            for (int j = 0; j < newLenght; j++) {
                if (liczba == arrrTemp[j]) {
                    result = true;
                    break;
                }
            }
            if(result){
                continue;
            }
            arrrTemp[newLenght] = liczba;
            newLenght++;
        }
        Arrays.fill(a,newLenght);
        StringBuilder s= new StringBuilder();
        for (int i:a) {
            s.append(i);
        }
        //return Arrays.copyOf(arrrTemp, newLenght);
        return Integer.parseInt(s.toString());
    }

    public static int[] distinct(int [] numbers) {
        int[] distinctNumbers = new int[numbers.length];
        int distinctNumbersCount = 0;
        // będziemy tworzyć dopiero na końcu tablicę, w której będą unikalne liczby
        // i dopiero na końcu będzie wiadomo ile ich jest więc tylko dopiero wtedy
        // poznam długość wyjściowej tablicy unikalnych
        for (int number : numbers) { // tu przypisuję w pamięci każdy element z tablicy numbers do
            // elementu number, mam wtedy do każdego elementu dostęp
            System.out.print(number + ",");
            // tutaj, za pomocą boolean contains prawda czy fałsz ( za pomocą == )  będę sprawdzać czy elementy
            // z tablicy numbers
            // już się znajdują
            // w tablicy distinctNumbers. Na początku nic się nie znajduje w niej bo jest
            // 0 długości wystąpień unikalnych czyli int distinctNumbersCount = 0,
            // a jest zero bo na początku przecież nie ma żadnej długości czyli żadnych elementów
            // a tablica distinctNumbers[i] jest wypełniona na tym poziomie zerami
            boolean contains = false;
            for (int i = 0; i < distinctNumbersCount ; i++) {
                // jest 0 długości więc wychodzi z pętli za pierwszym razem
                // za drugim razem już ma długość 1 więc pętla się wykona
                if(number == distinctNumbers[i]) {
                    // tu sprawdzi czy są równe a jak są równe to znaczy że występują tu i tu
                    // a jeśli już występuje dany element w obu tablicach to zrób break wyjdź
                    // z pętli i wtedy odpowiedź jest true czyli tak znajduje sie już
                    contains = true;
                    break;
                }
            }
            // a tu idzie dalej info boolean contains = true; że znajduje się dany element
            // więc continue znaczy: to pomiń i idź dalej
            if(contains) { //true
                continue;
            }
            distinctNumbers[distinctNumbersCount] = number;
            // tu dodaj pierwszy element int number = 8  bo jest polecenie =
            // i kolejne następne jeśli contains is false bo wtedy continue nie dotyczy bo false
            // i wtedy to znaczy że nie znajduje się dany element jeszcze w distinctNumbers
            // i DOPIERO TUTAJ TABLICA DISTINCTNUMBERS WYPEŁNIA SIĘ ELEMENTAMI numbers które
            // pojawiły się pierwszy raz
            distinctNumbersCount++;
            // a tu zwiększa o jeden liczbę distinctNumberCount
            // bo miał dodawać jeśli liczba jeszcze nie występowała w tablicy distinctNumbers
        }

        return Arrays.copyOf(distinctNumbers, distinctNumbersCount);
    }


    public static int [] returnUnique6(int [] arrn ){
        int [] arTem = new int[arrn.length];
        int tem = 0;
        for(int i = 0; i< arrn.length; i++){
            if(!contains6(arTem,arrn[i],tem )){
                arTem[tem] = arrn[i];
                tem++;
            }
        }
        return Arrays.copyOf(arTem,tem);
    }
    public static boolean contains6(int[] arr, int element, int temporary) {
        for (int i = 0; i < temporary; i++) {
            if (arr[i] == element) {
                return true;
            }
        }
        return false;
    }

    public static int[] returnUnique7(int[] arr) {
        int[] arrTemp = new int[arr.length];
        int[] a = new int[1];
        int amoundOfUnique = 0;
        System.out.print("int[] arrTemp wypełniona elementami int[]arr: ");
        for (int i = 0; i < arr.length; i++) {
            //arrTemp[i] = arr[i];
            //System.out.print(arrTemp[i]);
            boolean result = false;
            for (int i1 = 0; i1 < amoundOfUnique; i1++) {
                if (arr[i] == arrTemp[i1]) {
                    result = true;
                    break;
                }
            }
            /*if (result) {
                continue;
            }
            arrTemp[amoundOfUnique] = arr[i];
            amoundOfUnique++;*/
            if (!result) {
                arrTemp[amoundOfUnique] = arr[i];
                amoundOfUnique++;

                Arrays.fill(a,amoundOfUnique);
            }
        }
        System.out.println();
        System.out.println("ilość wystąpień w returnUnique 7: " + amoundOfUnique);
        return a;
    }
    /*public static boolean contains7(int[] arr, int element, int temporary) {
        for (int i = 0; i < temporary; i++) {
            if (arr[i] == element) {
                return true;
            }
        }
        return false;
    }*/
    int arrayToInt(int[] arr)
    {
        //using a Stringbuilder is much more efficient than just using += on a String.
        //if this confuses you, just use a String and write += instead of append.
        StringBuilder s = new StringBuilder();

        for (int i : arr)
        {
            s.append(i); //add all the ints to a string
        }

        return Integer.parseInt(s.toString()); //parse integer out of the string
    }
}


