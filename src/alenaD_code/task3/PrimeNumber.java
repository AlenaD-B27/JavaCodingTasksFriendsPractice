package alenaD_code.task3;

public class PrimeNumber {
    // Write a method that can check if a number is prime or not.

    public static void primeNum(int num){
        /* rules of the prime number:

        --- is a natural number greater than 1 that is not a product of two smaller natural numbers.
        --- is divisible only by 1 and the number itself.

         */

        boolean isPrime = true;

        if(num <= 1){
            isPrime = false;
        }else{
            for(int i = 2; i < num/2; i++){
                if(num % i == 0){
                    isPrime = false;
                    break;
                }
            }
        }
        System.out.println(num + (isPrime ? " is a prime number" : " is not a prime number"));
    }

    public static void main(String[] args) {
        primeNum(0);
        primeNum(2);
        primeNum(11);
        primeNum(30);
        primeNum(1234567);
    }


}
