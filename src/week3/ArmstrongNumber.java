package week3;

public class ArmstrongNumber {
    public static void main(String[] args) {
        System.out.println("isArmstrongNumber(153) = " + isArmstrongNumber(153));
        System.out.println("isArmstrongNumber(123) = " + isArmstrongNumber(123));
        System.out.println("isArmstrongNumber(124) = " + isArmstrongNumber(124));

    }
    public static boolean isArmstrongNumber (int number){
    // Armstorng number it is a number that  = sum of each digits by power of 3
        // we will be taking only 3 digits
        int sumOfNumber, lastDigit,secondDigit,firstDigit;
        lastDigit = number % 10; // we will get the reminder ex // 123%10 = 3 there are 12 times 10 repeating
        secondDigit =  (number/10) % 10;// its int so we can get reminder in decimal: we need to divide by 10 to get 2 first digits when we will be divided by 10 we will get 2 first numbers, but we need just second so we have to use % 10
        firstDigit = number/100;
        sumOfNumber = (firstDigit*firstDigit*firstDigit)+(secondDigit*secondDigit*secondDigit)+(lastDigit*lastDigit*lastDigit);
        if(sumOfNumber == number){
            return true;
        }else{
            return false;
        }

    }
}
