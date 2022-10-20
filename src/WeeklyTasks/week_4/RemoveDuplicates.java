package WeeklyTasks.week_4;
import java.util.*;

public class RemoveDuplicates {
    /*
    String -- Remove Duplicates
        Write a return method that can remove the duplicated values from String
        Ex: removeDup("AAABBBCCC") ==> ABC
     */

//In this method, we will work on the index position
    //In the main() method, we will create a string from which we have to remove duplicate characters.
    public static void removeDuplicates(String str) {
        //Create an empty string
        String newstr = new String();


//In the removeDuplicates() method, we will create a new empty string and calculate the original string's length.
        //calculate length of the original string
        int length = str.length();

        // We will traverse the string using the loop and check for the repeated characters using the indexOf() method
        for (int i = 0; i < length; i++)
        {
            // store the character available at ith index in the string
            char charAtPosition = str.charAt(i);

            // check the index of the charAtPosition. If the indexOf() method returns true add it to the resuting string
            if (newstr.indexOf(charAtPosition) < 0)
            {
                newstr += charAtPosition;
            }
        }
        //Print string after removing duplicate characters
        System.out.println(newstr);
    }
    // main() method start
    public static void main(String[] args)
    {
        // Create a string variable with default value
        String str = "AAAB313434BBCCC";
        //call removeDuplicates() method for removing duplicate characters
        removeDuplicates(str);
    }
}
