package alenaD_code.task4;

public class FrequencyOfChars {
    /*
    String -- Frequency of Characters
Write a return method that can find the frequency of characters
Ex: FrequencyOfChars("AAABBCDD") ==> A3B2C1D2
     */


    public static String frequencyOfChars(String str){

        if(str == null){
            return "no value is assigned";
        }

        String returnStr = "";


        int helper = 0;

        for (int i = 0; i < str.length(); i++) {             // character we compare
            int count = 0;
            for (int j = 0; j < str.length(); j++) {         // to all the characters (each character) in the string

                if(str.charAt(i) == str.charAt(j)){          // HOW MANY TIMES the character we are checking appears in the string
                    count++;
                }




            }



            if(!returnStr.contains(helper + "" + str.charAt(i))){  // to avoid duplicate data  //21
                returnStr += "" + count + str.charAt(i);
            }

            helper = count;

        }
        return returnStr;
    }

    public static void main(String[] args) {
//        System.out.println(frequencyOfChars("mississippi"));
//        System.out.println(frequencyOfChars(null));
//        System.out.println(frequencyOfChars("infinity"));
//        System.out.println(frequencyOfChars("banana"));
//        System.out.println(frequencyOfChars("AAABBCDD"));
        System.out.println(frequencyOfChars("11222****%%%js@@009766"));
     //   System.out.println(frequencyOfChars("222"));
    }







}
