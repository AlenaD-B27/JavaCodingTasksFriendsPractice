import java.util.Arrays;

public class SortedLettersAndNumbers2 {
    /*
    Sort Letters and Numbers from alphanumeric String
     Given alphanumeric String, we need to split the string into substrings of consecutive letters or numbers,
     sort the individual string and append them back together
     Input: "DC501GCCCA098911"
     OutPut: "CD015ACCCG011899"
     CD015
     how do we find the substrings
        current char letter ? is next one (i + 1) letter? -> good
        current char letter ? is next one (i + 1) is NOT a letter? -> we found the substring
        current char digit? is next one (i + 1) digit -> good
        current char digit? is next one (i + 1) is not a digit -> we found a substring
        when we are on the last letter length - 1
        force the action to happen  -> assuming the last character is part of the substring
     actions:
        sort this substring
        assign sorted substring to final string
        reset current substring to be empty
 */



        public static void main(String[] args) {
            System.out.println(sortEachPart("DC501GCCCA098911"));
        }

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

    /*
     Input: "DC501GCCCA098911"
     OutPut: "CD015ACCCG011899"
     */


    }

