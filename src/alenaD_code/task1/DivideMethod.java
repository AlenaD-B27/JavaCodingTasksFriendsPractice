package alenaD_code.task1;

public class DivideMethod {

    /*
    Write a method that can divide two numbers without using the "/" operator.
     */

    public static String divide(double nominator, double denominator) {

        if (denominator != 0) {

            int count = 0;
            while (nominator > denominator) {
                nominator -= denominator;
                count++;
            }
// some changes
            int countRemainder = 0;
            nominator *= 10;
            while (nominator > 0) {
                nominator -= denominator;
                countRemainder++;
            }
            return "" + count + "." + countRemainder;
        } else {
            return "Can not divide by 0";
        }
    }




    public static void main(String[] args) {
        System.out.println(divide(20.2, 3));
    }








}
