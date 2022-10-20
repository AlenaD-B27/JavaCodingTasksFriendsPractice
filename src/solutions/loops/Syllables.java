package solutions.loops;

public class Syllables {
    /*
    Syllables
    Given a String separated by dashes calculate how many syllables the words are
        Ex:
            Input:
                ja-va
            Output:
                2
     */
    public static void main(String[] args) {
        String s = "ja-va";
        int count = 1; // the number of syllabus would be equal to the number of - characters plus one because the - are used to separate two syllabus

        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '-'){
                count++;
            }
        }
        System.out.println(count);
    }
}
