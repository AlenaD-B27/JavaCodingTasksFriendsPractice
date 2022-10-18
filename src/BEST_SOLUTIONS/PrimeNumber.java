package BEST_SOLUTIONS;

// Write a method that can check if a number is prime or not.


        /* rules of the prime number:

        --- is a natural number greater than 1 that is not a product of two smaller natural numbers.
        --- is divisible only by 1 and the number itself.

         */

public class PrimeNumber {
    // author: Cumali

    public static boolean isPrime(int n) {

        boolean isPrime = true;

        if (n <= 1) {
            isPrime = false;
        }

        for (int i = 2; i < n / 2; i++) {

            if (n % i == 0) {
                isPrime = false;
            }

        }

        return isPrime;
    }

    public static void main(String[] args) {
        System.out.println(isPrime(10));

    }

}
