package SCI.Seqüencials;

import java.util.Scanner;

public class pt4DamMitjanaAritmèticaPonderada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float number1 = scanner.nextFloat();
        float number2 = scanner.nextFloat();
        float number3 = scanner.nextFloat();
        float number4 = scanner.nextFloat();

        int weight1 = scanner.nextInt();
        int weight2 = scanner.nextInt();
        int weight3 = scanner.nextInt();
        int weight4 = scanner.nextInt();

        float weightNumber1 = number1 * weight1 / 100;
        float weightNumber2 = number2 * weight2 / 100;
        float weightNumber3 = number3 * weight3 / 100;
        float weightNumber4 = number4 * weight4 / 100;

        float average = weightNumber1 + weightNumber2 + weightNumber3 + weightNumber4;

        System.out.println(Math.round(average));
    }
}
