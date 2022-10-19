public class ArmstrongNumbers {

    // Armstrong Number in Java
    /*

    153 -> 1 5 3
    1*1*1 + 5*5*5 + 3*3*3
      1   +  125  +  27
    153


    370 -> 3*3*3 + 7*7*7 + 0 = 370

     */
    public static void armstrongNumbers(int n){

        int temp = n;
        int r;
        int sum = 0;

        while (n > 0) {
            r = n % 10;
            n = n / 10;
            sum = sum + r * r * r;
        }
        if (temp == sum) {
            System.out.println("It is an Armstrong number");
        } else {
            System.out.println("It's not an Armstrong number");

        }
    }
    public static void main(String[] args) {

        armstrongNumbers(15);
    }
}
