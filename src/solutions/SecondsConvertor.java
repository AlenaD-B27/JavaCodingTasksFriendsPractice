package solutions;

import java.util.Scanner;

public class SecondsConvertor {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter seconds:");
        int inputSeconds = input.nextInt();

        int hours = inputSeconds / 3600; // 60 * 60 = 3600 -> 60 seconds in a minutes, 60 minutes in an hour
        inputSeconds %= 3600; // find left over number of seconds after the seconds were used for hours
        int minutes = inputSeconds / 60; // 60 seconds in a minute
        inputSeconds %= 60; // left over is how many seconds we have that weren't used for hours or minutes

        System.out.println(hours + " hours, " + minutes + " minutes, and " + inputSeconds + " seconds");

    }
}
