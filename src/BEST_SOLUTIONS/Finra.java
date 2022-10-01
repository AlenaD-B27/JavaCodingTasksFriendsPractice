package BEST_SOLUTIONS;

public class Finra {

    // author: Olha
    public static void finra(){
        for (int i = 1; i <= 30; i++) {  // checking numbers from 1 to 30
            if (i % 3 == 0 && i % 5 == 0){
                System.out.println("FINRA");
            } else if (i % 5 == 0) {
                System.out.println("RA");
            } else if (i % 3 == 0) {
                System.out.println("FIN");
            }else{
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {

        // evenOrOdd(2);
        // withoutDivideOperator(6,2);
        finra();

    }
}
