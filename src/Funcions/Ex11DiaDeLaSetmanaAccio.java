package Funcions;

import java.util.Scanner;

public class Ex11DiaDeLaSetmanaAccio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Indica quin dia de la setmana és avui (1/7): ");
        int dia = sc.nextInt();

        diaDeLaSetmana(dia);
    }
    public static void diaDeLaSetmana(int a) {
        switch (a){
            case 1:
                System.out.println("Dilluns");
                break;
            case 2:
                System.out.println("Dimarts");
                break;
            case 3:
                System.out.println("Dimecres");
                break;
            case 4:
                System.out.println("Dijous");
                break;
            case 5:
                System.out.println("Divendres");
                break;
            case 6:
                System.out.println("Dissabte");
                break;
            case 7:
                System.out.println("Diumenge");
                break;
            default:
                System.out.println("Intodueix un dia valid (1/7).");
        }
    }
}
