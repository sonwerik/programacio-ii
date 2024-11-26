package SCI.Seqüencials;

import java.util.Scanner;


public class pt9DistànciesEntrePunts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();
        int x3 = scanner.nextInt();
        int y3 = scanner.nextInt();
        int x4 = scanner.nextInt();
        int y4 = scanner.nextInt();

        float distanceZeroToFirst = (float) Math.sqrt(Math.pow(x1-0, 2) + Math.pow(y1-0, 2));
        float distanceFristToSecond = (float) Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2));
        float distanceSecondToThird = (float) Math.sqrt(Math.pow(x3-x2, 2) + Math.pow(y3-y2, 2));
        float distanceThirdToForth = (float) Math.sqrt(Math.pow(x4-x3, 2) + Math.pow(y4-y3, 2));
        float distanceForthToZero = (float) Math.sqrt(Math.pow(0-x4, 2) + Math.pow(0-y4, 2));

        float totalDistance = Math.round(distanceZeroToFirst + distanceFristToSecond + distanceSecondToThird + distanceThirdToForth + distanceForthToZero);

        System.out.println(totalDistance);

    }
}
