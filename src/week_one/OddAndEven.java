package week_one;

public class OddAndEven {

    public static void oddOrEven(int num){
        if (num % 2==0){
            System.out.println("Even");
        }else {
            System.out.println("Odd");
        }

    }

    public static void main(String[] args) {
     oddOrEven(5);
     oddOrEven(6);
    }
}
