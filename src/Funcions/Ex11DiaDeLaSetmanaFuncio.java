package Funcions;

import java.util.Scanner;

public class Ex11DiaDeLaSetmanaFuncio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Indica quin dia de la setmana és avui (1/7): ");
        int dia = sc.nextInt();

        System.out.println(diaDeLaSetmana(dia));
    }
    public static String diaDeLaSetmana(int a) {
        switch (a){
            case 1:
                return "Dilluns";
            case 2:
                return "Dimarts";
            case 3:
                return "Dimecres";
            case 4:
                return "Dijous";
            case 5:
                return "Divendres";
            case 6:
                return "Dissabte";
            case 7:
                return "Diumenge";
            default:
                return "Intodueix un dia valid (1/7).";
        }
    }
}
