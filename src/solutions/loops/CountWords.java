package solutions.loops;

public class CountWords {
    /*
    Count Words
    Given a sentence determine how many words are in the String.
        Ex:
            Input:
                This has multiple words
            Output:
                4
     */

    public static void main(String[] args) {

        String s = "This has multiple words";
        int spaces = 1; // the number of words would be 1 more than the total number of spaces so we can start from 1

        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == ' '){
                spaces++;
            }
        }

        System.out.println(spaces);

        // Alternative:

        String str = "This has multiple words";;
        int count = 1;

        while(str.contains(" ")){
            count++;
            str = str.replaceFirst(" ", "");
        }
        System.out.println(count);

    }

}
