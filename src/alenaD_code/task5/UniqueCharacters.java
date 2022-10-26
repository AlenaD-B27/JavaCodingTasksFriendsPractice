package alenaD_code.task5;

public class UniqueCharacters {

    /*
    Write a return  method that can find the unique characters from the String
Ex:  unique("AAABBBCCCDEF")  ==>  "DEF";
     */

    public static String uniqueChars (String str){
        String unique = "";

        for (int i = 0; i < str.length(); i++) {

            int count = 0;

            char checker = str.charAt(i);

            for(char each : str.toCharArray()){
                if (checker == each){
                    count++;
                }
            }

            if (count == 1) {
                unique += checker;
            }
        }
        return unique;
    }




    public static void main(String[] args) {
        System.out.println("uniqueChars(\"AAABBBCCCDEF\") = " + uniqueChars("AAABBBCCCDEF"));
    }








}
