package BEST_SOLUTIONS;
 /*
    Swap Numbers
Swap two variable' values without using a third variable
     */

public class SwapValues {

    public static void main(String[] args) {

        // author Vito
        // for int/double values:

        int x = 10;
        int y = 20;

        System.out.println("Before Swapping");
        System.out.println("Value of x is :" + x);
        System.out.println("Value of y is :" + y);

        //add both the numbers and assign it to first
        x = x + y;
        y = x - y;
        x = x - y;

        System.out.println("Before Swapping");
        System.out.println("Value of x is :" + x);
        System.out.println("Value of y is :" + y);

        //==========================================================

        // author Maria
        // for String values
        // ---- coming soon! ------

        //==========================================================

        // author AlenaD
        // for char values

        char x2 = 'a'; // a = 97
        char y2 = 'b'; // b = 98
        System.out.println("x2 = " + x2);
        System.out.println("y2 = " + y2);

        y2 += x2; // y2 = Ã = 195
        x2 = (char) (y2 - x2);  // x = y - x;
        y2 -= x2;
        System.out.println("x2 = " + x2);
        System.out.println("y2 = " + y2);



    }

}
