package SCI.Sequencials;

import java.util.Scanner;

public class pt4DamMitjanaAritmeticaPonderada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float number1 = sc.nextFloat();
        float number2 = sc.nextFloat();
        float number3 = sc.nextFloat();
        float number4 = sc.nextFloat();

        int weight1 = sc.nextInt();
        int weight2 = sc.nextInt();
        int weight3 = sc.nextInt();
        int weight4 = sc.nextInt();

        float weightNumber1 = number1 * weight1 / 100;
        float weightNumber2 = number2 * weight2 / 100;
        float weightNumber3 = number3 * weight3 / 100;
        float weightNumber4 = number4 * weight4 / 100;

        float average = weightNumber1 + weightNumber2 + weightNumber3 + weightNumber4;

        System.out.println(Math.round(average));
    }
}
