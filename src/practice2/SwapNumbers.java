package practice2;

public class SwapNumbers {
    public static void main(String[] args) {


            //Swap two variable' values without using a third variable
            /*char c = 'a';
              char d = 'l';*/

            double a = 3.3;// only 3.4 and 3.6
            double b = 3.7;
            a = a + b;
            b = a - b;
            a = a - b;
            System.out.println(a);
            System.out.println(b);
        System.out.println("=====================");
           int x = -4;
           int y = 2;
           // x = x + y;//5+4=9
           // y = x - y;//9-4 = 5
           //x = x - y;//9-5=4
            x = x * y;//5*4=20
            y = x / y; //20/4 =5
            x = x / y;//20/5=4;
            System.out.println(x);
            System.out.println(y);

    }
}
