package alenaD_code.task2;

public class Swap {
    /*
    Swap Numbers
Swap two variable' values without using a third variable
     */
    public static void main(String[] args) {

        double x = 3.4;
        double y = 3.7;
        System.out.println("x = " + x);
        System.out.println("y = " + y);

        // x = a;
        // y = b;

        y += x; // x = a; y = a + b
        x = y - x; // x = (a + b) - a = a + b -a = b ---> b was a value of y, now it is value of x ; y = a + b;
        y -= x; //  x = b; y = (a + b) - b = a + b - b = a ---> a was a value of x, now it is value of y;
        System.out.println("x = " + x);
        System.out.println("y = " + y);

        System.out.println("=========================================");

        String x1 = "Hello";
        String y1 = "World";
        System.out.println("x1 = " + x1);
        System.out.println("y1 = " + y1);

        y1 += x1; // WorldHello
        x1 = y1.replace(x1, ""); // Hello = WorldHello.replace(Hello, "") =>   World
        y1 = y1.replace(x1, ""); // WorldHello = WorldHello.replace(World, "") => Hello
        System.out.println("x1 = " + x1);
        System.out.println("y1 = " + y1);

        System.out.println("=========================================");

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
