package SCI.Condicionals;

import java.util.Scanner;

class pt5LaCalculadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        char c = sc.next().charAt(0);

        if (c == '+') {
            System.out.println(n1 + n2);
        } else if (c == '-') {
            System.out.println(n1 - n2);
        } else if (c == '*') {
            System.out.println(n1 * n2);
        } else if (c == '/') {
            System.out.println(n1 / n2);
        } else if (c == '%') {
            System.out.println(n1 % n2);
        } else {
            System.out.println("L'operacio no es valida");
        }
    }
}