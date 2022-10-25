package week3Task;

public class frequencyOfCharacters {

    //    String -- Frequency of Characters
//    Write a return method that can find the frequency of characters
//    Ex: FrequencyOfChars("AAABBCDD") ==> A3B2C1D2
    public static void main(String[] args) {

        String str = "AABBCCDDCCAA";
        String checked = "";

        for (int i = 0; i < str.length(); i++) { // outer: iterating one character at a time --> charAt(i)

            int count = 0; // the counter should reset back to 0 for every character

            if (!checked.contains("" + str.charAt(i))) { // only run the counting and inner loop if the character has not already been checked
                for (int j = 0; j < str.length(); j++) { // inner: compare the character we are looking at( i ) with each other character in the String --> str.charAt(j)

                    if (str.charAt(i) == str.charAt(j)) {
                        count++;
                    }

                }

                System.out.print(str.charAt(i) + "" + count);
                checked += str.charAt(i); // adds to the checked String
            }
        }

    }

}