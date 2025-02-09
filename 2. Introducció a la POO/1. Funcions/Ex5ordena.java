package Funcions;

public class Ex5ordena {
    public static void main(String[] args) {
        int n1 = 7;
        int n2 = 2;
        int n3 = 12;

        int[] resultat = ordena(n1, n2, n3);
        for (int i : resultat) System.out.print(i + " ");
    }

    public static int[] ordena(int a, int b, int c) {
        if (a < b) {
            int temp = a;
            a = b;
            b = temp;
        }
        if (a < c) {
            int temp = a;
            a = c;
            c = temp;
        }
        if (b < c) {
            int temp = b;
            b = c;
            c = temp;
        }
        return new int[]{a, b, c};
    }
}