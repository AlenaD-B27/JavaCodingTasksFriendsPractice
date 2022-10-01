package alenaD_code.task1;

public class DivideMethod {

    /*
    Write a method that can divide two numbers without using the "/" operator.
     */

    public static double divide(double nominator, double denominator) {

        int sign = 1;                   // constructing the result:
        double wholeNumberPart = 0;     // declaring the parts and
        double decimalPart = 0;         // assigning the default values.


        if (denominator == 0) {                                     // handling the "divide by 0" case;
            System.out.println("ERROR: CAN NOT DIVIDE BY ZERO!!!"); // or we can throw exception here.
        } else {
                                                // handled all the cases with negative numbers:
            if (nominator * denominator < 0){   // if  at least one of the numbers is negative => product is negative:
                sign = -1;                      // the sign of the result will be "-".
            }

 //           System.out.println("sign = " + sign);

            nominator = Math.abs(nominator);        // both nominator and denominator need to be turned into positive numbers.
            denominator = Math.abs(denominator);    // Math.abs(-x); is the method for |-x| = x. |x| = x. Makes any number positive.

            while (nominator >= denominator) {  // here we are checking how many times denominator can fit into nominator
                nominator -= denominator;      // n = n - d ----> n -= d  // by subtraction: 10/2 = 10-2-2-2-2-2 = 10-(2*5) --> 5 is the result.
                wholeNumberPart++;
            }

//            System.out.println("wholeNumberPart = " + wholeNumberPart);

            double remainder = nominator; // "leftovers" of the nomination is a remainder.

//            System.out.println("remainder = " + remainder);


            remainder *= 100;    // the number of zeroes is the number of digits after dot in the actual result.

            while (remainder > 0) {       // using the same logics as we used to find the whole number.
                remainder -= denominator;
                decimalPart++;
            }


            decimalPart *= 0.01;  // we need to turn XX number into 0.XX without using "/".
                                  // XX / 100 = XX * 0.01.

 //           System.out.println("decimalPart = " + decimalPart);

        }

        return sign * (wholeNumberPart + decimalPart);  // putting all the parts together  >>> and return it.


    }




    public static void main(String[] args) {
        System.out.print("Test:   ");
        System.out.println(divide(90.0, 5.89)); // test positive nominator and denominator >>> expected: positive valid result.
        System.out.println("Result: " + 90.0/5.89);
        System.out.println("============================");

        System.out.print("Test:   ");
        System.out.println(divide(20.25, 0));     // test divide by 0 >>> expected: error message.
        System.out.println("Result: " + 20.25/0);
        System.out.println("============================");

        System.out.print("Test:   ");
        System.out.println(divide(-20.25, 3.17));   // check negative nominator >>> expected: negative valid result.
        System.out.println("Result: " + -20.25/3.17);
        System.out.println("============================");

        System.out.print("Test:   ");
        System.out.println(divide(20.25, -3.17));   // check negative denominator >>> expected: negative valid result.
        System.out.println("Result: " + 20.25/-3.17);
        System.out.println("============================");

        System.out.print("Test:   ");
        System.out.println(divide(-20.25, -3.17));   // check negative nominator and denominator >>> expected: positive valid result.
        System.out.println("Result: " + -20.25/-3.17);
        System.out.println("============================");



    }



}
