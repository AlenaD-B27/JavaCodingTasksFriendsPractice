public class RemoveDuplicates {

    public static String removeDuplicate(String str) {

        String result = "";

        for (int i = 0; i < str.length(); i++) {

            if (!result.contains("" + str.charAt(i))) {

                result += "" + str.charAt(i);
            }
        }

        return result;

    }


    public static void main(String[] args) {

        System.out.println(removeDuplicate("AAABBBCCC"));
    }
}




   /*
    public static void main(String[] args) {


    String word = "abcabc";
    String duplicate = "";
        for (int i = 0; i <word.length() ; i++) {
        char ch = word.charAt(i);

        if (duplicate.indexOf(ch) == -1){

        // if its not inside its giving -1
            duplicate += ch;

        }
    }
        System.out.println(duplicate);
}

}
*/
