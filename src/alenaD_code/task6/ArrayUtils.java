package alenaD_code.task6;

import java.util.Arrays;

public class ArrayUtils {
    //Array -- Find Maximum
    //Write a method that can find the maximum number from an int Array

    public static int maxNum(int [] arr){

        int max = arr[0];
        for(int eachInt : arr){
            if(max <= eachInt){
                max = eachInt;
            }
        }

        return max;
    }

    //Array -- Find Minimum
    //Write a method that can find the minimum number from an int Array

    public static int minNum(int [] arr){

        int min = arr[0];
        for(int eachInt : arr){
            if(min >= eachInt){
                min = eachInt;
            }
        }

        return min;
    }

    // Array -- Sort Ascending
    // Write a return method that can sort an int array in Ascending order without using the sort method of the Arrays class

    public static int [] sortAsc(int [] arr) {

        int[] returnArr = new int[arr.length];


        for (int j = 0; j < returnArr.length; j++) {


            int min = minNum(arr);

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == min) {
                    arr[i] = Integer.MAX_VALUE;
                    break;
                }
            }

            returnArr[j] = min;


        }

        // 1. find min - store in separate int
        // 2. reassign the value: arr[i] = Integer.MAX_VALUE;
        // 3. assign min to return [i]

        return returnArr;
    }


    //Array -- Sort Descending
    //Write a return method that can sort an int array in descending order without using the sort method of the Arrays class

    public static int [] sortDsc(int [] arr) {

        int[] returnArr = new int[arr.length];


        for (int j = 0; j < returnArr.length; j++) {


            int max = maxNum(arr);

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == max) {
                    arr[i] = Integer.MIN_VALUE;
                    break;
                }
            }

            returnArr[j] = max;


        }

        return returnArr;
    }














    public static void main(String[] args) {

        int [] dummy = {1, 25, -100, 4};

//        System.out.println(maxNum(dummy));
//        System.out.println(minNum(dummy));
//        System.out.println(Arrays.toString(sortAsc(dummy)));
//        System.out.println(Arrays.toString(sortDsc(dummy)));


    }








}
