package solutions.nested_loop;

// Write a program that can return the index number of the first unique character.

public class FirstUniqueIndex {
    public static void main(String[] args) {
        String str = "AAABCCDEEF";

        for (int i = 0; i < str.length(); i++) {
            int count = 0;

            for (int j = 0; j < str.length(); j++) {

                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                }
            }

            if (count == 1) {
                System.out.print(i);
                break;
            }

        }

    }
}
