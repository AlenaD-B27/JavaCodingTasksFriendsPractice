package alenaD_code.task6;

public class ArrayFindMin {
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


    public static void main(String[] args) {

        System.out.println(minNum(new int[]{1, 25, -100, 4}));


    }

}
