package Funcions;

public class Ex2esPrimer {
    public static void main(String[] args) {
        int numero = 13;
        System.out.println(esPrimer(numero));
    }
    public static boolean esPrimer(int n) {
        boolean primer = true;

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                primer = false;
                break;
            }
        }
        return primer;
    }
}
