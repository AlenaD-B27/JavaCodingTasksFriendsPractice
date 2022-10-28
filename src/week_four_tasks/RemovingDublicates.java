package week_four_tasks;

public class RemovingDublicates {

    public static String removeDuplicate(String str) {
        String result = "";

        while (str.length() > 0) {   // i used while because it continues to execute until there is no more so we start from 0 and go on
            result += str.substring(0, 1); //

            str = str.replaceAll(str.substring(0, 1), "");

        }
        return result;
    }

    public static void main(String[] args) {

        System.out.println(removeDuplicate("aaaaabccccddddeeefff"));

    }

    }

