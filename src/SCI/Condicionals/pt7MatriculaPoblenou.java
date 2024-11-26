package SCI.Condicionals;

import java.util.Scanner;

public class pt7MatriculaPoblenou {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int matricula = 440;

        boolean familiaNombrosa = sc.nextBoolean();
        boolean matriculaHonor = sc.nextBoolean();
        boolean monoparentalNormal = sc.nextBoolean();
        boolean monoparentalEspecial = sc.nextBoolean();
        int edat = sc.nextInt();
        boolean cursComplet = sc.nextBoolean();
        int ufsSoltes = sc.nextInt();

        int familiaNombrosaDescompteAplicat = (int) (matricula * 0.5);
        int matriculaHonorDescompteAplicat = matricula - 80;
        int monoparentalNormalDescompteAplicat = (int) (matricula * 0.5);
        int monoparentalEspecialDescompteAplicat = (int) (matricula * 0.2);
        int edatDescompteAplicat = (int) (matricula * 0.1);
        int ufsSoltesPreuFinal = ufsSoltes * 25;

        if (!cursComplet && ufsSoltesPreuFinal < matricula){
            System.out.println(ufsSoltesPreuFinal);
        } else if (edat > 27) {
            System.out.println(edatDescompteAplicat);
        } else if (monoparentalEspecial) {
            System.out.println(monoparentalEspecialDescompteAplicat);
        } else if (monoparentalNormal) {
            System.out.println(monoparentalNormalDescompteAplicat);
        } else if (familiaNombrosa) {
            System.out.println(familiaNombrosaDescompteAplicat);
        } else if (matriculaHonor) {
            System.out.println(matriculaHonorDescompteAplicat);
        } else {
            System.out.println(matricula);
        }
    }
}