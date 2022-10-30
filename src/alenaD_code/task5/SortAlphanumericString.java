package alenaD_code.task5;

import java.util.*;

public class SortAlphanumericString {
    /*
    Sort Letters and Numbers from alphanumeric String
Given alphanumeric String, we need to split the string into substrings of consecutive letters or numbers, sort the individual string and append them back together
Ex:
Input:  "DC501GCCCA098911"
OutPut: "CD015ACCCG011899"
     */

    public static String sortAlphanumericString(String str){

        List<String> strings = new ArrayList<>();

        String returnStr = "";

        String dummy = "";



            for (int i = 0; i < str.length(); i=0) {

                while(i < str.length() && Character.isLetter(str.charAt(i))) {
                    dummy += str.charAt(i);
                    i++;
                }

                str = str.substring(i);
                strings.add(dummy);
                dummy = "";

                i=0;

                while (i < str.length() && Character.isDigit(str.charAt(i))) {
                    dummy += str.charAt(i);
                    i++;
                }

                str = str.substring(i);
                strings.add(dummy);
                dummy = "";

            }


        for(String each : strings){
            char [] eachString = each.toCharArray();
            Arrays.sort(eachString);
            each = "";

            for (int i = 0; i < eachString.length; i++) {
                each += eachString[i];
            }

            returnStr += each;
        }

        return returnStr;

    }

    public static void main(String[] args) {
        System.out.println(
        sortAlphanumericString("DC501GCCCA098911").equals("CD015ACCCG011899")
        );
    }





}
