package practice4;

public class UniqueCharacters {
    public static void main(String[] args) {
        System.out.println("uniqueCharacters(\"akdhdasdfAA\") = " + uniqueCharacters("akdhdasdfAAK9"));
    }
    //String -- Find the unique
    //Write a return  method that can find the unique characters from the String
    //Ex:  unique("AAABBBCCCDEF")  ==>  "DEF";
    public static String uniqueCharacters(String str) {
        String uniqueCharacters = "";
        for(int i = 0 ;i < str.length();i++){
            int countUnique = 0;
            for (int j = 0; j < str.length(); j++) {
                if(str.charAt(i)==str.charAt(j)){
                    countUnique++;
                }
            }
            if(countUnique==1){// only one occurrence of this character
                uniqueCharacters += str.charAt(i);
            }
        }
        return uniqueCharacters;
    }
}
