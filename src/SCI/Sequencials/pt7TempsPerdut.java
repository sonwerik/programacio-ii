package SCI.Sequencials;

import java.util.Scanner;

public class pt7TempsPerdut {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int inputSeconds = sc.nextInt();

        int days = 33 * 5;

        int totalSeconds = inputSeconds * days;

        int secondsToHours = totalSeconds / 3600;
        int modulusHours = totalSeconds % 3600;
        int minutesToHours = modulusHours / 60;
        int modulusSeconds = modulusHours % 60;

        System.out.println(secondsToHours);
        System.out.println(minutesToHours);
        System.out.println(modulusSeconds);
    }
}
