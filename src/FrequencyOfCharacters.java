public class FrequencyOfCharacters {

    /*
    String -- Frequency of Characters
Write a return method that can find the frequency of characters
Ex: FrequencyOfChars("AAABBCDD") ==> A3B2C1D2
     */

    public static String frequencyOfCharacters(String str){

        String word = "";

        for (int i = 0; i < str.length(); i++) {
            int count = 0;
            if(!word.contains("" + str.charAt(i))){

                for (int j = 0; j < str.length(); j++) {
                    if(str.charAt(i) == str.charAt(j)){
                        count++;
                    }
                }

                word += str.charAt(i) + "" + count;
            }
        }

        return word;
    }

    public static void main(String[] args) {

        System.out.println(frequencyOfCharacters("BAABBBCACCCCD"));
    }
}



