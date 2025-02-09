package SCI.Iteratius;

import java.util.Scanner;

public class pt18NombresAmics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int divn1 = 0;
        int divn2 = 0;
        boolean amics = false;

        for (int i = 1; i < n1; i++) {
            if (n1 % i == 0) divn1 += i;
        }
        for (int i = 1; i < n2; i++) {
            if (n2 % i == 0) divn2 += i;
        }
        if (divn1 == n2 && divn2 == n1) amics = true;

        System.out.println(String.valueOf(amics).toUpperCase());
    }
}
