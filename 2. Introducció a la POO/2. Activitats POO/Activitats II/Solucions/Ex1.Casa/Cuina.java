package POO.Activitats2.Solucions.Ex1.Casa;

// Classe Cuina
public class Cuina {
	private final boolean esIndependent;
	private final int nombreDeFogons;

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

	// M�tode toString per mostrar la informaci� de la cuina
	@Override
	public String toString() {
		return "Cuina{" +
				"esIndependent=" + esIndependent +
				", nombreDeFogons=" + nombreDeFogons +
				'}';
	}
}
