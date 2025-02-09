package SCI.Sequencials;

import java.util.Scanner;

public class pt3DamMitjanaAritmetica {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float n1 = sc.nextFloat();
        float n2 = sc.nextFloat();
        float n3 = sc.nextFloat();
        float n4 = sc.nextFloat();
        int average = (int) (Math.ceil((n1 + n2 + n3 + n4) / 4));

        System.out.println(average);
    }
}
