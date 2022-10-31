public class PrimeNumber {

    /*
    Q7: Numbers – Prime Number
Write a method that can check if a number is prime or not
     */

    public static boolean primeNumber(int num) {

        if(num <= 1){
            return false;
        }

        for(int i = 2; i < num ; i++) {
            if(num % i == 0) {
                return false;
            }
        }

        return true;

    }


    public static void main(String[] args) {
        primeNumber(8);
        primeNumber(7);
        System.out.println(primeNumber(8));
        System.out.println(primeNumber(7));
    }
}
