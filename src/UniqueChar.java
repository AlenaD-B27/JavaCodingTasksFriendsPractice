public class UniqueChar {

    /*
    String -- Find the unique
Write a return  method that can find the unique characters from the String
Ex:  unique("AAABBBCCCDEF")  ==>  "DEF";
     */

    public static String uniqueChars(String str) {


        String unique = " ";
        for (int i = 0; i < str.length(); i++) {
            if (!unique.contains("" + str.charAt(i))) {
                unique += str.charAt(i);

            }
        }
        return unique;
    }

    public static void main(String[] args) {
        System.out.println(uniqueChars("AAABBBCCCDEF"));
    }
}







            


    







