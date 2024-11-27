package SCI.Sequencials;

import java.util.Scanner;

public class pt8WifiRadi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float area = sc.nextFloat();
        float radius = (float) Math.sqrt(area / Math.PI);
        int distance = Math.round(radius);

        System.out.println(distance);

    }
}