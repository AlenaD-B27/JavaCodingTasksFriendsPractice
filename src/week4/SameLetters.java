package week4;

import java.util.Arrays;

public class SameLetters {
    /*
    1️⃣  String -- Same letters
Write a return method that checks if a string is built out of the same letters as another string.
Ex: same("abc", "cab"); -> true
same("abc", "abb"); -> false:
     */
    public static void main(String[] args) {
        System.out.println("sameChars(\"abc\",\"cab\") = " + sameChars("abc", "cab"));
        System.out.println("sameChars(\"abc\",\"abb\") = " + sameChars("abc", "abb"));
        System.out.println("sameChars(\"abc11\") = " + sameChars("abc11","abc113"));

    }

    public static boolean sameChars(String firstStr, String secondStr) {
        char[] first = firstStr.toCharArray();
        char[] second = secondStr.toCharArray();
        Arrays.sort(first);
        Arrays.sort(second);
        return Arrays.equals(first, second);
    }
}
