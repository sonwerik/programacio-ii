package SCI.Iteratius;

import java.util.Scanner;

public class pt4RecorregutDescendent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        for (int i = n1; i >= n2; i--){
            System.out.println(i);
        }
    }
}
