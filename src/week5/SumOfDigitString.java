package week5;

public class SumOfDigitString {
    /*
    5️⃣ String -- sum of digits in a string
Write a method that can return the sum of the digits in a string
     */
    public static int sumOfDigitsInString(String str){

        int sum = 0;

        String digitsOnly = "";

        for (int i = 0; i < str.length(); i++) {
            if(Character.isDigit(str.charAt(i))){
                digitsOnly += str.charAt(i);
            }
        }

        String [] digitsAsStrings = new String[digitsOnly.length()];

        for (int i = 0; i < digitsAsStrings.length; i++) {
            digitsAsStrings[i] = "" + digitsOnly.charAt(i);
        }

        for (int i = 0; i < digitsOnly.length(); i++) {
            sum += Integer.parseInt(digitsAsStrings[i]);
        }


        return sum;

    }


    public static void main(String[] args) {
        System.out.println(sumOfDigitsInString("World1254"));

    }}
