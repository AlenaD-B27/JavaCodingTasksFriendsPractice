package alenaD_code.task1;

public class DivideMethod {

    /*
    Write a method that can divide two numbers without using the "/" operator.
     */

    public static String divide(double nominator, double denominator) {

        if (denominator != 0) {

            int sign = 1;
            if (nominator * denominator < 0){
                sign = -1;
            }

            nominator = Math.abs(nominator);
            denominator = Math.abs(denominator);

            int wholeNumberPart = 0;
            while (nominator > denominator) {
                nominator -= denominator;
                wholeNumberPart++;
            }

            double remainder = nominator;

            int decimalPart = 0;
            remainder *= 100;
            while (remainder > 0) {
                remainder -= denominator;
                decimalPart++;
            }

            return sign*wholeNumberPart + "." + decimalPart;
        } else {
            return "Can not divide by 0";
        }
    }




    public static void main(String[] args) {
        System.out.println(divide(20.2, 4.1));
    }



}
