package alenaD_code.task_leftovers;
/*
ArrayList -- Remove some values
Given a list of Integers 1, 2, 3, 4, 5, 6 ....etc. Remove all values greater than 100.
 */

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList_RemoveValues {


    public static ArrayList<Integer> removeNumbersOver100(ArrayList<Integer> list){
        list.removeIf(p -> p > 100);
        return list;
    }


    public static void main(String[] args) {
        System.out.println(removeNumbersOver100(new ArrayList<>(Arrays.asList(1,2,3,4,999,5,6,26,38,100,40,2000,-50,-199))));
    }


}
