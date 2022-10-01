package BEST_SOLUTIONS;
/*
Create the method which will print if number is even or odd.
 */


public class OddOrEven {
    // author: Cumali
    public static void oddOrEven(int num){
        if (num % 2==0){
            System.out.println("Even");
        }else {
            System.out.println("Odd");
        }

    }

    public static void main(String[] args) {
        // Math rule: all numbers: positive, negative or zero - are even or odd.
        oddOrEven(0);
        oddOrEven(6);
        oddOrEven(-5);
    }
}
