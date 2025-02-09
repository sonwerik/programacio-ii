package POO.Activitats1.Exercici3;

import java.util.Scanner;

public class CotxePermis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Cotxe cotxe = new Cotxe();
        PermisConduir permis = new PermisConduir();

        cotxe.setMarca("Toyota");
        cotxe.setModel("AE86");
        cotxe.setMatricula("7312HRS");

        permis.setNom("Èrik Calvo Lledó");
        permis.setTipuPermis("B");
        permis.setPunts(12);

        boolean sortir = false;
        while (!sortir) {
            System.out.println("\n-----------------------------------------");
            System.out.println("----- DIRECCIÓ GENERAL DE TRANSIT -------");
            System.out.println("-----------------------------------------");
            System.out.println("1. Modificar la informació del seu cotxe");
            System.out.println("2. Modificar la informació del seu permís");
            System.out.println("3. Mostrar informació del cotxe i del permis");
            System.out.println("0. Sortir del programa");
            System.out.print("\nSi us plau, esculli una opció: ");
            int opcio = sc.nextInt();

            switch (opcio) {
                case 1:
                    modificarCotxe(cotxe);
                    break;
                case 2:
                    modificarPermis(permis);
                    break;
                case 3:
                    mostrarInformacio(cotxe, permis);
                    break;
                case 0:
                    sortir = true;
                    System.out.println("Fins aviat!");
                    break;
                default:
                    System.out.println("\nOpció no vàlida, si us plau, escull una de les opcions anteriors.");
            }
        }
    }

    public static void modificarCotxe(Cotxe cotxe) {
        Scanner sc = new Scanner(System.in);

        System.out.print("\nIntrodueix la marca del cotxe: ");
        String marca = sc.next();
        cotxe.setMarca(marca);

        System.out.print("Introdueix el model del cotxe: ");
        String model = sc.next();
        cotxe.setModel(model);

        System.out.print("Introdueix la matrícula del cotxe: ");
        String matricula = sc.next();
        cotxe.setMatricula(matricula);

        System.out.println("\nLa informació del cotxe ha estat modificada correctament.");
    }

    public static void modificarPermis(PermisConduir permis) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introdueix el nom complet del titular: ");
        String nom = sc.nextLine();
        permis.setNom(nom);

        System.out.print("Introdueix el tipus de permís: ");
        String tipusPermis = sc.next();
        permis.setTipuPermis(tipusPermis);

        System.out.print("Introdueix els punts del permís: ");
        int punts = sc.nextInt();

        permis.setPunts(punts);

        System.out.println("\nLa informació del permís ha estat modificada correctament.");
    }

    public static void mostrarInformacio(Cotxe cotxe, PermisConduir permis) {
        System.out.println("\n--- INFORMACIÓ DEL VEHICLE ---");
        cotxe.infoCotxe();

        System.out.println("\n--- INFORMACIÓ DEL PERMÍS DE CONDUIR ---");
        permis.imprimirPermis();
    }
}