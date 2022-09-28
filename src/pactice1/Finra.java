package pactice1;

public class Finra {
    /*FINRA :
Write a method which prints out the numbers from 1 to 30 but for numbers which are a multiple of 3print "FIN" instead of the number and for numbers which are a multiple of 5, print "RA" instead of the number. for numbers which are a multiple of both 3 and 5, print "FINRA" instead of the number.*/

    public static void from1to30(){
        for(int i = 1; i <= 30; i++){
        if ((i %3 == 0) && (i % 5 == 0)){
            System.out.println(i + " - FINRA");
        }else if(i % 5 == 0){
            System.out.println(i+" - RA");
        }else if(i % 3 == 0){
            System.out.println(i + " - FIN");
        }
    }
    }
    public static void numFrom1to30() {

        for (int i = 1; i <= 30; i++) {
            String word = "";
            if (i % 3 == 0) {
                word = "- FIN";
            }
            if (i % 5 == 0) {
                word += "RA";
            }
            if(word.isEmpty()){
                System.out.println(i);
            }else{
                System.out.println(word);
            }

        }
    }
            public static void main (String[]args){
                from1to30();
                numFrom1to30();
            }
        }