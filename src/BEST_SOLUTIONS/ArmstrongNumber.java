package BEST_SOLUTIONS;

//Write a method that can check if a number is Armstrong number.
    /* Rules of an Armstrong number:

    --- is the sum of its own digits each raised to the power of the number of digits.
    --- can NOT be a negative number.

     */

public class ArmstrongNumber {
    // author: AlenaD
    public static void checkIfArmstrong(int num){

        int totalDigits = 0;
        int sumOfPoweredDigits = 0;

        if(num >= 0){

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
        /* list of Armstrong numbers: 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 153, 370, 371, 407, 1634, 8208, 9474, 54748, 92727, 93084, 548834, 1741725, 4210818, 9800817, 9926315, 24678050, 24678051, 88593477, 146511208, 472335975, 534494836, 912985153, 4679307774, 32164049650, 32164049651, 40028394225, 42678290603, 44708635679, 49388550606, 82693916578, 94204591914, 28116440335967, 4338281769391370, 4338281769391371, 21897142587612075, 35641594208964132, 35875699062250035 .........
         */

        checkIfArmstrong(-153);
        checkIfArmstrong(0);
        checkIfArmstrong(54748);
        checkIfArmstrong(12345);
    }
}
