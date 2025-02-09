package SCI.Iteratius;
import java.util.Scanner;

public class pt8MultiplicacioPerPotencia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int pow = 1;

        for (int i = 1; i <= n2; i++) {
            pow *= n1;
        }
        System.out.println(pow);
    }
}
