package week3;

public class PrimeNumber {
    public static boolean isPrimeNumber(int number) {
        /*
        Число i є дільником натурального числа n, якщо n mod i=0.
        The number i is a divisor of the natural number n if n % i = 0.

        // every prime number has two divisors 1 and n
        //Всі інші дільники натурального числа n (якщо вини є), знаходяться в інтервалі [2, n div 2].
        All other divisors of the natural number n (if there are any) are in the interval [2, n div 2].
        Натуральне число називається простим, якщо у нього немає дільників в інтервалі [2, n div 2].
        Щоб знайти всі дільники числа n, потрібно перевірити всі числа i з інтервалу [1, n] на умову n % i=0. Тобто це буде такий цикл:
        for int i:=1  i < n; ni++
         if n % i = 0
       A natural number is called prime if it has no divisors in the interval [2, n div 2].To find all the divisors of the number n, you need to check all the numbers i from the interval [1, n] for the condition n mod i=0. That is, it will be such a cycle:
       for i:=2 to n % 2 do if n % i=0 then
*/
        boolean isPrime = false;

        for(int i =1; i < number; i++){// number/2 here it means that we don't need to check whole number for example if we have 10 it will check until 2
            if(number % 2 == 0){
                return isPrime;
            }else{
                isPrime = true;
            }
        }
        return isPrime;

    }

    public static void main(String[] args) {
        System.out.println("isPrimeNumber(7) = " + isPrimeNumber(7));
        System.out.println("isPrimeNumber(67) = " + isPrimeNumber(67));
        System.out.println("isPrimeNumber(10) = " + isPrimeNumber(10));
        System.out.println("isPrimeNumber(12) = " + isPrimeNumber(12));
        System.out.println("isPrimeNumber(1) = " + isPrimeNumber(1));
        System.out.println("isPrimeNumber(-5) = " + isPrimeNumber(-5));
    }
}
