package week_four_tasks;

public class Frequency {
    public static void main(String[] args) {

        String str = "asdkakdjajakjdklasjlk";
        String checked = ""; // this checks if there is another char of that


        for (int i = 0; i < str.length(); i++) {
            int count = 0; // we start from the  0 , a


        if (!checked.contains("" + str.charAt(i))) {
            for( int j = 0; j < str.length(); j++){ // i created j also to check the next letters
                if(str.charAt(i) == str.charAt(j)){ // so if i and j is equal
                    count++; // so it adds 1 to a letter
                }
            }
            System.out.print(str.charAt(i) + "-" + count);
            checked += str.charAt(i);
        }
        }
    }
}
