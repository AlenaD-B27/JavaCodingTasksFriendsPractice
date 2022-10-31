public class EvenOrOdd {
    /*
    Write a method which can identify and print if the given number is even or odd
     */

    public static void EvenOrOdd ( int num){
      if (num % 2 == 0){
          System.out.println("Number is even " + num);
      } else if (num % 2 != 0){
            System.out.println("Number is odd " + num);
        }
    }


    public static void main(String[] args) {
     EvenOrOdd(7);
     EvenOrOdd(12);



    }
}
