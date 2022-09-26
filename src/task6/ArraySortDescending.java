package task6;

import java.util.Arrays;

public class ArraySortDescending {

//    Array -- Sort Descending
//    Write a return method that can sort an int array in descending order without using the sort method of the Arrays class

    public static void main (String [] args) {
        int[] array = new int[]{2, -4, -7, 5, 9, -88, 90};
        int index = -1;
        for (int i = 1; i < array.length; i++) {
            int keyValue = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > keyValue) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = keyValue;

        }
        for (int i = 0; i < array.length; i++) {

            System.out.print(array[i] + ",");
        }

    }

}
