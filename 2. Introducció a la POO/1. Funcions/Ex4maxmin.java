package Funcions;

public class Ex4maxmin {
    public static void main(String[] args) {
        int n1 = 12;
        int n2 = 7;
        int n3 = 2;
        int maxValue = Integer.MIN_VALUE;
        int minValue = Integer.MAX_VALUE;

        System.out.println(max(n1, n2, n3, maxValue));
        System.out.println(min(n1, n2, n3, minValue));
    }
    public static int max(int a, int b, int c, int d) {
        if (a > b && a > c) d = a;
        if (b > a && b > c) d = b;
        if (c > a && c > b) d = c;
        return d;
        //return Math.max(a, Math.max(b, c));
    }
    public static int min(int a, int b, int c, int d) {
        if (a < b && a < c) d = a;
        if (b < a && b < c) d = b;
        if (c < a && c < b) d = c;
        return d;
        //return Math.min(a, Math.min(b, c));
    }
}
