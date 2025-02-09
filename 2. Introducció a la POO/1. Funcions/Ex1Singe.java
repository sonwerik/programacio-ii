package Funcions;

public class Ex1Singe {
    public static void main(String[] args) {

        int num = 10;

        System.out.println(signe(num));
    }
    public static String signe (int numero) {
        if (numero > 0) {
            return "positiu";
        } else if (numero == 0) {
            return "zero";
        } else {
            return "negatiu";
        }
    }
}
