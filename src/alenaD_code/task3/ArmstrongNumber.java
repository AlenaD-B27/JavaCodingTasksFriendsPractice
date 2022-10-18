package alenaD_code.task3;

public class ArmstrongNumber {
    //Write a method that can check if a number is Armstrong number.
    /* Rules of an Armstrong number:

    --- is the sum of its own digits each raised to the power of the number of digits.
    --- can NOT be a negative number.

     */

    public static void checkIfArmstrong(int num){

        int totalDigits = 0; //1634
        int sumOfPoweredDigits = 0;

        if(num < 0){
            // nothing happens
        }else {

            for (int i = num; i != 0; i /= 10) {
                totalDigits++;
            }

            int[] digitsInPower = new int[totalDigits];

            int remainder = num;

            for (int i = 0; i < totalDigits; i++) {
                digitsInPower[i] = (int) Math.pow(remainder % 10, totalDigits);
                remainder/=10;
            }


            for (int i = 0; i < digitsInPower.length; i++) {
                sumOfPoweredDigits += digitsInPower[i];
            }
        }


        System.out.println(num + (num == sumOfPoweredDigits ? " is an armstrong number" : " is not an armstrong number"));


    }


    public static void main(String[] args) {
        checkIfArmstrong(-153);
        checkIfArmstrong(0);
        checkIfArmstrong(54748);
        checkIfArmstrong(12345);
    }







}
