package POO.Activitats2.Solucions.Ex2.Institut.institut;

import java.util.*;

public class TestMatricula 
{
    static final short NUM_ALUMNES = 2;
    static final short NUM_MODULS = 3;

	ArrayList<Alumne> alumnes;
	ArrayList<Modul> moduls;
	ArrayList<Matricula> matricules;

	public TestMatricula() {
		alumnes = new ArrayList<>();
		moduls = new ArrayList<>();
		matricules = new ArrayList<>();
	}
	
	public void introduirAlumnes(Scanner in){
		System.out.println("Introduim Alumnes");
		System.out.println("-----------------");
		for(int i=0; i<NUM_ALUMNES; i++){
			System.out.print("\nNom de l'alumne "+i+" : ");
			String nom = in.nextLine();
			System.out.print("Cognoms de l'alumne "+i+" : ");
			String cognoms = in.nextLine();
			System.out.print("Edat de l'alumne "+i+" : ");
			int edat = in.nextInt();
            in.nextLine(); // Netejem el salt de línia
			System.out.print("Dni de l'alumne "+i+" : ");
			String dni = in.nextLine();
			alumnes.add(new Alumne(nom, cognoms, edat, dni));
		}
	}
	
	public void introduirModuls(Scanner in){
		System.out.println("\nIntroduim Moduls");
		System.out.println("----------------");
		for(int i=0; i<NUM_MODULS; i++){
			System.out.print("Nom del modul "+i+" : ");
			moduls.add(new Modul(in.nextLine()));
		}
	}

	public void introduirMatricules(){
		System.out.println("\nOmplim totes les matricules amb notes aleatories");
		System.out.println("-----------------------------------------------");
		Random rand = new Random();
		for(Alumne alumne : alumnes){
			for(Modul modul : moduls){
				matricules.add(new Matricula(alumne, modul, rand.nextInt(11)));
			}
		}
	}
	
	public void mostrarMatricules(){
		System.out.println("\nNotes");
		System.out.println("------");
		
		for(Matricula matricula : matricules){
			System.out.print(matricula.getAlumne().getDni()+": ");
			System.out.print(matricula.getModul().getNomModul()+"->");
			System.out.print(matricula.getNota()+"   ");
			System.out.println();
		}
	}
	
	public void extreureNotesMitjana(Scanner in){
		System.out.println("\nDona el Dni de l'alumne del qual vols saber la mitjana");
		System.out.println("------------------------------------------------------");
		String dni = in.nextLine();
		int total=0;
		for(Matricula matricula : matricules){
			if(matricula.getAlumne().getDni().equals(dni))
				total = total + matricula.getNota();

		}
		System.out.println("La nota mitjana de l'alumne amb DNI: "+dni+" es "+total/moduls.size());
	}
	
	public void extreuModulsSuspesos(Scanner in){
		System.out.println("\nDona el Dni de l'alumne del qual vols saber els mòduuls suspesos");
		System.out.println("----------------------------------------------------------------");
		String dni = in.nextLine();
		boolean totAprovat=true;
		for(Matricula matricula : matricules){
			if(matricula.getAlumne().getDni().equals(dni)){
				if(matricula.getNota()<5){
					System.out.println("L'alumne ha suspes el modul "+matricula.getModul().getNomModul());
					totAprovat=false;
				}
			}
		}
		if(totAprovat)System.out.println("L'alumne no ha suspes cap modul");
	}
	
	public static void main(String[] ignoredArgs){
		Scanner in = new Scanner (System.in);
		TestMatricula tm = new TestMatricula();
		tm.introduirAlumnes(in);
		tm.introduirModuls(in);
		tm.introduirMatricules();
		tm.mostrarMatricules();
		tm.extreureNotesMitjana(in);
		tm.extreuModulsSuspesos(in);
	}
}
