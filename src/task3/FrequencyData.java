package task3;

public class FrequencyData {
    /*
    String -- Frequency of Characters
Write a return method that can find the frequency of characters
Ex: FrequencyOfChars("AAABBCDD") ==> A3B2C1D2
     */

    public static void main(String[] args)
    {
        String str = "482BBCC#!!!";
        int[] freq = new int[str.length()];
        System.out.println("The entered string is "+str);
        //Convert the given string into character array
        char str1[] = str.toCharArray();
        for(int i = 0; i < str.length(); i++)
        {
            freq[i] = 1;
            for(int j = i+1; j <str.length(); j++)
            {
                if(str1[i] == str1[j])
                {
                    freq[i]++;

                    //Set str1[j] to 0 to avoid printing visited character
                    str1[j] = '0';
                }
            }
        }
        //Displays the characters and their corresponding frequency
        System.out.println("Frequencies of the characters in the string are as below: ");
        System.out.println("Characters  Frequencies");
        for(int i = 0; i < freq.length; i++) {
            if (str1[i] != ' ' && str1[i] != '0')
                      System.out.println(str1[i] + "               " + freq[i]);
        }
    }
}