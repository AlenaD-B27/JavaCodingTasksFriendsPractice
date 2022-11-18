package week6;

public class SortDescending {
    /*
    4️⃣  Array -- Sort Descending
Write a return method that can sort an int array in descending order without using the sort method of the Arrays class
     */


        public static void main(String[] args)
        {
            int temp;
            int[] arrNumbers = {14, 8, 5, 54, 41, 10, 1, 500};
            System.out.println("Before sort: ");
            for(int num : arrNumbers)
            {
                System.out.println(num);
            }
            for(int a = 0; a <= arrNumbers.length - 1; a++)
            {
                for(int b = 0; b <= arrNumbers.length - 2; b++)
                {
                    if(arrNumbers[b] < arrNumbers[b + 1])
                    {
                        temp = arrNumbers[b];
                        arrNumbers[b] = arrNumbers[b + 1];
                        arrNumbers[b + 1] = temp;
                    }
                }
            }
            System.out.println("After sort: ");
            for(int num : arrNumbers)
            {
                System.out.println(num);
            }
        }
    }

