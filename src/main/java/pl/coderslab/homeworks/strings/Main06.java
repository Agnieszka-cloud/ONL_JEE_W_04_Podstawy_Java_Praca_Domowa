package pl.coderslab.homeworks.strings;
//W pakiecie `pl.coderslab.homeworks.strings`, w pliku `Main06.java`
//        umieść zmodyfikowaną metodę z zadania z szyfrem Cezara:
//
//        `public static String encode(String str, int shift)`.
//
//        1. `shift` - oznacza przesunięcie znaków,
//        2. dodaj metodę deszyfrującą `public static String decode(String str, int shift)`.

public class Main06 {

    public static void main(String[] args) {
        System.out.println(encode1("abcdefghijklmnopqrstuvwxyz",3));
        System.out.println(decode1("odud#srcgudzld#roh", 3));
        System.out.println(decode1("defghijklmnopqrstuvwxyzabc",3));
        System.out.println();
        System.out.println(encode2("abcdefghijklmnopqrstuvwxyz",29));
        System.out.println(decode2("efghijklmnopqrstuvwxyz{abc", 4));
        System.out.println();
        System.out.println(encode2("abcdefghijklmnopqrstuvwxyz",29));
        System.out.println(decode2("fghijklmnopqrstuvwxyz{|abc", 5));
        System.out.println(decode2("~\u007F\u0080\u0081\u0082\u0083\u0084\u0085\u0086\u0087\u0088\u0089\u008A\u008B\u008C\u008D\u008E\u008F\u0090\u0091\u0092\u0093\u0094abc", 29));
    }
    public static String encode1(String str, int shift){

        // alfabet a-z to od 97 do 122
        // a  b  c  d   e   f   g   h   i   j   k   l   m   n   o   p   q   r   s   t   u   v   w   x   y   z
        // 97 98 99 100 101 102 103 104 105 106 107 108 109 110 111 112 113 114 115 116 117 118 119 120 121 122
        // 1  2  3  4   5   6   7   8   9   10  11  12  13  14  15  16  17  18  19  20  21  22  23  24  25  26
        // o   p   q   r   s   t   u   v   w   x   y   z
        // 111 112 113 114 115 116 117 118 119 120 121 122
        String cezar = "";
        for(int i = 0; i < str.length(); i++){
            char przesunieta = (char) (str.charAt(i) + shift);
            if (str.charAt(i) >= 97 && str.charAt(i) < 120 ) {
                przesunieta = (char) (str.charAt(i) + shift);
            } else if ( str.charAt(i) >= 120 ) {
                przesunieta = (char) (str.charAt(i) - 23);
            }
            cezar = cezar + przesunieta;

        }
        return cezar;
    }
    public static String decode1 (String str, int shitf){
        String decoded = "";
        // alfabet a-z to od 97 do 122
        // a  b  c  d   e   f   g   h   i   j   k   l   m   n
        // 97 98 99 100 101 102 103 104 105 106 107 108 109 110

        // o   p   q   r   s   t   u   v   w   x   y   z
        // 111 112 113 114 115 116 117 118 119 120 121 122
        for ( int i = 0; i < str.length(); i ++){
            char encode = str.charAt(i);
            char decode = (char)(encode - shitf);
            if (str.charAt(i) < 120 && str.charAt(i) >= 100 ) {
                decode = (char)(str.charAt(i) - shitf);
            } else if (str.charAt(i) <= 99){
                decode = (char)(str.charAt(i) + 23);
            }
            decoded = decoded + decode;
        }
        return decoded;
    }

    public static String encode2(String str, int shift){

        // alfabet a-z to od 97 do 122
        // a  b  c  d   e   f   g   h   i   j   k   l   m   n
        // 97 98 99 100 101 102 103 104 105 106 107 108 109 110

        // o   p   q   r   s   t   u   v   w   x   y   z
        // 111 112 113 114 115 116 117 118 119 120 121 122
        String cezar = "";

        for(int i = 0; i < str.length(); i++){
            char przesunieta = (char) (str.charAt(i) + shift);
            if (str.charAt(i) >= 97 && str.charAt(i) < 120 ) {
                przesunieta = (char) (str.charAt(i) + shift);
            } else if ( str.charAt(i) >= 120 ) {
                przesunieta = (char) (str.charAt(i) - 23);
            }
            cezar = cezar + przesunieta;

        }
        return cezar;
    }
    public static String decode2 (String str, int shitf){
        String decoded = "";
        // alfabet a-z to od 97 do 122
        // a  b  c  d   e   f   g   h   i   j   k   l   m   n
        // 97 98 99 100 101 102 103 104 105 106 107 108 109 110
        // o   p   q   r   s   t   u   v   w   x   y   z
        // 111 112 113 114 115 116 117 118 119 120 121 122
        for ( int i = 0; i < str.length(); i ++){
            char encode = str.charAt(i);
            char decode = (char)(encode - shitf);
            if (str.charAt(i) < 120 && str.charAt(i) >= 100 ) {
                decode = (char)(str.charAt(i) - shitf);
            } else if (str.charAt(i) <= 99){
                decode = (char)(str.charAt(i) + 23);
            }
            decoded = decoded + decode;
        }
        return decoded;
    }
    public static String decode3(String str, int shift) {
        char[] letters = str.toCharArray();
        for (int i = 0; i < letters.length; i++) {
            if ((letters[i] >= 65) && (letters[i] <= 90)) {
                letters[i] = letters[i] - shift >= 65 ? (char) (letters[i] - shift) : (char) (letters[i] - shift + 26);
            }
            if ((letters[i] >= 97) && (letters[i] <= 122)) {
                letters[i] = letters[i] - shift >= 97 ? (char) (letters[i] - shift) : (char) (letters[i] - shift + 26);
            }
        }
        return String.copyValueOf(letters);
    }
}
