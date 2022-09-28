package alenaD_code.task1;

public class EvenOrOdd {
    /*
    Write a method which can identify if the number is even or odd.
    Output:
        identify(5) --> "Odd"
        identify(6) --> "Even"
     */

    public static void identify(int number){
        if(number != 0) {

            if (number % 2 == 0) {
                System.out.println("number " + number + " is EVEN");
            } else {
                System.out.println("number " + number + " is ODD");
            }
        } else {

            System.out.println("Zero can not be odd or even");
        }
    }

    public static void main(String[] args) {
        identify(-2);
        identify(0);
    }







}
