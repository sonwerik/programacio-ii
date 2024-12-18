package SCI.Iteratius;

import java.util.Scanner;

public class pt19Capicua {
    public static void main(String[] ignoredArgs) {
        Scanner scanner = new Scanner(System.in);
        int nombre = scanner.nextInt();
        String str = Integer.toString(nombre);
        StringBuilder strInvers = new StringBuilder();
        boolean capicua = false;

        for (int i = str.length() - 1; i >= 0; i--) {
            strInvers.append(str.charAt(i));
        }

        if (str.contentEquals(strInvers)) capicua = true;

        System.out.println(String.valueOf(capicua).toUpperCase());
    }
}
