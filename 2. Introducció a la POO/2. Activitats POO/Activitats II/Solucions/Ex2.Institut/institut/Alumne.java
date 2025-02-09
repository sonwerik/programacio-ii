package POO.Activitats2.Solucions.Ex2.Institut.institut;

public class Alumne {

	private String nom;
	private final String cognoms;
	private int edat;
	private String dni;

	public Alumne(String nom, String cognoms, int edat, String dni){
		this.nom = nom;
		this.cognoms = cognoms;
		this.edat = edat;
		this.dni = dni;
	}

	public String getNom(){
		return this.nom;
	}

	public int getEdat(){
		return this.edat;
	}

	public String getDni(){
		return this.dni;
	}

	public void setNom(String nom){
		this.nom=nom;
	}

	public void setEdat(int edat){
		this.edat=edat;
	}

	public void setDni(String dni){
		this.dni=dni;
	}


	@Override
	public String toString() {
		return "Alumne{" +
				"nom='" + nom + '\'' +
				", cognoms='" + cognoms + '\'' +
				", edat=" + edat +
				", dni='" + dni + '\'' +
				'}';
	}
}
