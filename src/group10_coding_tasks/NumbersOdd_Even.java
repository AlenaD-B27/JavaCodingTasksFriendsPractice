package group10_coding_tasks;

public class NumbersOdd_Even {

// identify(5) -> "ODD"
// identify(6) - > "EVEN



    public static void main(String[] args) {
        int n = 100;
        System.out.println("Even numbers from 1 to 100: ");
        //i = 1 and i is less then 100, iterate through the loop adding 1
        for (int i = 1; i < n; i++) {
            //if condition that i divided by 2 = 0
            if (i % 2 == 0) {
                //print out even numbers 1-100
                System.out.println(i + " ");
            }
        }

        int y = 100;
        System.out.println("Odd numbers from 1 to 100: ");
        for (int i = 1; i <= y; i++) {
            if (i % 2 != 0) {
                System.out.println(i + " ");
            }
        }

    }
}
