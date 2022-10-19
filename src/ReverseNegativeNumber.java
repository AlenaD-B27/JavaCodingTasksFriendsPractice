public class ReverseNegativeNumber {

    /*
    Numbers -- Reverse negative number
Write a return method that can reverse negative number and return it as int.
     */
    public static void reverseNegative(int n) {

        while (n > 0) {
            n *= -1;
            System.out.println(n);
            break;
        }
    }
    public static void main (String[]args){
            reverseNegative(7);

        }
    }

