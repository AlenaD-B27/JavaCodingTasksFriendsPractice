package alenaD_code.task4;

public class RemoveDuplicates {
    /*
    String -- Remove Duplicates
Write a return method that can remove the duplicated values from String
Ex: removeDup("AAABBBCCC") ==> ABC
     */

    public static String noDuplicates(String str){

        if(str == null){
            return "no value is assigned";
        }

        String returnStr = "";


            for (int i = 0; i < str.length(); i++) {
                if(!returnStr.contains("" + str.charAt(i))){
                    returnStr += str.charAt(i);
                }
            }


        return returnStr;

    }

    public static void main(String[] args) {
        System.out.println(noDuplicates("mississippi"));
        String s = null;
        System.out.println(noDuplicates(s));
    }









}
