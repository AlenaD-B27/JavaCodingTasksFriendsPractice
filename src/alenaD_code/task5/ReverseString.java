package alenaD_code.task5;

public class ReverseString {
    /*
    Write a return method that can reverse  String
Ex: Reverse("ABCD"); ==> DCBA
     */

    public static String reverseString (String str){
        String reversed = "";

        for (int i = str.length()-1; i >= 0; i--) {
            reversed += str.charAt(i);
        }

        return reversed;
    }

    public static void main(String[] args) {
        System.out.println("reverseString(\"Hello123World!\") = " + reverseString("Hello123World!"));
    }




}
