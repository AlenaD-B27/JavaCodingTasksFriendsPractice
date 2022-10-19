public class PrimeNumber {

    /*
    Numbers -- Prime Number (number, that has two factors: divides by 1 and itself)
    Write a method that can check if a number is prime or not.
     */

  public static void isPrimeNumber(int num) {

      int count = 0; // to count one by one numbers till our (int num) if its 4 (so divisible by,1,2,3,4)
      for (int i = 1; i <= num; i++) {
          if (num % i == 0) {
              count++;
          }
      }
              if(count == 2){
                  System.out.println("prime");
          } else {
                  System.out.println("not prime");
      }
  }
  public static void main (String[]args){
          isPrimeNumber(17);
      }
  }



