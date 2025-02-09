package SCI.Sequencials;

import java.util.Scanner;


public class pt9DistanciesEntrePunts {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        int x3 = sc.nextInt();
        int y3 = sc.nextInt();
        int x4 = sc.nextInt();
        int y4 = sc.nextInt();

        float distanceZeroToFirst = (float) Math.sqrt(Math.pow(x1, 2) + Math.pow(y1, 2));
        float distanceFirstToSecond = (float) Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2));
        float distanceSecondToThird = (float) Math.sqrt(Math.pow(x3-x2, 2) + Math.pow(y3-y2, 2));
        float distanceThirdToForth = (float) Math.sqrt(Math.pow(x4-x3, 2) + Math.pow(y4-y3, 2));
        float distanceForthToZero = (float) Math.sqrt(Math.pow(-x4, 2) + Math.pow(-y4, 2));

        float totalDistance = Math.round(distanceZeroToFirst + distanceFirstToSecond + distanceSecondToThird + distanceThirdToForth + distanceForthToZero);

        System.out.println(totalDistance);

    }
}