package POO.Activitats2.Exercici3;

import java.util.Scanner;

public class GestorFerris {
    private static Ferri ferri;
    private static Camio camio1;
    private static Camio camio2;
    private static Camio camio3;
    private static Camio camio4;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Ferri ferri = new Ferri("7312RMS", "Hermes", "Atenes", 80, 2500, 0);
        Camio camio1 = new Camio("0123BCD", 10, 1, false);
        Camio camio2 = new Camio("4567FGH", 7, 2, false);
        Camio camio3 = new Camio("8910JKL", 9, 3, false);
        Camio camio4 = new Camio("1112MNP", 8, 4,false);

        boolean continuar = true;
        while (continuar) {
            System.out.println("\n\nGESTIÓ DE TRANSPORTS DE CAMIONS AMB FERRIS\n");
            System.out.println("1. Consulta el pes total del ferri embarcat");
            System.out.println("2. Consulta si un camió ha embarcat");
            System.out.println("3. Consulta si un camió pot embarcar");
            System.out.println("4. Embarca un camió");
            System.out.println("5. Troba un camió sense la matricula");
            System.out.println("6. Consulta l'import del peatge d'un camió");
            System.out.println("7. Consulta el peatge total recaptat");
            System.out.println("0. Sortir del programa");
            System.out.print("\nEsculli una de les opcions anterios: ");

            int numEmbarcat = 0;
            int opcionsFerri = sc.nextInt();
            switch (opcionsFerri) {

                case 1:
                    System.out.println(pesTotalCamionsEmbarcats(camio1, camio2, camio3, camio4));
                    break;
                case 2:
                    System.out.println(camioIsEmbarcat(camio1, camio2, camio3, camio4));
                    break;
                case 3:
                    System.out.println(potEmbarcar(camio1, camio2, camio3, camio4));
                    break;
                case 4:
                    embarcaCamio(numEmbarcat, camio1, camio2, camio3, camio4);
                    break;
                case 5:
                    nEsimaPosicio(numEmbarcat, camio1, camio2, camio3, camio4);
                    break;
                case 6:
                    peatgeCamio(camio1, camio2, camio3, camio4);
                case 7:
                    System.out.println(peatgeTotal(camio1, camio2, camio3, camio4));
                case 0:
                    continuar = false;
                    break;
            }
        }
    }

    public static double pesTotalCamionsEmbarcats(Camio... camions) {
        double pesTotal = 0;
        for (Camio camio : camions) {
            if (camio.isEmbarcat()) {
                pesTotal += camio.getPesCamio();
            }
        }
        return pesTotal;
    }

    public static boolean camioIsEmbarcat(Camio... camions) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introdueix la matricula del camio: ");
        String matricula = sc.next().toUpperCase();
        boolean haEmbarcat = false;
        for (Camio camio : camions) {
            haEmbarcat = matricula.equals(camio.getMatriculaCamio());
        }
        return haEmbarcat;
    }

    public static boolean potEmbarcar(Camio... camions) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introdueix el pes del camio: ");
        double pes = sc.nextDouble();
        return pes + pesTotalCamionsEmbarcats(camions) <= ferri.getPesMaximFerri();
    }

    public static void embarcaCamio(int numEmbarcat, Camio... camions) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introdueix la matricula del camio que vols embarcar: ");
        String matricula = sc.next().toUpperCase();
        for (Camio camio : camions) {
            if (matricula.equals(camio.getMatriculaCamio())) {
                if (!camio.isEmbarcat()) {
                ferri.setCamionsEmbarcats(ferri.getCamionsEmbarcats() + 1);
                camio.setEmbarcat(true);
                numEmbarcat++;
                System.out.println("Camió amb matrícula " + camio.getMatriculaCamio() + " embarcat correctament!");
                break;
                } else {
                    System.out.println("Aquest camio no pot embarcar, perquè ja és al ferri.");
                }
            } else {
                System.out.println("Aquest camio no pot embarcar.");
                break;
            }
        }
    }

    public static void nEsimaPosicio(int numEmbarcat, Camio... camions) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introdueix la posició del camió: ");
        int posicio = sc.nextInt();
        for (Camio camio : camions) {
            if (camio.isEmbarcat() && posicio == numEmbarcat) {
                System.out.println(camio.getMatriculaCamio());
                break;
            }
        }
    }

    public static void peatgeCamio(Camio... camions) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introdueix la matricula del camio: ");
        for (Camio camio : camions) {
            if (camio.isEmbarcat()) {
                double pes = camio.getPesCamio();
                double cost = pes * ferri.getPreuPerTona();
                System.out.println(cost);
                break;
            }
        }
    }

    public static double peatgeTotal(Camio... camions) {
        double total = 0.0;
        for (Camio camio : camions) {
            double pes = camio.getPesCamio();
            double cost = pes * ferri.getPreuPerTona();
            total += cost;
        }
        return total;
    }
}