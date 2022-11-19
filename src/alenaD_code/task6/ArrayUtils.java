package alenaD_code.task6;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;

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

    // Array -- N unique integers that sum up to 0
    //Write a function: that, given an integer N (1 < N < 100), returns an array containing N unique integers that sum up to 0. The function can return any such array. For example, given N = 4, the function could return [1,0, -3,2] or [-2,1, -4,5]. The answer [1, -1,1,3] would be incorrect (because value 1 occurs twice). For N = 3 one of the possible answers is [-1,0,1]  (but there are many more correct answers).


// Festina's solution

    public static int[] solution(int N){

        int[] result = new int[N];

        int sum = 0;

        for(int i=0; i < N-1; i++) {

            result[i] =i;

            sum += i;

        }

        result[N-1] = -sum;

        return result;

    }



    public static void main(String[] args) {

        int [] dummy = {1, Integer.MAX_VALUE, -100, 4};

//        System.out.println(maxNum(dummy));
//        System.out.println(minNum(dummy));
//        System.out.println(Arrays.toString(sortAsc(dummy)));
 //       System.out.println(Arrays.toString(sortDsc(dummy)));


        System.out.println(Arrays.toString(solution(10)));


    }








}
