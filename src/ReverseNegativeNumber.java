public class ReverseNegativeNumber {
    /*
    Numbers – Reverse Negative Number
Write a return method that can reverse negative number and return it as int
for example: input -12345 output -54321
     */

    public static int reverseNum(int num) {

        String str = new StringBuilder("" + num).reverse().toString();

        if (num < 0) {

            str = "-" + str.substring(0, str.length() - 1);

        }

        return Integer.valueOf(str);
    }

    public static void main(String[] args) {
        System.out.println(reverseNum(-12345));
    }
}
