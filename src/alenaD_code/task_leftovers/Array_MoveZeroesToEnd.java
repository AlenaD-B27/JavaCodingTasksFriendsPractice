package alenaD_code.task_leftovers;

/*
Array -- Move Zeros to the End
Write a method that can move all the zeros to the last indexes of the array (Do Not Use the Sort Method)
Ex:
input:  {1,0,2,0,3,0,4,0};
output: [1, 2, 3, 4, 0, 0, 0, 0]
 */


import java.util.Arrays;

public class Array_MoveZeroesToEnd {

    public static int [] moveZeroesToEnd(int [] arr){
        int [] returnArr = new int[arr.length];


        int j = 0; // index for returnArr

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != 0){
                returnArr[j] = arr[i];
                j++;
            }
        }

        return returnArr;
    }



    public static void main(String[] args) {
        int [] arr = {1,0,2,0,3,0,4,0};
        System.out.println(Arrays.toString(moveZeroesToEnd(arr)));
    }







}
