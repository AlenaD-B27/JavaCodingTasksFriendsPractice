package week5;

public class ReverseString {
    /*
    2️⃣  String -- Reverse
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
        System.out.println("reverse(\"java!\") = " + reverseString("java"));
    }




}

