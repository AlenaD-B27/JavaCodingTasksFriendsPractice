package alenaD_code.task3;

public class ReverseNum {
    /*
    Numbers -- Reverse negative number
Write a return method that can reverse negative number and return it as int.
     */

    public static int reverseNumber(int num){

        int sign = 1;
        if(num < 0) sign = -1;

        num = Math.abs(num);

        int reverse = 0;
        int amountOfDigits = 0;

        for(int i = num; i > 0; i /= 10){
            amountOfDigits++;
        }

        int[] digits = new int[amountOfDigits];

        for(int i = 0; i < amountOfDigits; i++){
            for(int j = num; j > 0; j /= 10) {
                digits[i] = j;
            }

            reverse += digits[i] * Math.pow(10, i);
            num -= digits[i] * Math.pow(10, amountOfDigits-i-1);

        }

        return reverse * sign;



    }




    public static void main(String[] args) {
        System.out.println(reverseNumber(-123));
        System.out.println(reverseNumber(98765));
        System.out.println(reverseNumber(0));

    }




}
