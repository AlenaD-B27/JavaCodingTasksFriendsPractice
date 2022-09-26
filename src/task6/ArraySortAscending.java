package task6;

import java.util.Arrays;

public class ArraySortAscending {

//    Array -- Sort Ascending
//    Write a return method that can sort an int array in Ascending order without using the sort method of the Arrays class

    public static void main (String [] args) {
        int[] array = new int[]{2, -4, -7, 5, 9, -88, 90};
        int index = -1;
        for (int i = 0; i < array.length; i++) {
            index = i;
            for (int j = i; j <= array.length - 1; j++) {
                if (array[j] < array[index]) {
                    index = j;
                }
            }
            int temp = array[i];
            array[i] = array[index];
            array[index] = temp;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i] + ",");
        }
    }
}
