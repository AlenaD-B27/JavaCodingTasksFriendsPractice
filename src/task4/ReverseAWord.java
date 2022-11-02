package task4;

public class ReverseAWord {
    public static void main (String[] args) {

        String str= "ABCD", mydata="";
        char charData;

        System.out.println("Original word: ABCD"); // Original example word

        for (int i = 0; i < str.length(); i++) // Returns the length of this string
        {
            charData = str.charAt(i); //extracts each character
            mydata = charData + mydata; //adds each character in front of the existing string
        }
        System.out.println("Reversed word: "+ mydata);
    }
}

