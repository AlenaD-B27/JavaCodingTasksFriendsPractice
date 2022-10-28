package week_four_tasks;

import java.util.Arrays;

public class SameLetters {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "olleh";
        String[] first = s1.split("");
        String[] second = s2.split("");

        int letter = first.length;
        for(int i = 0; i < letter-1; i++){
            for(int j = i + 1; j < first.length; j++){
                if(first[i].compareTo(first[j]) > 0){
                    String str = first[i];
                    first[i] = first[j];
                    first[j] = str;
                }
            }
        }

        int letterTwo = second.length;
        for(int i = 0; i < letterTwo - 1; i++){
            for(int j = i + 1 ; j < second.length; j++){
                if(second[i].compareTo(second[j]) > 0){
                    String str = second[i];
                    second[i] = second[j];
                    second[j] = str;
                }
            }
        }

        if(first.length == second.length){
            if(Arrays.equals(first,second)){
                System.out.println("true");
            } else {
                System.out.println("false");
            }
        } else {
            System.out.println("false");
        }



    }
}
