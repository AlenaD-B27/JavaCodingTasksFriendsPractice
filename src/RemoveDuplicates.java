public class RemoveDuplicates {

    /*
    String -- Remove Duplicates
Write a return method that can remove the duplicated values from String
Ex: removeDup("AAABBBCCC") ==> ABC
     */
    public static String removeDuplicates(String str){


    String uniqueLetter = "";

        for (int i = 0; i < str.length(); i++) {
        if (!uniqueLetter.contains("" + str.charAt(i))) {
            uniqueLetter += str.charAt(i);
        }
    }

    return uniqueLetter;

}


    public static void main(String[] args){

        System.out.println(removeDuplicates("hhllkki"));
    }


    }





