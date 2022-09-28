package pactice1;

public class EvenOrOdd {
    public static void evenOrOdd(int num){
        if(num % 2 == 0){
            System.out.println("Number is even");
        } else {
            System.out.println("Number is odd");
        }
    }
    public static String evenOrOdd1(int num){
        //return  num % 2 == 0 ? "even" : "odd";
        return num % 2 == 0? "even" : num < 0 ? " number can't be less than zero " : "odd";
    }

    public static void main(String[] args) {
      // evenOrOdd(7);
        System.out.println(evenOrOdd1(5));

    }

}
