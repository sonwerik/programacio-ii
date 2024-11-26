package SCI.Iteratius;

import java.util.Scanner;

public class pt23PositiusVSNegatius {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int positius = 0;
        int negatius = 0;

        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            int n = sc.nextInt();
            if (n > 0) positius++;
            else if (n < 0) negatius++;
            else break;
        }
        if (positius > negatius) System.out.println("POSITIUS");
        else if (negatius > positius) System.out.println("NEGATIUS");
        else System.out.println("IGUALS");
    }
}
