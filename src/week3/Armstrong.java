package week3;

public class Armstrong {
    /*
    2-Numbers -- Armstrong numbers
Write a method that can check if a number is Armstrong number.
     */

    public static void main(String[] args) {
        boolean isArmstrongNumber = isArmstrong(153);
        System.out.println("isArmstrongNumber = " + isArmstrongNumber);

    }

    public static boolean isArmstrong(int number) {
        //you can convert number to string and you can get the numbers with split and
        //you can use wrapper classes

        //last digit
        int lastDigit = number % 10; // 153%10=3

        //second digit
        int result = number / 10; //result=153/10=15
        int secondDigit = result % 10; //15%10=5

        //third digit
        int thirdDigit = number / 100; //153/100 = 1
/*
        int total = (lastDigit * lastDigit * lastDigit) + (secondDigit * secondDigit * secondDigit) + (thirdDigit * thirdDigit * thirdDigit);

 */
        int total= (int) (Math.pow(lastDigit, 3)+Math.pow(secondDigit, 3)+Math.pow(thirdDigit, 3));




        if (total == number)
            return true;
        else
            return false;

    }
}

