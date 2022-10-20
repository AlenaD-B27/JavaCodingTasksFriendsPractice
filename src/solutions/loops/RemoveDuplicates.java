package solutions.loops;

public class RemoveDuplicates {
    /*
    Remove Duplicates
    Write a program that can remove duplicates from a String
        Ex:
            Input: abcabc
            Output: abc

     */
    public static void main(String[] args) {
        String s = "abcabc";
        String unique = "";

        for(int i = 0; i < s.length(); i++){
            if(!unique.contains("" + s.charAt(i))){
                unique += s.charAt(i);
            }
        }

        System.out.println(unique);

        // alternative:
//        String s = "abcabcce";
//        String unique = "";
//
//        for(int i = 0; i < s.length(); i++){
//            if(unique.contains(s.substring(i, i + 1))){
//                continue;
//            }
//            unique += s.charAt(i);
//        }
//
//        System.out.println(unique);

    }
}
