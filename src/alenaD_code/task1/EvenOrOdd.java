package alenaD_code.task1;

public class EvenOrOdd {
    /*
    Write a method which can identify if the number is even or odd.
    Output:
        identify(5) --> "Odd"
        identify(6) --> "Even"
     */

    public static void identify(int number){


            if (number % 2 == 0) {
                System.out.println(number + " is EVEN");
            } else {
                System.out.println(number + " is ODD");
            }
    }


    // P.S. All integer numbers are even or odd. If a number is divided by 2 and leaves the remainder as 0, then it is even; otherwise, it is an odd number. No exceptions. Zero is an even number. For negative numbers the rule is the same as for positive numbers.

    public static void main(String[] args) {
        identify(-2);
        identify(0);
        identify(248);
    }







}
