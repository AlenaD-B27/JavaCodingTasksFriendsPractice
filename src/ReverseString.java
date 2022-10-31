public class ReverseString {
/*
 Write a return method that can reverse String Ex: Reverse("ABCD"); ==> DCBA
 */

    public static String StrReverse(String str) {

        String reverse="";

        for(int i=str.length()-1; i >= 0; i--)

            reverse += str.toCharArray()[i];



        return  reverse;

    }

// solution number 2:
public  static String  Reverse(String str) {

    return new StringBuffer(str).reverse().toString();

}

    public static void main(String[] args) {

        System.out.println(StrReverse("ABCD"));

        System.out.println(Reverse("ABCD1"));
    }

}
