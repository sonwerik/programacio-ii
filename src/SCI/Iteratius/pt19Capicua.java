package SCI.Iteratius;

import java.util.Scanner;

public class pt19Capicua {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nombre = scanner.nextInt();
        String str = Integer.toString(nombre);
        String strInvers = "";
        boolean capicua = false;

        for (int i = str.length() - 1; i >= 0; i--) {
            strInvers += str.charAt(i);
        }

        if (str.equals(strInvers)) capicua = true;

        System.out.println(String.valueOf(capicua).toUpperCase());
    }
}
