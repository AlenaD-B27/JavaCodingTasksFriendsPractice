package week6;

public class FindMinimum {
    /*
    2️⃣  Array -- Find Minimum
Write a method that can find the maximum number from an int Array
     */


    public static int min(int[] array) {
        int min = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int[] arr = {145, 482, 850, 357, 171};

        System.out.println(min(arr));
    }
}
