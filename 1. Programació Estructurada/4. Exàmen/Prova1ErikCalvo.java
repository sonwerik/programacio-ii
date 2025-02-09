package SCI.Examen;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Exercici 1 - Seqüencial
        int horaInici = sc.nextInt();
        int minutInici = sc.nextInt();
        int segonInici = sc.nextInt();

        int horaTemps = sc.nextInt();
        int minutTemps = sc.nextInt();
        int segonTemps = sc.nextInt();

        int iniciTotalASegons = horaInici * 3600 + minutInici * 60 + segonInici;
        int tempsTotalASegons = horaTemps * 3600 + minutTemps * 60 + segonTemps;

        int horaFinalEnSegons = iniciTotalASegons + tempsTotalASegons;

        int horaFinal = horaFinalEnSegons / 3600;
        horaFinalEnSegons %= 3600;
        int minutFinal = horaFinalEnSegons / 60;
        int segonFinal = horaFinalEnSegons % 60;

        System.out.println(horaFinal + " " + minutFinal + " " + segonFinal);

        System.out.println();
        System.out.println();


        // Exercici 2 - Condicional

        double altura = sc.nextDouble();
        double pes = sc.nextDouble();
        double IMC = pes / (altura * altura);

        if (IMC < 18.5) System.out.println("Pes insuficient");
        else if (IMC >= 18.5 && IMC <= 24.9) System.out.println("Pes normal");
        else if (IMC >= 25 && IMC <= 29.9) System.out.println("Sobrepès");
        else System.out.println("Obesitat");

        System.out.println();
        System.out.println();


        // Exercici 3 - Iteratiu

        int minInformatica = Integer.MAX_VALUE;
        int maxInformatica = Integer.MIN_VALUE;
        int minComercial = Integer.MAX_VALUE;
        int maxComercial = Integer.MIN_VALUE;
        int minAdministratiu = Integer.MAX_VALUE;
        int maxAdministratiu = Integer.MIN_VALUE;

        String empleatMesCobraInformatica = "";
        String empleatMenysCobraInformatica = "";
        String empleatMesCobraComercial = "";
        String empleatMenysCobraComercial = "";
        String empleatMesCobraAdministratiu = "";
        String empleatMenysCobraAdministratiu = "";

        int salariInformatica = 0;
        int salariComercial = 0;
        int salariAdministratiu = 0;

        int empleatsInformatica = 0;
        int empleatsComercial = 0;
        int empleatsAdminsitratiu  = 0;

        for (int i = 10; i > 0; i--) {
            String nom = sc.next();
            String departament = sc.next().toLowerCase();
            int salari = sc.nextInt();

            if (departament.equals("informatica")) {
                salariInformatica += salari;
                empleatsInformatica++;
                if (salari < minInformatica) {
                    minInformatica = salari;
                    empleatMesCobraInformatica = nom;
                }
                if (salari > maxInformatica) {
                    maxInformatica = salari;
                    empleatMenysCobraInformatica = nom;
                }
            }
            if (departament.equals("comercial")) {
                salariComercial += salari;
                empleatsComercial++;
                if (salari < minComercial) {
                    minComercial = salari;
                    empleatMesCobraComercial = nom;
                }
                if (salari > maxComercial) {
                    maxComercial = salari;
                    empleatMenysCobraComercial = nom;
                }
            }
            if (departament.equals("administratiu")) {
                salariAdministratiu += salari;
                empleatsAdminsitratiu++;
                if (salari < minAdministratiu) {
                    minAdministratiu = salari;
                    empleatMesCobraAdministratiu = nom;
                }
                if (salari > maxAdministratiu) {
                    maxAdministratiu = salari;
                    empleatMenysCobraAdministratiu = nom;
                }
            }
        }

        int salariAnualInformatica = salariInformatica * 14;
        int salariAnualComercial = salariComercial * 14;
        int salariAnualAdministratiu = salariAdministratiu * 14;

        System.out.println("\nSalari anual total departament d'informatica: " + salariAnualInformatica);
        System.out.println("Salari anual total departament comercial: " + salariAnualComercial);
        System.out.println("Salari anual total departament administratiu: " + salariAnualAdministratiu);

        System.out.println("\nMajor sou al departament d'informatica: " + empleatMenysCobraInformatica + " - " +  maxInformatica + "€ al mes");
        System.out.println("Menor sou al departament d'informatica: " + empleatMesCobraInformatica + " - " +  minInformatica + "€ al mes");
        System.out.println("Major sou al departament comercial: " + empleatMenysCobraComercial + " - " +  maxComercial + "€ al mes");
        System.out.println("Menor sou al departament comercial: " + empleatMesCobraComercial + " - " +  minComercial + "€ al mes");
        System.out.println("Major sou al departament administratiu: " + empleatMenysCobraAdministratiu + " - " +  maxAdministratiu + "€ al mes");
        System.out.println("Menor sou al departament administratiu: " + empleatMesCobraAdministratiu + " - " +  minAdministratiu + "€ al mes");

        float mitjanaSalariInformatica = ((float) salariAnualInformatica / empleatsInformatica);
        System.out.println("\nSalari mig anual al departament d'informatica: " + mitjanaSalariInformatica);
        float mitjanaSalariComercial = ((float) salariAnualComercial / empleatsComercial);
        System.out.println("Salari mig anual al departament comercial " + mitjanaSalariComercial);
        float mitjanaSalariAdministratiu = ((float) salariAnualAdministratiu / empleatsAdminsitratiu);
        System.out.println("Salari mig anual al deparatament administratiu " + mitjanaSalariAdministratiu);
        float mitjanaSalariEmpresa = (float) (salariAnualInformatica + salariAnualComercial + salariAnualAdministratiu) / 10;
        System.out.println("Salari mig anual total: " + mitjanaSalariEmpresa);
    }
}
