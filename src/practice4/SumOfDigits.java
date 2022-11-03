package practice4;

public class SumOfDigits {
    public static void main(String[] args) {
        System.out.println("sumOfDigit(\"678_+@34Ads\") = " + sumOfDigit("678_+@34Ads"));
    }

    //5️⃣ String -- sum of digits in a string
    //Write a method that can return the sum of the digits in a string
    public static String sumOfDigit(String str){
        int sumOfDigits = 0;
        String result = "";


        for (int i = 0; i < str.length(); i++) {
            if(Character.isAlphabetic(str.charAt(i))){
                continue;
            }
            if(Character.isDigit(str.charAt(i))){
                String temporary = str.charAt(i) + "";
                int sum = Integer.parseInt(temporary);
                sumOfDigits +=sum;
            }
        }
        result = sumOfDigits +"";

        return result;

    }
}
