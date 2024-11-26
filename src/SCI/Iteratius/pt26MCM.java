package SCI.Iteratius;

import java.util.Scanner;

public class pt26MCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int mcd = 0;
        int nInical = n;
        int mInicial = m;

        while (m != 0) {
            mcd = m;
            m = n % m;
        }
        int mcm = (nInical * mInicial) / mcd;
        System.out.println(mcm);
    }
}