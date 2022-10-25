package week3Task;

import java.util.Arrays;

public class sameLetter {

//        String -- Same letters
//        Write a return method that checks if a string is built out of the same letters as another string.
//        Ex: same("abc", "cab"); -> true
//        same("abc", "abb"); -> false:

    public static boolean sameLetters (String a, String b){
        if (a == null) {
            return b == null;
        } else if (b == null) {
            return false;
        }
        char[] left = a.toCharArray();
        char[] right = b.toCharArray();
        Arrays.sort(left);
        Arrays.sort(right);
        return Arrays.equals(left,right);

    }
    public static void main(String[] args) {
        System.out.println(sameLetters("aaasdf","sdfaaa"));
        System.out.println(sameLetters("abc", "abb"));
        System.out.println(sameLetters("JHGDF33432","33432JHGDF"));
    }
}