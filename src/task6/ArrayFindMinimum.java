package task6;
import java.util.Arrays;
import java.util.Collections;
public class ArrayFindMinimum {

//    Array -- Find Minimum
//    Write a method that can find the min number from an int Array

    public static void main(String[] args) {

        Integer[] num = {2, -4, -7, 5, 9, -88, 90,777};
        // using Collections.min() to
        // find minimum element
        // using only 1 line.
        int min = Collections.min(Arrays.asList(num));
        System.out.println("Minimum number of array is : " + min);

    }
}