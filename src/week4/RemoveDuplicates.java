package week4;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveDuplicates {
    /*

2️⃣  String -- Remove Duplicates
Write a return method that can remove the duplicated values from String
Ex: removeDup("AAABBBCCC") ==> ABC
     */
    public static void main(String[] args) {
        ArrayList<Integer> list =new ArrayList<>(Arrays.asList(1,3,1,4,5,9));
        System.out.println(removeDuplicate(list));


    }
    public static ArrayList<Integer> removeDuplicate(ArrayList<Integer> number) {

        ArrayList<Integer> newNumber = new ArrayList<>();

        for (int i = 0; i < number.size(); i++) {
            int count = 0;
            for (int j = 0; j < number.size(); j++) {
                if (number.get(i) == number.get(j)) {
                    count++;
                }

            }
            if (count == 1) {
                newNumber.add(number.get(i));
            }

        }
        return newNumber;
}
}
