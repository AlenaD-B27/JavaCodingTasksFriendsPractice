package week3;

public class ReverseNegativeNumber {
    public static int reverseNegativeNumber(int number) {
        // by multiplying a number by 10 we increase the number of digits by 1 and then add the last digit. For negative numbers, we multiply it by -1 to first make it positive and then apply the same logic, while returning numbers we just multiply it by -1 again to convert the reversed number into negative.
        // set condition if number is negative
        boolean isNegative = number < 0;
        if(!isNegative){
            return 0;
        }
        if(isNegative){
            number = number * -1;//make number positive
        }
        int reverse = 0, digit = 0;

        while (number >= 1) {
            digit = number % 10;//get last digit
            reverse = reverse * 10 + digit; // ex we have 6789 --> 0*10+9--> 9*10+8--> 98*10+7--> 987*10 +6 --> 9876//s then added to the variable reversed after multiplying it by 10. Multiplication by 10 adds a new place in the reversed number. One place multiplied by 10 gives me tenth place, tenth gives  hundredth...
            number = number / 10;// we divided by 10 to remove last digit : we have num 2345--> last digit is 5432
        }
            return reverse * -1;
        }


    public static void main(String[] args) {
        System.out.println("reverseNegativeNumber(89) = " + reverseNegativeNumber(89));
        System.out.println("reverseNegativeNumber(-45) = " + reverseNegativeNumber(-123456789));
        System.out.println("reverseNegativeNumber(-76) = " + reverseNegativeNumber(-76));
        System.out.println("reverseNegativeNumber(-84) = " + reverseNegativeNumber(-84));
    }
}
