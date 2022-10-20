package WeeklyTasks.week_4;

public class FrequencyOfCharacters {

    /*


    String -- Frequency of Characters
Write a return method that can find the frequency of characters
Ex: FrequencyOfChars("AAABBCDD") ==> A3B2C1D2


     */

    public static void main(String[] args) {
        System.out.println(countLetters("AAABBBBCCCC"));
    }
    public static String countLetters (String str){

       String output = "";
        // accumulate frequency of each character
        // in 'str'
        for (int i = 0; i < str.length(); i++) {
            String letter = str.substring(i, i+1);

            if (!output.contains(letter)) {
                int count = 0;
                for (int j = 0; j < str.length(); j++) {
                    if (letter.equals(str.substring(j, j+1))) {
                        count ++;
                    }
                }
                output += "  " + count + letter;
            }
        }
        return output;
    }

}
