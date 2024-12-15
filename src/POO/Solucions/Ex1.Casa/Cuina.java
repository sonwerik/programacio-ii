package POO.Solucions.Ex1.Casa;

// Classe Cuina
public class Cuina {
	private boolean esIndependent;
	private int nombreDeFogons;

	// Constructor amb valors per defecte
	public Cuina() {
		this.esIndependent = false;
		this.nombreDeFogons = 0;
	}

	// Constructor amb par�metres opcionals
	public Cuina(boolean esIndependent, int nombreDeFogons) {
		this.esIndependent = esIndependent;
		this.nombreDeFogons = nombreDeFogons;
	}

	public boolean isEsIndependent() {
		return esIndependent;
	}

	public void setEsIndependent(boolean esIndependent) {
		this.esIndependent = esIndependent;
	}

	public int getNombreDeFogons() {
		return nombreDeFogons;
	}

	public void setNombreDeFogons(int nombreDeFogons) {
		this.nombreDeFogons = nombreDeFogons;
	}

	// M�tode toString per mostrar la informaci� de la cuina
	@Override
	public String toString() {
		return "Cuina{" +
				"esIndependent=" + esIndependent +
				", nombreDeFogons=" + nombreDeFogons +
				'}';
	}
}
