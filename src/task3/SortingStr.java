package task3;

import java.util.LinkedHashSet;


public class SortingStr {
    /*
    String -- Remove Duplicates
Write a return method that can remove the duplicated values from String
Ex: removeDup("AAABBBCCC") ==> ABC
     */
    public static void main(String args[]) {
        String str = "AAABBBCCC";
        RemoveDuplicates r = new RemoveDuplicates();
        r.removeDuplicates(str);
    }
}
    class RemoveDuplicates {
        //Function removes duplicate characters from the string
        void removeDuplicates(String str) {
            LinkedHashSet<Character> list = new LinkedHashSet<>();
            for (int i = 0; i < str.length(); i++)
                list.add(str.charAt(i));

            // print string after deleting duplicate elements
            for (Character letter : list)
                System.out.print(letter);
        }

    }



