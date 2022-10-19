package week1;

public class FINRA {
    public static void fromOneToThirty(int number) {
     /*   if (num <= 30 & num >= 1) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FINRA");

            } else if (i % 5 == 0) {
                System.out.println("RA");

            } else if (i % 3 == 0) {
                System.out.println("FIN");
            } else {
                System.out.println(num);
            }
        } else {
            System.out.println("Number can be maximum 30!");
            System.out.println("Please enter an acceptable number");
        }*/





    /*    if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FINRA");

            } else if (i % 5 == 0) {
                System.out.println("RA");

            } else if (i % 3 == 0) {
                System.out.println("FIN");
            } else {
                System.out.println(num);
            }

        } else {
            System.out.println("Number should be between 1 to 30");
            System.out.println("Pleas enter an acceptable number");
        }*/


    //    for (int i = 0; i <= 30; i++) {
            if (number % 3 == 0 && number % 5 == 0) {
                System.out.println("FINRA");

            } else if (number % 5 == 0) {
                System.out.println("RA");

            } else if (number % 3 == 0) {
                System.out.println("FIN");
            } else {
               System.out.println(number);
            }
        //}

    }

    public static void main(String[] args) {

   fromOneToThirty(4);

    }
}
