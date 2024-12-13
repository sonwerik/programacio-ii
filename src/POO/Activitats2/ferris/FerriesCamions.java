package POO.Activitats2.ferris;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Classe Camio: Representació d'un camió
class camio {
    private String matricula;
    private double pes;

    public camio(String matricula, double pes) {
        this.matricula = matricula;
        this.pes = pes;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double getPes() {
        return pes;
    }

    public void setPes(double pes) {
        this.pes = pes;
    }

    @Override
    public String toString() {
        return "Camió [Matrícula: " + matricula + ", Pes: " + pes + " Tm]";
    }
}

// Classe Ferry: Representació d'un ferry
class Ferry {
    private String matricula;
    private String nom;
    private String portDesti;
    private double preuPerTm;
    private double pesMaxim;
    private List<camio> camionsEmbarcats;

    public Ferry(String matricula, String nom, String portDesti, double preuPerTm, double pesMaxim) {
        this.matricula = matricula;
        this.nom = nom;
        this.portDesti = portDesti;
        this.preuPerTm = preuPerTm;
        this.pesMaxim = pesMaxim;
        this.camionsEmbarcats = new ArrayList<>();
    }

    public String getMatricula() {
        return matricula;
    }

    public String getNom() {
        return nom;
    }

    public List<camio> getCamionsEmbarcats() {
        return camionsEmbarcats;
    }

    public double getPesMaxim() {
        return pesMaxim;
    }

    public double getPreuPerTm() {
        return preuPerTm;
    }

    public void embarcarCamio(camio camio) {
        camionsEmbarcats.add(camio);
    }

    public double calcularPesTotal() {
        return camionsEmbarcats.stream().mapToDouble(camio::getPes).sum();
    }

    public boolean estaCamioEmbarcat(String matricula) {
        return camionsEmbarcats.stream().anyMatch(camio -> camio.getMatricula().equals(matricula));
    }

    public boolean potEmbarcarCamio(camio camio) {
        return calcularPesTotal() + camio.getPes() <= pesMaxim;
    }

    @Override
    public String toString() {
        return "Ferry [Matrícula: " + matricula + ", Nom: " + nom + ", Port destí: " + portDesti + "]";
    }
}

// Classe GestorFerryCamio: Gestiona el menú i tota la lògica de l'aplicació
class GestorFerryCamio {
    private static final Scanner sc = new Scanner(System.in);
    private static final String MENU_GESTIO_FERRIS =
            "\n\nGESTIÓ DE TRANSPORTS DE CAMIONS AMB FERRIS\n" +
                    "1. Consulta el pes total del ferri embarcat\n" +
                    "2. Gestiona els camions\n" +
                    "3. Consulta si un camió ha embarcat\n" +
                    "4. Consulta si un camió pot embarcar\n" +
                    "5. Embarca un camió\n" +
                    "6. Consulta el camió a la n-èsima posició\n" +
                    "7. Consulta l'import del peatge d'un camió\n" +
                    "8. Consulta el peatge total recaptat\n" +
                    "0. Sortir del programa";

    private Ferry ferry;

    public GestorFerryCamio(Ferry ferry) {
        this.ferry = ferry;
    }

    public void mostrarMenu() {
        boolean continuar = true;

        while (continuar) {
            System.out.println(MENU_GESTIO_FERRIS);
            System.out.print("Seleccioni una opció: ");
            int opcio = sc.nextInt();

            switch (opcio) {
                case 1:
                    mostrarPesTotal();
                    break;
                case 2:
                    gestionarCamions();
                    break;
                case 3:
                    consultarCamioEmbarcat();
                    break;
                case 4:
                    consultarSiPotEmbarcar();
                    break;
                case 5:
                    embarcarCamio();
                    break;
                case 6:
                    consultarCamioEnPosicio();
                    break;
                case 7:
                    consultarImportPeatge();
                    break;
                case 8:
                    consultarPeatgeTotal();
                    break;
                case 0:
                    continuar = false;
                    System.out.println("Sortint del programa...");
                    break;
                default:
                    System.out.println("Opció no vàlida. Torni a intentar-ho.");
            }
        }
    }

    private void mostrarPesTotal() {
        System.out.println("Pes total dels camions embarcats: " + ferry.calcularPesTotal() + " Tm.");
    }

    private void gestionarCamions() {
        sc.nextLine(); // Neteja buffer
        System.out.print("Introdueixi la matrícula del camió: ");
        String matricula = sc.nextLine();
        System.out.print("Introdueixi el pes del camió (Tm): ");
        double pes = sc.nextDouble();
        camio camio = new camio(matricula, pes);

        if (ferry.potEmbarcarCamio(camio)) {
            ferry.embarcarCamio(camio);
            System.out.println("El camió ha estat embarcat correctament.");
        } else {
            System.out.println("No es pot embarcar el camió. Pes excedit.");
        }
    }

    private void consultarCamioEmbarcat() {
        System.out.print("Introdueixi la matrícula del camió: ");
        String matricula = sc.next();
        boolean embarcat = ferry.estaCamioEmbarcat(matricula);
        System.out.println(embarcat ? "El camió està embarcat." : "El camió no està embarcat.");
    }

    private void consultarSiPotEmbarcar() {
        System.out.print("Introdueixi el pes del camió (Tm): ");
        double pes = sc.nextDouble();
        boolean potEmbarcar = ferry.getPesMaxim() >= (ferry.calcularPesTotal() + pes);
        System.out.println(potEmbarcar ? "El camió pot embarcar." : "El camió no pot embarcar.");
    }

    private void embarcarCamio() {
        System.out.print("Introdueixi la matrícula del camió a embarcar: ");
        String matricula = sc.next();
        for (POO.Activitats2.ferris.camio camio : ferry.getCamionsEmbarcats()) {
            if (camio.getMatricula().equals(matricula)) {
                System.out.println("El camió ja està embarcat.");
                return;
            }
        }
        gestionarCamions();
    }

    private void consultarCamioEnPosicio() {
        System.out.print("Introdueixi la posició del camió (1-indexada): ");
        int posicio = sc.nextInt();
        if (posicio > 0 && posicio <= ferry.getCamionsEmbarcats().size()) {
            camio camio = ferry.getCamionsEmbarcats().get(posicio - 1);
            System.out.println("Camió a la posició " + posicio + ": " + camio);
        } else {
            System.out.println("Posició no vàlida.");
        }
    }

    private void consultarImportPeatge() {
        System.out.print("Introdueixi la matrícula del camió: ");
        String matricula = sc.next();
        for (POO.Activitats2.ferris.camio camio : ferry.getCamionsEmbarcats()) {
            if (camio.getMatricula().equals(matricula)) {
                double importPeatge = camio.getPes() * ferry.getPreuPerTm();
                System.out.println("Import del peatge: " + importPeatge + " €.");
                return;
            }
        }
        System.out.println("Aquest camió no està embarcat.");
    }

    private void consultarPeatgeTotal() {
        double peatgeTotal = ferry.getCamionsEmbarcats().stream()
                .mapToDouble(camio -> camio.getPes() * ferry.getPreuPerTm())
                .sum();
        System.out.println("Peatge total recaptat: " + peatgeTotal + " €.");
    }
}

// Classe principal
public class FerriesCamions {
    public static void main(String[] args) {
        Ferry ferry = new Ferry("ABC123", "Ferry1", "Port B", 50.0, 100.0);
        GestorFerryCamio gestor = new GestorFerryCamio(ferry);
        gestor.mostrarMenu();
    }
}