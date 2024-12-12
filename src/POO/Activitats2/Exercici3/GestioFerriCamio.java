package POO.Activitats2.Exercici3;

import java.sql.SQLOutput;
import java.util.Scanner;

public class GestioFerriCamio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Ferri ferri1 = new Ferri();
        ferri1.setNumFerri(1);
        ferri1.setMatriculaFerri("7312RMS");
        ferri1.setNomFerri("Hermes");
        ferri1.setPortDesti("Atenes");
        ferri1.setPreuPerTona(80);
        ferri1.setPesMaximFerri(2500);
        ferri1.setCamionsEmbarcats(0);

        Ferri ferri2 = new Ferri();
        ferri2.setNumFerri(2);
        ferri2.setMatriculaFerri("1237HST");
        ferri2.setNomFerri("Hestia");
        ferri2.setPortDesti("Limenas");
        ferri2.setPreuPerTona(60);
        ferri2.setPesMaximFerri(1700);
        ferri2.setCamionsEmbarcats(0);

        Ferri ferri3 = new Ferri();
        ferri3.setNumFerri(3);
        ferri3.setMatriculaFerri("1227FXY");
        ferri3.setNomFerri("Foxy");
        ferri3.setPortDesti("Viborg");
        ferri3.setPreuPerTona(70);
        ferri3.setPesMaximFerri(2300);
        ferri3.setCamionsEmbarcats(0);

        Ferri ferri4 = new Ferri();
        ferri4.setNumFerri(4);

        Camio camio1 = new Camio();
        camio1.setNumCamio(1);
        camio1.setMatriculaCamio("1234XYZ");
        camio1.setPesCamio(1300);

        Camio camio2 = new Camio();
        camio2.setNumCamio(2);
        camio2.setMatriculaCamio("1234BCD");
        camio2.setPesCamio(1500);

        Camio camio3 = new Camio();
        camio3.setNumCamio(3);
        camio3.setMatriculaCamio("1234FGH");
        camio3.setPesCamio(10);

        Camio camio4 = new Camio();
        camio4.setNumCamio(4);

        int ferriTriat = 0;
        int camioTriat = 0;
        double pesTotalFerri = 0;
        boolean camioHaEmbarcat = false;
        boolean embarcat = false;
        boolean continuarMenuPort = true;
        while (continuarMenuPort) {

            System.out.println("\nBENVINGUT AL PORT\n");
            System.out.println("1. Tria ferris predeterminats");
            System.out.println("2. Crear un nou ferri");
            System.out.println("0. Sortir del programa");
            System.out.print("\nEsculli una de les opcions anterios: ");

            int escollirFerri = sc.nextInt();
            switch (escollirFerri) {

                case 1:
                    System.out.println("\nFerris predeterminats:" + ferri1 + ferri2 + ferri3);
                    System.out.print("\nSi us plau trii un ferri: ");
                    ferriTriat = sc.nextInt();
                    break;

                case 2:
                    sc.nextLine();
                    System.out.println("\nGenerant matricula...");
                    ferri4.setMatriculaFerri(generarMatricula());
                    System.out.println("Se ha atribuït la matricula “" + ferri4.getMatriculaFerri() + "”.");
                    System.out.print("Trii el nom del ferri: ");
                    ferri4.setNomFerri(sc.nextLine());
                    boolean continuarValidacioCiutat = true;
                    while (continuarValidacioCiutat) {
                        System.out.print("Trii el port de desti (Londres, Copenhagen, Buenos Aires, Sicilia, Atenes, Limenes, Viborg): ");
                        String ciutatDesti = sc.nextLine().toUpperCase();
                        if (validarCiutatDesti(ciutatDesti)) {
                            ferri4.setPortDesti(ciutatDesti);
                            continuarValidacioCiutat = false;
                        } else {
                            System.out.println("Si us plau, trii una ciutat vàlida.");
                        }
                    }
                    boolean continuarValidacioPreu = true;
                    while (continuarValidacioPreu) {
                        System.out.print("Trii el preu que vols cobrar per Tm (50 - 80): ");
                        double preuTm = sc.nextDouble();
                        if (validarPreuPerTona(preuTm)) {
                            ferri4.setPreuPerTona(preuTm);
                            continuarValidacioPreu = false;
                        } else {
                            System.out.println("Si us plau, trii un pes vàlid.");
                        }
                    }
                    boolean continuarValidacioCarrega = true;
                    while (continuarValidacioCarrega) {
                        System.out.print("Trii la càrrega màxima útil que pot soportar el ferri en Tm (1500 - 3000): ");
                        int carregaMaxima = sc.nextInt();
                        if (validarPesFerri(carregaMaxima)) {
                            ferri4.setPesMaximFerri(carregaMaxima);
                            continuarValidacioCarrega = false;
                        } else {
                            System.out.println("Si us plau, trii una càrrega vàlida.");
                        }
                    }
                    System.out.println("De moment no tens camions embarcats.");
                    System.out.println("\nFerri creat!");
                    System.out.println(ferri4);
                    break;

                case 3:
                    System.out.println("Sortint del programa...");
                    System.exit(0);

                default:
                    System.out.println("Introdueixi una opció vàlida.");
                    break;
            }

            boolean continuarMenuTransports = true;
            while (continuarMenuTransports) {
                System.out.println("\n\nGESTIÓ DE TRANSPORTS DE CAMIONS AMB FERRIS\n");
                System.out.println("1. Consulta el pes total del ferri embarcat");
                System.out.println("2. Gestiona els camions");
                System.out.println("3. Consulta si un camió ha embarcat");
                System.out.println("4. Consulta si un camió pot embarcar");
                System.out.println("5. Embarca un camió");
                System.out.println("6. Troba un camió sense la matricula");
                System.out.println("7. Consulta l'import del peatge d'un camió");
                System.out.println("8. Consulta el peatge total recaptat");
                System.out.println("9. Tornar al menu principal");
                System.out.println("0. Sortir del programa");
                System.out.print("\nEsculli una de les opcions anterios: ");

                int opcionsFerri = sc.nextInt();
                switch (opcionsFerri) {

                    case 1:
                        System.out.println("Pes total del ferri embarcat: " + ferri1.getCamionsEmbarcats() + "Tm.");
                        break;

                    case 2:
                        boolean continuarMenuCamions = true;
                        while (continuarMenuCamions) {
                            System.out.println("\nGESTIÓ DE CAMIONS\n");
                            System.out.println("1. Tria camions predeterminats");
                            System.out.println("2. Crear un nou camio");
                            System.out.println("3. Tornar a la gestió de ferris");
                            System.out.println("0. Sortir del programa");
                            System.out.print("\nEsculli una de les opcions anterios: ");

                            int opcionsCamio = sc.nextInt();
                            switch (opcionsCamio) {

                                case 1:
                                    boolean continuarMenuCamionsATriar = true;
                                    while (continuarMenuCamionsATriar) {
                                        System.out.println("\nCamions predeterminats:" + camio1 + camio2 + camio3);
                                        System.out.print("Trii un camio: ");
                                        camioTriat = sc.nextInt();
                                        if (camioTriat >= 1 && camioTriat <= 3) {
                                            continuarMenuCamionsATriar = false;
                                        } else {
                                            System.out.println("Si us plau, trii un camió vàlid");
                                        }
                                    }
                                    break;

                                case 2:
                                    sc.nextLine();
                                    System.out.println("\nGenerant matricula...");
                                    camio4.setMatriculaCamio(generarMatricula());
                                    System.out.println("Se ha atribuït la matricula “" + camio4.getMatriculaCamio() + "”.");
                                    boolean continuarValidacioPesCamio = true;
                                    while (continuarValidacioPesCamio) {
                                        System.out.print("Trii el pes del camió en Tm (7 - 10): ");
                                        double pesCamio = sc.nextDouble();
                                        if (validarPesCamio(pesCamio)) {
                                            camio4.setPesCamio(pesCamio);
                                        } else {
                                            System.out.println("Si us plau, trii un pes vàlid.");
                                        }
                                        camioTriat = 4;
                                        System.out.println("Camió creat!");
                                        System.out.println(camio4);
                                        continuarValidacioPesCamio = false;
                                    }
                                    break;

                                case 3:
                                    System.out.println("Tornant enrrere...");
                                    continuarMenuCamions = false;
                                    break;

                                case 0:
                                    System.out.println("\nSortint del programa...");
                                    System.exit(0);

                                default:
                                    System.out.println("Si us plau, escull una opció vàlida.");
                            }

                            System.out.println(" ");

                        }
                        break;

                    case 3:
                        System.out.print("Introdueixi la matriucla del camió: ");
                        String cercaCamioEmbarcat = sc.next();
                        if (cercaCamioEmbarcat.equals(camio1.getMatriculaCamio()) && embarcat || cercaCamioEmbarcat.equals(camio2.getMatriculaCamio()) && embarcat || cercaCamioEmbarcat.equals(camio3.getMatriculaCamio()) && embarcat || cercaCamioEmbarcat.equals(camio4.getMatriculaCamio()) && embarcat) {
                            camioHaEmbarcat = true;
                        }
                        System.out.println(camioHaEmbarcat);
                        break;

                    case 4:

                    case 5:
                        boolean continuarMenuEmbarcarCamions = true;
                        while (continuarMenuEmbarcarCamions) {
                            System.out.println("\nEMBARCAMENT DE CAMIONS\n");
                            System.out.print("Quin camio vols embarcar al ferri " + ferri1.getNomFerri() + "? ");
                            String camioAEmbarcar = sc.next();
                            if (ferriTriat == 1) {
                                if (camioTriat == 1) {
                                    ferri1.setCamionsEmbarcats(ferri1.getCamionsEmbarcats() + 1);
                                    pesTotalFerri += camio1.getPesCamio();
                                    System.out.println("Camio embarcat correctament!");
                                    embarcat = true;
                                    continuarMenuEmbarcarCamions = false;

                                } else if (camioTriat == 2) {
                                    ferri1.setCamionsEmbarcats(ferri1.getCamionsEmbarcats() + 1);
                                    pesTotalFerri += camio2.getPesCamio();
                                    System.out.println("Camio embarcat correctament!");
                                    embarcat = true;
                                    continuarMenuEmbarcarCamions = false;

                                } else if (camioTriat == 3) {
                                    ferri1.setCamionsEmbarcats(ferri1.getCamionsEmbarcats() + 1);
                                    pesTotalFerri += camio3.getPesCamio();
                                    System.out.println("Camio embarcat correctament!");
                                    embarcat = true;
                                    continuarMenuEmbarcarCamions = false;

                                } else if (camioTriat == 4) {
                                    ferri1.setCamionsEmbarcats(ferri1.getCamionsEmbarcats() + 1);
                                    pesTotalFerri += camio4.getPesCamio();
                                    System.out.println("Camio embarcat correctament!");
                                    embarcat = true;
                                    continuarMenuEmbarcarCamions = false;
                                } else {
                                System.out.println("No pots embarcar aquest camio.");
                                }
                                }
                            break;
                        }
                    case 6:

                    case 7:

                    case 8:

                    case 9:

                    case 0:
                        System.out.println("\nSortint del programa...");
                        continuarMenuTransports = false;
                        System.exit(0);

                    default:
                        System.out.println("Si us plau, escull una opció vàlida.");
                }
            }
        }
    }

    public static String generarMatricula() {
        String nombresMatricula = "0123456789";
        String lletresMatricula = "BCDFGHJKLMNPQRSTVWXYZ";
        String matricula = "";

        for (int i = 0; i < 4; i++) {
            int j = (int) (Math.random() * nombresMatricula.length());
            matricula += (nombresMatricula.charAt(j));
        }

        for (int i = 0; i < 3; i++) {
            int j = (int) (Math.random() * lletresMatricula.length());
            matricula += (lletresMatricula.charAt(j));
        }

        return matricula;
    }

    public static boolean validarCiutatDesti(String ciutatDesti) {
        String[] ciutatsValides = {"LONDRES", "COPENHAGEN", "BUENOS AIRES", "SICILIA", "ANTENES", "LIMENES", "VIBORG"};
        for (String ciutatValida : ciutatsValides) {
            if (ciutatValida.equals(ciutatDesti)) {
                return true;
            }
        }
        return false;
    }

    public static boolean validarPesFerri(int pesFerri) {
        return pesFerri >= 1500 && pesFerri <= 3000;
    }

    public static boolean validarPreuPerTona(double preuPerTona) {
        return preuPerTona >= 50 && preuPerTona <= 80;
    }

    public static boolean validarPesCamio(double pesCamio) {
        return pesCamio >= 7 && pesCamio <= 10;
    }
}