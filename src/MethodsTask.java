public class MethodsTask {

    public static void evenOrOdd(int num) {

        if (num % 2 == 0) {
            System.out.println("This is an even number");
        } else {
            System.out.println("This is an odd number");
        }
    }

    public static void withoutDivideOperator(int num1, int num2){

        int result = 0;
        if (num2 == 0){
            num1 = -1;
        }
        while (num1 >= num2){
            num1 -= num2;
            result++;

        }
        System.out.println(result);
    }

    public static void finra(){
        for (int i = 1; i <= 30; i++) {
            System.out.println(i);
            if (i % 3 == 0 && i % 5 == 0){
                System.out.println("FINRA");
            } else if (i % 5 == 0) {
                System.out.println("RA");
            } else if (i % 3 == 0) {
                System.out.println("FIN");
            }
        }
    }

    public static void main(String[] args) {

    evenOrOdd(2);
    withoutDivideOperator(6,7);
    finra();

    }
}
