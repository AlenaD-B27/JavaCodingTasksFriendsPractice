package task6;

public class ArrayFindMaximum {

//    Array -- Find Maximum
//    Write a method that can find the maximum number from an int Array

    public static void main(String[] args) {

        int[] arr = new int[]{3, -3, 7, 55, 18, -12, 22, 35, 678};

        int max = arr[0]; //Initialize max with first element of array.

        for (int i = 0; i < arr.length; i++) {  //Compare elements of array with max
            if (arr[i] > max)
                max = arr[i];
        }

        System.out.println("Max is : " + max);
    }
}