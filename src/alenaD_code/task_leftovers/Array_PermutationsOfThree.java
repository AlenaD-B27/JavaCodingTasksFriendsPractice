package alenaD_code.task_leftovers;

/*
Array -- permutation combinations
Given an array of 3 characters, print all permutation combinations from the given characters.
 */


import java.util.Arrays;
import java.util.Collections;

public class Array_PermutationsOfThree {

   public static void permutations(int [] arr){

       int [] storage ;

       for (int i = 0; i < 3; i++) {
           storage = new int[arr.length];
           System.out.println(Arrays.toString(arr));
           storage[0] = arr[0];
           storage [1] = arr [2];
           storage [2] = arr [1];
           System.out.println(Arrays.toString(storage));
           storage[0] = arr[1];
           storage[1] = arr[2];
           storage[2] = arr[0];
           arr = storage;

       }



   }

    public static void main(String[] args) {

       int [] arr = {1,2,3};

       permutations(arr);




    }






}
