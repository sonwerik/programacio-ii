import java.util.Scanner;

public class pt9Semafor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String rol = sc.next();

        String semaforTranvies = sc.next();
        String semaforVianants = sc.next();
        String semaforCotxes = sc.next();

        boolean passTranvies = semaforTranvies.equals("GO");
        boolean passVianants = semaforVianants.equals("VERD");
        boolean passCotxes = semaforCotxes.equals("VERD");

        boolean pass = false;
        boolean colisio = false;

        switch (rol) {
            case "TRANVIA":
                pass = passTranvies;
                colisio = passTranvies && (passVianants || passCotxes);
                break;
            case "VIANANT":
                pass = passVianants;
                colisio = passVianants && (passTranvies || passCotxes);
                break;
            case "COTXE":
                pass = passCotxes;
                colisio = passCotxes && (passTranvies || passVianants);
                break;
        }
        if (colisio) System.out.println("POSSIBLE COLISIO");
        else if (pass) System.out.println("ENDAVANT");
        else System.out.println("PARAR");
    }
}