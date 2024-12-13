package POO.Activitats2.factures;

import java.util.Scanner;
import java.util.regex.Pattern;

public class GestorFactura {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Client client1 = new Client();
        client1.setDni("43572893Z");
        client1.setNomCognoms("Èrik Lledó");
        client1.setQuantitatTrucades(27);
        client1.setPreuPerMinut(0.05);
        client1.getTrucada().setMinutsTrucada(7);
        client1.getTrucada().setDestinatari("Nicolas Bonida");

        Client client2 = new Client();
        client2.setDni("92784652K");
        client2.setNomCognoms("Pau Queralt");
        client2.setQuantitatTrucades(22);
        client2.setPreuPerMinut(0.03);
        client2.getTrucada().setMinutsTrucada(3);
        client2.getTrucada().setDestinatari("Nicolas Bonida");

        Client client3 = new Client();
        client3.setDni("29384929J");
        client3.setNomCognoms("Nalea Garcia");
        client3.setQuantitatTrucades(15);
        client3.setPreuPerMinut(0.07);
        client3.getTrucada().setMinutsTrucada(5);
        client3.getTrucada().setDestinatari("Gael Paez");

        Client client4 = new Client();
        client4.setDni("12345678P");
        client4.setNomCognoms("Daniel Ruiz");
        client4.setQuantitatTrucades(10);
        client4.setPreuPerMinut(0.04);
        client4.getTrucada().setMinutsTrucada(4);
        client4.getTrucada().setDestinatari(client2.getNomCognoms());

        Client client5 = new Client();

        String dni1 = client1.getDni();
        String dni2 = client2.getDni();
        String dni3 = client3.getDni();
        String dni4 = client4.getDni();

        boolean continuar = true;
        while (continuar) {
            System.out.println("\nGESTOR DE FACTURES TELEFÒNIQUES\n");
            System.out.println("1. Afegir un client");
            System.out.println("2. Afegir una trucada a un client");
            System.out.println("3. Consulta la factura d'un client");
            System.out.println("4. Consulta tots els clients");
            System.out.println("0. Sortir del programa...");
            System.out.print("Tria una de les opcions anteriors: ");
            String dni = "";
            boolean afegit = false;
            int opcio = sc.nextInt();
            switch (opcio) {
                case 1:
                    while (true) {
                        System.out.print("\nIntrodueix el DNI del client: ");
                        dni = sc.next().toUpperCase();
                        if (validarDNIRepetit(dni, dni1, dni2, dni3, dni4) && validarDNICorrecte(dni)) {
                            client5.setDni(dni);
                            break;
                        } else if (validarDNIRepetit(dni, dni1, dni2, dni3, dni4) && !validarDNICorrecte(dni)) {
                            System.out.println("DNI incorrecte. Torna a intentar-ho.");
                        } else if (!validarDNIRepetit(dni, dni1, dni2, dni3, dni4) && validarDNICorrecte(dni)) {
                            System.out.println("DNI repetit. Torna a intentar-ho.");
                        }
                    }
                    System.out.print("Introdueix el nom i cognoms del client: ");
                    sc.nextLine();
                    client5.setNomCognoms(sc.nextLine());
                    client5.setPreuPerMinut(0.1);
                    System.out.print("El preu de les trucades per minut es de ");
                    System.out.print(client5.getPreuPerMinut() + " €");
                    client5.setQuantitatTrucades(0);
                    System.out.println("\nEncara no ha fet cap trucada");
                    afegit = true;
                    System.out.println("\nClient afegit!");
                    break;

                case 2:
                    while (true) {
                        int minuts = 0;
                        System.out.print("\nIndiqui el DNI del client al qual desitja afegir una trucada: ");
                        dni = sc.next().toUpperCase();
                        if (dni.equals(client1.getDni())) {
                            client1.setQuantitatTrucades(client1.getQuantitatTrucades() + 1);
                            System.out.print("Indiqui els minuts que ha durat la trucada: ");
                            minuts = sc.nextInt();
                            client1.getTrucada().setMinutsTrucada(minuts);
                            System.out.print("Indiqui el destinatari de la trucada: ");
                            sc.nextLine();
                            client1.getTrucada().setDestinatari(sc.nextLine());
                            System.out.println("\nTrucada afegida!");
                        } else if (dni.equals(client2.getDni())) {
                            client2.setQuantitatTrucades(client2.getQuantitatTrucades() + 1);
                            System.out.print("Indiqui els minuts que ha durat la trucada: ");
                            minuts = sc.nextInt();
                            client2.getTrucada().setMinutsTrucada(minuts);
                            System.out.print("Indiqui el destinatari de la trucada: ");
                            sc.nextLine();
                            client2.getTrucada().setDestinatari(sc.nextLine());
                            System.out.println("\nTrucada afegida!");
                        } else if (dni.equals(client3.getDni())) {
                            client3.setQuantitatTrucades(client3.getQuantitatTrucades() + 1);
                            System.out.print("Indiqui els minuts que ha durat la trucada: ");
                            minuts = sc.nextInt();
                            client3.getTrucada().setMinutsTrucada(minuts);
                            System.out.print("Indiqui el destinatari de la trucada: ");
                            sc.nextLine();
                            client3.getTrucada().setDestinatari(sc.nextLine());
                            System.out.println("\nTrucada afegida!");
                        } else if (dni.equals(client4.getDni())) {
                            client4.setQuantitatTrucades(client4.getQuantitatTrucades() + 1);
                            System.out.print("Indiqui els minuts que ha durat la trucada: ");
                            minuts = sc.nextInt();
                            client4.getTrucada().setMinutsTrucada(minuts);
                            System.out.print("Indiqui el destinatari de la trucada: ");
                            sc.nextLine();
                            client4.getTrucada().setDestinatari(sc.nextLine());
                            System.out.println("\nTrucada afegida!");
                        } else if (dni.equals(client5.getDni())) {
                            client5.setQuantitatTrucades(client5.getQuantitatTrucades() + 1);
                            System.out.print("Indiqui els minuts que ha durat la trucada: ");
                            minuts = sc.nextInt();
                            client5.getTrucada().setMinutsTrucada(minuts);
                            System.out.print("Indiqui el destinatari de la trucada: ");
                            sc.nextLine();
                            client5.getTrucada().setDestinatari(sc.nextLine());
                            System.out.println("\nTrucada afegida!");
                        } else {
                            System.out.println("DNI incorrecte. Torna a intentar-ho.");
                        }
                        break;
                    }
                    break;

                case 3:
                    System.out.print("Introudiu el DNI del client del qual voleu consultar la factura: ");
                    dni = sc.next().toUpperCase();
                    if (dni.equals(client1.getDni())) {
                        System.out.println("\nFactura telefònica: " + client1 + "\n  Minuts totals: " + client1.getTrucada().getMinutsTrucada() * client1.getQuantitatTrucades() + "\n  Preu total: " + String.format("%.2f", client1.getTrucada().getMinutsTrucada() * client1.getQuantitatTrucades() * client1.getPreuPerMinut()) +  " €");
                    } else if (dni.equals(client2.getDni())) {
                        System.out.println("\nFactura telefònica: " + client2 + "\n  Minuts totals: " + client2.getTrucada().getMinutsTrucada() * client2.getQuantitatTrucades() + "\n  Preu total: " + String.format("%.2f", client2.getTrucada().getMinutsTrucada() * client2.getQuantitatTrucades() * client2.getPreuPerMinut()) + " €");
                    } else if (dni.equals(client3.getDni())) {
                    System.out.println("\nFactura telefònica: " + client3 + "\n  Minuts totals: " + client3.getTrucada().getMinutsTrucada() * client3.getQuantitatTrucades() + "\n  Preu total: " + String.format("%.2f", client3.getTrucada().getMinutsTrucada() * client3.getQuantitatTrucades() * client3.getPreuPerMinut()) + " €");
                    } else if (dni.equals(client4.getDni())) {
                    System.out.println("\nFactura telefònica: " + client4 + "\n  Minuts totals: " + client4.getTrucada().getMinutsTrucada() * client4.getQuantitatTrucades() + "\n  Preu total: " + String.format("%.2f", client4.getTrucada().getMinutsTrucada() * client4.getQuantitatTrucades() * client4.getPreuPerMinut()) + " €");
                    } else if (dni.equals(client5.getDni())) {
                    System.out.println("\nFactura telefònica: " + client5 + "\n  Minuts totals: " + client5.getTrucada().getMinutsTrucada() * client5.getQuantitatTrucades() + "\n  Preu total: " + String.format("%.2f", client5.getTrucada().getMinutsTrucada() * client5.getQuantitatTrucades() * client5.getPreuPerMinut()) + " €");
                    } else {
                    System.out.println("DNI incorrecte. Torna a intentar-ho.");
                    }
                    break;
                    
                case 4:
                    System.out.print("\nClients registrats: ");
                    System.out.println("\n  " + client1.getNomCognoms() + "\n  DNI: " + client1.getDni() + "\n  Trucades: " + client1.getQuantitatTrucades() + "\n  Minuts: " + client1.getTrucada().getMinutsTrucada() * client1.getQuantitatTrucades() + "\n  Import total: " + String.format("%.2f", client1.getTrucada().getMinutsTrucada() * client1.getQuantitatTrucades() * client1.getPreuPerMinut()) +  " €");
                    System.out.println("\n  " + client2.getNomCognoms() + "\n  DNI: " + client2.getDni() + "\n  Trucades: " + client2.getQuantitatTrucades() + "\n  Minuts: " + client2.getTrucada().getMinutsTrucada() * client2.getQuantitatTrucades() + "\n  Import total: " + String.format("%.2f", client2.getTrucada().getMinutsTrucada() * client2.getQuantitatTrucades() * client2.getPreuPerMinut()) +  " €");
                    System.out.println("\n  " + client3.getNomCognoms() + "\n  DNI: " + client3.getDni() + "\n  Trucades: " + client3.getQuantitatTrucades() + "\n  Minuts: " + client3.getTrucada().getMinutsTrucada() * client3.getQuantitatTrucades() + "\n  Import total: " + String.format("%.2f", client3.getTrucada().getMinutsTrucada() * client3.getQuantitatTrucades() * client3.getPreuPerMinut()) +  " €");
                    System.out.println("\n  " + client4.getNomCognoms() + "\n  DNI: " + client4.getDni() + "\n  Trucades: " + client4.getQuantitatTrucades() + "\n  Minuts: " + client4.getTrucada().getMinutsTrucada() * client4.getQuantitatTrucades() + "\n  Import total: " + String.format("%.2f", client4.getTrucada().getMinutsTrucada() * client4.getQuantitatTrucades() * client4.getPreuPerMinut()) +  " €");
                    if (afegit) {System.out.println("\n  " + client5.getNomCognoms() + "\n  DNI: " + client5.getDni() + "\n  Trucades: " + client5.getQuantitatTrucades() + "\n  Minuts: " + client5.getTrucada().getMinutsTrucada() * client5.getQuantitatTrucades() + "\n  Import total: " + String.format("%.2f", client5.getTrucada().getMinutsTrucada() * client5.getQuantitatTrucades() * client5.getPreuPerMinut()) +  " €");}
                    break;
            }
        }
    }

    public static boolean validarDNIRepetit(String dni, String dni1, String dni2, String dni3, String dni4) {
        return !dni.equals(dni1) && !dni.equals(dni2) && !dni.equals(dni3) && !dni.equals(dni4);
    }

    public static boolean validarDNICorrecte(String dni) {
        return dni.length() == 9 && Pattern.matches("^[0-9]{8}[A-Za-z]$", dni);
    }
}