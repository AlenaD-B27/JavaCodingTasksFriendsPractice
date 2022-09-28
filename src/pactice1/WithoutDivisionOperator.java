package pactice1;

public class WithoutDivisionOperator {

    public static int division(int num1, int num2) {
        int output = 0;
            if (num2 == 0 ) {
                System.out.println("User cant dived by zero");
            } else {
                while (num1 >= num2) {
                    // java doesnt allow to divide on 0
                    num1 = num1 - num2;// we subtract num2 from num1
                    output++;// here we iterate how many num2 are in num1
                }
            }

            return output;

    }
    public static void main(String[] args) {
        System.out.println(division(6,4));

       // System.out.println(6/4);
    }
}
