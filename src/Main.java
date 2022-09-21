public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        OddAndEven OddEven = new OddAndEven();
        System.out.println(OddEven.OddOrEven(55));

         FinraMethod();



    }
    public static void FinraMethod() {
        for (int i = 1; i <= 30; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FINRA");
            } else if (i % 5 == 0) {
                System.out.println("RA");
            } else if (i % 3 == 0) {
                System.out.println("FIN");
            } else {
                System.out.println(i);
            }
        }
    }}





























