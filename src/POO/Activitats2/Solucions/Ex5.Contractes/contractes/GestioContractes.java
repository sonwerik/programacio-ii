package POO.Activitats2.Solucions.Ex5.Contractes.contractes;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Scanner;

public class GestioContractes {

    public static void main(String[] ignoredArgs) {
        GestioContractes gc = new GestioContractes();
        Scanner sc = new Scanner(System.in);
        System.out.println("Benvingut al gestor de contractes, introdueix les dades per la persona");
        Persona p = gc.dadesPersona();
        gc.menu();
        int opcio = sc.nextInt();
        while(opcio!=0){
            switch(opcio){
                case 1:
                    Empresa empresa = gc.dadesEmpresa();
                    sc.nextLine();
                    System.out.println("Introdueix el codi del contracte");
                    String codi = sc.nextLine();
                    System.out.println("Introdueix data inici contracte");
                    Date dataInici = gc.demanarData();
                    System.out.println("Introdueix data finalitzacio contracte");
                    Date dataFi = gc.demanarData();
                    Contracte contracte = new Contracte(codi, dataInici, dataFi, empresa);
                    p.afegeixContracte(contracte);
                    break;
                case 2:
                    System.out.println("Escull contracte");
                    gc.mostraContractes(p);
                    int index = sc.nextInt();
                    contracte = p.getContractes().get(index);
                    long dies = gc.numDiesContracte(contracte);
                    System.out.println("La diferencia en dies d'aquest contracte es:" +  dies);
                    break;
                case 3:
                    dies = gc.numDiesTotsContractes(p.getContractes());
                    System.out.println("Els dies totals de tots els contracte son: " + dies);
                    break;
                case 4:
                    gc.llistarEmpreses(p);
                    break;
                default:
                    System.out.println("Torna a introduir un nombre");

            }
            gc.menu();
            opcio = sc.nextInt();
        }

    }

    public void menu(){
        System.out.println("--------GESTOR DE CONTRACTES----------------");
        System.out.println("0) Sortir");
        System.out.println("1) Signar un contracte per una empresa. ");
        System.out.println("2) Determinar la durada d'un contracte en dies.");
        System.out.println("3) Determinar la suma total de les durades dels contractes en dies. ");
        System.out.println("4) Determinar en quantes empreses diferents ha treballat.");

    }

    public Persona dadesPersona(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introdueix el DNI de la persona");
        String dni = sc.nextLine();
        System.out.println("Introdueix el nom de la persona");
        String nom = sc.nextLine();
        return new Persona(dni,nom);
    }

    public Empresa dadesEmpresa(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introdueix el cif de l'empresa");
        String cif = sc.nextLine();
        System.out.println("Introdueix el nom de l'empresa");
        String nom = sc.nextLine();
        System.out.println("Introdueix el sector economic de l'empresa");
        String sector = sc.nextLine();
        return new Empresa(cif,nom,sector);
    }

    public Date demanarData(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introdueix el dia");
        int dia = sc.nextInt();
        System.out.println("Introdueix el mes");
        int mes = sc.nextInt();
        System.out.println("Introdueix l'any");
        int any = sc.nextInt();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String dateInString = any+"-"+mes+"-"+dia;
        Date data = null;
        try {
            data = sdf.parse(dateInString);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        return data;
    }

    private void llistarEmpreses(Persona p){
        HashSet<String> empreses = new HashSet<>();
        for(Contracte contracte: p.getContractes()){
            empreses.add(contracte.getEmpresa().getNom());
        }

        for(String empresa: empreses){
            System.out.println(empresa);
        }
    }

    private void mostraContractes(Persona p){
        int i=0;
        for(Contracte contracte: p.getContractes()){
            System.out.println(i+") "+contracte);
            i++;
        }
    }

    private long numDiesContracte(Contracte contracte){
        long diferencia = contracte.getFiContracte().getTime() - contracte.getIniciContracte().getTime();
        return diferencia / (3600*24*1000);
    }

    private long numDiesTotsContractes(ArrayList<Contracte> contractes){
        int dies = 0;
        for(Contracte contracte: contractes) dies += (int) this.numDiesContracte(contracte);
        return dies;
    }

}
