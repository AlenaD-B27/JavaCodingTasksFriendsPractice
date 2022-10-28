package task3;

import java.util.Arrays;

public class SameLetters {
    /*
      String -- Same letters
Write a return method that checks if a string is built out of the same letters as another string.
Ex: same("abc", "cab"); -> true
same("abc", "abb"); -> false:
     */
    public static boolean printSameLetters(String a, String b) {
        if (a == null) {
            return b == null;
        } else if (b == null) {
            return false;
        }
        char[] left = a.toCharArray();
        char[] right = b.toCharArray();
        Arrays.sort(left);
        Arrays.sort(right);
        return Arrays.equals(left, right);
    }

    public static void main(String[] args) throws Exception {
        System.out.println(printSameLetters("abc", "cab")); //
        System.out.println(printSameLetters("a#bc123", "cab123#")); //
        System.out.println(printSameLetters("abc", "abb")); //
        System.out.println(printSameLetters("bbbbbbbbb", "hhhhhhhh"));//
    }
}
