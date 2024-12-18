package POO.Activitats2.Solucions.Ex8.Terratremol.terratremol;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class TerratremolManager {

    ArrayList<Terratremol> terratremols;

    public TerratremolManager(){
        terratremols = new ArrayList<>();
    }

    public static void main(String[] ignoredArgs) {
        TerratremolManager tm = new TerratremolManager();
        Scanner sc = new Scanner(System.in);
        System.out.println("Que vols fer?");
        menu();
        int opcio = sc.nextInt();
        while(opcio != 3){
            switch(opcio){
                case 0:{
                    tm.addTerratremol();
                    break;
                }
                case 1:{
                    Terratremol terratremol = tm.escullTerratremol();
                    tm.showVictimesTerratremol(terratremol);
                    break;
                } case 2:{
                    Terratremol terratremol = tm.escullTerratremol();
                    tm.showMagnitudLocalitzacioTerratremol(terratremol);
                    break;
                } default:
                    System.out.println("Introdueix una opcio correcta.");
            }
            menu();
            opcio = sc.nextInt();
        }
    }

    public static void menu(){
        System.out.println("""
            Menu:
            0.Afegir Terratremol
            1.Mostrar victimes terratremol
            2.Mostrar magnitud i localitzacio terratremol
            3.Sortir
            """);
    }

    private void addTerratremol() {
        Scanner in = new Scanner(System.in);

        System.out.println("Introdueix la ciutat on ha aparegut: ");
        String ciutat = in.nextLine();
        System.out.print("La latitud: ");
        double x = in.nextDouble();in.nextLine();
        System.out.print("La longitud: ");
        double y = in.nextDouble();
        Localitzacio localitzacio = new Localitzacio (x,y,ciutat);

        System.out.print("La magnitud de l'escala de Ritcher: ");
        int magnitud = in.nextInt();

        LocalDate avui = LocalDate.now();

        ArrayList<Victima> victimes =  new ArrayList<>();
        System.out.println("Si encara hi ha víctimes escriu un 1, sinó escriu un -1");
        int opcio = in.nextInt();
        while(opcio != -1){
            System.out.println("Introdueix el nom de la victima: ");
            String nom = in.nextLine();
            System.out.print("Introdueix l'edat de la victima: ");
            int edat = in.nextInt();in.nextLine();
            System.out.println("Introdueix l'estat de la victima': ");
            String estat = in.nextLine();

            //Introduim una nova victima a l'ArrayList
            victimes.add(new Victima(nom,edat,estat));

            System.out.println("Si encara hi ha víctimes escriu un 1, sinó escriu un -1");
            opcio = in.nextInt();
        }
        
        //Afegim el terratremol amb totes les seves dades
        terratremols.add(new Terratremol(localitzacio, magnitud, avui, victimes));

    }

    //Retorna un terratremol del llistat
    private Terratremol escullTerratremol() {
        System.out.println("De quin terratremol vols realitzar l'accio?");
        int i = 0;
        for(Terratremol terratremol: terratremols){
            System.out.println(i+"."+terratremol);
            i++;
        }
        Scanner sc = new Scanner(System.in);
        return terratremols.get(sc.nextInt());
    }

    private void showMagnitudLocalitzacioTerratremol(Terratremol terratremol) {
        System.out.println("Magnitud de l'escala de Ritcher: "+ terratremol.getMagnitud()
                           +"\nLocalitzacio: "+ terratremol.getLocalitzacio());
    }

    private void showVictimesTerratremol(Terratremol terratremol) {
        System.out.println("Les victimes son: ");
        for(Victima victima: terratremol.getVictimes())
            System.out.println(victima);
    }
}
