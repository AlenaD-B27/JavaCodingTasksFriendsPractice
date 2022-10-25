package week3Task;

public class removeDuplicates {
//    String -- Remove Duplicates
//    Write a return method that can remove the duplicated values from String
//    Ex: removeDup("AAABBBCCC") ==> ABC


    public static void main(String[] args) {
        String s = "abcabc";
        String unique = "";

        for (int i = 0; i < s.length(); i++) {
            if (!unique.contains("" + s.charAt(i))) {
                unique += s.charAt(i);
            }
        }
        System.out.println(unique);
    }
}