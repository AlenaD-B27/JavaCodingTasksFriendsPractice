public class SameLetters {

    /*
    String -- Same letters
Write a return method that checks if a string is built out of the same letters as another string.
Ex: same("abc", "cab"); -> true
same("abc", "abb"); -> false:
     */

    public static boolean sameLetters(String str1, String str2) {

       String word = "";
        for (int i = 0; i < str1.length(); i++) {
            for (int j = 0; j < str2.length(); j++) {

                if (str1.charAt(i) == str2.charAt(j)){
                    word += str2.charAt(j);
                }
            }
        }
        if(word.equals(str1)){
            return true;
        } else{
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(sameLetters("abc1*","*cab1"));
    }
}

