package practice4;

public class ReverseString {
    public static void main(String[] args) {
        System.out.println("reverse(\"fofapHA276\") = " + reverse("fofapHA276"));
        System.out.println("reverse(\"fgh%6gjgrED78\") = " + reverse("fgh%6gjgrED78"));
    }

    //2️⃣  String -- Reverse
    //Write a return method that can reverse  String
    //Ex: Reverse("ABCD"); ==> DCBA
    //
    public static String reverse(String str){

        String reverse = "";
        for(int i = str.length()-1; i>=0;i--){// we need to str.length()-1; i>=0 because without it it would cause String index out of range
            reverse +=str.charAt(i);
        }
        return reverse;
    }
    // or we can use build in method reverse of StringBuilder
    //1)Create an object of the StringBuilder class
    //2)Use the object as a mutable String
    public static String reverse2(String str){
        StringBuilder reverse = new StringBuilder(str);
        reverse.reverse();
        str = reverse.toString();
        return str;
    }

}
