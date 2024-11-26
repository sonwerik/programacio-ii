package SCI.Seqüencials;

import java.util.Scanner;

public class pt3DamMitjanaAritmètica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float n1 = scanner.nextFloat();
        float n2 = scanner.nextFloat();
        float n3 = scanner.nextFloat();
        float n4 = scanner.nextFloat();
        int average = (int) (Math.ceil((n1 + n2 + n3 + n4) / 4));

        System.out.println(average);
    }
}
