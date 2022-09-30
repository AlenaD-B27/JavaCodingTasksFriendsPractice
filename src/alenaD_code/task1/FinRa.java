package alenaD_code.task1;

public class FinRa {
    /*
    Write a method which prints out the numbers from 1 to 30 but for numbers which are a multiple of 3 print "FIN" instead of the number and for numbers which are a multiple of 5, print "RA" instead of the number. for numbers which are a multiple of both 3 and 5, print "FINRA" instead of the number.
     */

    public static void finra(int first, int last) {
        if (first < last) {

            for (int i = first; i <= last; i++) {

                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.print("FINRA ");
                } else if (i % 3 == 0) {
                    System.out.print("FIN ");
                } else if (i % 5 == 0) {
                    System.out.print("RA ");
                } else {
                    System.out.print(i + " ");
                }

            } // end of loop
            System.out.println();
        } else {
            for (int i = last; i <= first; i++) {

                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.print("FINRA ");
                } else if (i % 3 == 0) {
                    System.out.print("FIN ");
                } else if (i % 5 == 0) {
                    System.out.print("RA ");
                } else {
                    System.out.print(i + " ");
                }
            } // end of loop
            System.out.println();
        }
    }

    public static void main(String[] args) {
        finra(-20,5);
        finra(15,-15);
        finra(5,5);
    }











}
