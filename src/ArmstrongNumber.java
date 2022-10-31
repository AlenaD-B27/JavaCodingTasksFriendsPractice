public class ArmstrongNumber {
    /*
    Numbers – Armstrong Numbers
Write a method that can check if a number is Armstrong number
     */

    public  static  boolean ArmStrongNumber (int  num) {

        int a = 0;

        int b =0;
        int c= num;

        while(num>0){

            a=num % 10;

            num /= 10;

            b=b+(a*a*a);

        }



        if(c==b) {

            return true;

        }

        return false;

    }
}
