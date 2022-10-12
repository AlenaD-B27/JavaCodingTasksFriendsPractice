package alenaD_code.task3;

public class ArmstrongNumber {
    //Write a method that can check if a number is Armstrong number.
    /* Rules of an Armstrong number:

    --- is the sum of its own digits each raised to the power of the number of digits.
    --- can NOT be a negative number.

     */

    public static void checkIfArmstrong(int num){

        int totalDigits = 0;
        int sumOfPoweredDigits = 0;

        if(num < 0){

        }else {

            for (int i = num; i != 0; i /= 10) {
                totalDigits++;
            }

            int[] digitsInPower = new int[totalDigits];

            double dummyDouble = num;
            int dummyInt = num;

            for (int i = 0; i < totalDigits; i++) {
                dummyDouble /= 10;
                dummyInt /= 10;
                digitsInPower[i] = (int) Math.pow((dummyDouble - dummyInt) * 10, totalDigits);
                dummyDouble -= (dummyDouble - dummyInt);
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
        checkIfArmstrong(153);
    }







}
