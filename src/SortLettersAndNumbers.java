import java.util.Arrays;

public class SortLettersAndNumbers {
    /*
    String -- Sort Letters and Numbers from alphanumeric String:
Given alphanumeric String, we need to split the string into substrings of consecutive letters or numbers, sort the individual string and append them back together
Ex: Input: "DC501GCCCA098911" OutPut: "CD015ACCCG011899"
     */
    public static void main(String[] args) {
        System.out.println(sortEachPart("DC501GCCCA098911"));
        System.out.println(SortLettersAndNumbersFromString("DC501GCCCA098911"));
    }

    public static boolean SortLettersAndNumbersFromString(String str) {

        String str2 = "";

        for (int i = 0; i < str.length(); i++) {

            str2 += "" + str.charAt(i);

            if (Character.isAlphabetic(str.charAt(i)) && i < str.length() - 1) {

                if (Character.isDigit(str.charAt(i + 1))) {

                    str2 += ",";

                }

            }


            if (Character.isDigit(str.charAt(i)) && i < str.length() - 1) {

                if (Character.isAlphabetic(str.charAt(i + 1))) {

                    str2 += ",";

                }

            }

        }

        String[] arr = str2.split(",");

        str = "";

        for (String each : arr) {

            char[] chars = each.toCharArray();

            Arrays.sort(chars);

            for (char eachChar : chars) {

                str += "" + eachChar;

            }

        }

        System.out.println(str);

        return false;
    }

/// another way
    public static String sortEachPart(String s){

        String sub = "";  // DC
        String sortedStr = "";

        for(int i = 0; i < s.length(); i++){

            char current = s.charAt(i);
            sub += current;
            boolean sort = false;

            if(i != s.length() -1) {
                char next = s.charAt(i + 1);
                sort =
                        Character.isLetter(current) && !Character.isLetter(next) ||
                                Character.isDigit(current) && !Character.isDigit(next);

            } else {
                sort = true;
            }

            if(sort){
                String [] toSort = sub.split("");
                Arrays.sort(toSort);
                // sortedStr += Arrays.toString(toSort).replace("[", "").replace("]", "").replace(", ", "");
                sortedStr += String.join("", toSort);
                sub = "";
            }

        }

        return sortedStr;
    }



}
