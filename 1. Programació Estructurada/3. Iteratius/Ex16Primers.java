package SCI.Iteratius;

import Funcions.Ex2esPrimer;

import java.util.Scanner;

public class pt16Primers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        boolean primer = Ex2esPrimer.esPrimer(n);
        System.out.println(String.valueOf(primer).toUpperCase());
    }
}