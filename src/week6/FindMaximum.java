package week6;

import java.util.Arrays;
import java.util.Collections;

public class FindMaximum {
    /*
    1️⃣  Array -- Find Maximum
Write a method that can find the maximum number from an int Array
     */


        public static int max(int[] array) {
            int max = 0;

            for (int i = 0; i < array.length; i++) {
                if (array[i] > max) {
                    max = array[i];
                }
            }
            return max;
        }


        public static void main(String[] args) {
           Integer[] arr = {145, 482, 850, 357, 171};

         // System.out.println(max(arr));

          Arrays.sort(arr, Collections.reverseOrder());
            System.out.println(Arrays.toString(arr));
        }
    }

