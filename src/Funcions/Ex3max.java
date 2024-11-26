package POO.Funcions;

public class Ex3max {
    public static void main(String[] args) {
        int n1 = 12;
        int n2 = 2;
        int maxValue = Integer.MIN_VALUE;

        System.out.println(max(n1, n2, maxValue));
    }
    public static int max(int a, int b, int c) {
        if (a > b) c = a;
        else c = b;
        return c;
    }
}