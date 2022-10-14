package alenaD_code.task4;
/*
String -- Same letters
Write a return method that checks if a string is built out of the same letters as another string.
Ex: same("abc", "cab"); -> true
same("abc", "abb"); -> false:
 */


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SameLetters {

    public static boolean madeOfTheSameLetters(String s1, String s2){
        s1 = s1.trim();
        s2 = s2.trim();

        if(s1.length() != s2.length()) {
            return false;
        }

        String dummy = "";


        for (int i = 0; i < s1.length(); i++) {
            for (int j = 0; j < s2.length(); j++) {

                if(s1.charAt(i) == s2.charAt(j)){
                    dummy += s2.charAt(j);
                    s2 = s2.replaceFirst("" + s2.charAt(j), "");
                    break;
                }

            }
        }

        return s1.equals(dummy);
    }

//==============================================================
public static boolean madeOfTheSameLetters1(String s1, String s2){
    List<String> s1asList = new ArrayList<>(Arrays.asList(s1.split("")));
    List<String> s2asList = new ArrayList<>(Arrays.asList(s2.split("")));
        Collections.sort(s1asList);
        Collections.sort(s2asList);
        return s1asList.equals(s2asList);
}

//==============================================================
    public static void main(String[] args) {
        System.out.println(madeOfTheSameLetters("hello", "lohel"));
        System.out.println(madeOfTheSameLetters("alena", "lenka"));
        System.out.println(madeOfTheSameLetters("too", "tto"));

        System.out.println();

        System.out.println(madeOfTheSameLetters1("hello", "lohel"));
        System.out.println(madeOfTheSameLetters1("alena", "lenka"));
        System.out.println(madeOfTheSameLetters1("too", "tto"));


    }



}
