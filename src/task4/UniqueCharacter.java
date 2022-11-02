package task4;

import java.util.Scanner;

public class UniqueCharacter {

    public static void main(String[] args) {
        String string1="AAABBBCCCDEF"; // Initially take the input from user in form of string
        char string[] = string1.toCharArray();
        int count;
        String stringdata="";
        StringBuffer me = new StringBuffer(string1); // Creating a StringBuffer object
        // by passing the required string as a parameter to the constructor.
        for(int i = 0; i < me.length(); i++){ // So when outer loop executes for 1 time, the inner
            // loop will be getting executed for me number of times (me indicates the length of given string).
            int count1 = 0;
            // Using 2 for loops cascaded, the outer for loop is for holding one particular character
            // and inner for loop is used to iterate over other elements of the given string.
            for(int j = i + 1; j < me.length(); j++){ // me.length returns the length.
                if(me.charAt(i) == me.charAt(j)){ //Inside the inner for loop just check if
                    // the elements are matching
                    me.deleteCharAt(j);
                    j--;
                    count1++; // if true then increase the counter by 1
                }
            }
            if(count1 >= 1){ // counter value is > 1, if true then it’s a duplicate element, otherwise it’s a unique element.
                //So when the outer for loop gets executed completely all the unique characters will get printed
                me.deleteCharAt(i);
                i--;
            }
        }
        for(int i = 0; i < me.length();i++) { // So when the outer for loop gets executed
            // completely all the unique characters will get printed
            stringdata = stringdata + me.charAt(i); // if it's true the value will be returned
        }
        System.out.println(stringdata);
    }
}


