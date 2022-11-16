package alenaD_code.task6;

public class ArrayFindMax {
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


    public static void main(String[] args) {

        System.out.println(maxNum(new int[]{1, 25, 3, 4}));


    }








}
