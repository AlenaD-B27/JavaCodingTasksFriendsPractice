package week3;

public class PrimeNumber {

    /*
    1- Numbers -- Prime Number
Write a method that can check if a number is prime or not.
     */
    public static void main(String[] args) {
        System.out.println(isPrime(10));

    }
    public static boolean isPrime(int n) {

        boolean isPrime = true;

        if (n <= 1) {

            isPrime = false;

        }
        for (int i = 2; i < n; i++) {

            if (n % i == 0) {
                isPrime = false;
            }
        }

        return isPrime;
    }
}

