package alenaD_code.task5;

/*
String -- sum of digits in a string
Write a method that can return the sum of the digits in a string
 */

public class SumOfDigitsInString {

    public static int sumOfDigitsInString(String str){

        int sum = 0;

        String digitsOnly = "";

        for (int i = 0; i < str.length(); i++) {
            if(Character.isDigit(str.charAt(i))){
                digitsOnly += str.charAt(i);
            }
        }

        // TODO : convert digitsOnly to STRING Array and add the digits through looping Array


        for (int i = 0; i < digitsOnly.length(); i++) {
            sum = Integer.parseInt(digitsOnly);
        }


        return sum;

    }


    public static void main(String[] args) {
        sumOfDigitsInString("Alena123D456");

    }



}


