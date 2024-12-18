package POO.Activitats2.Solucions.Ex3.Ferri.ferri;

public class Camio {

	private String matricula;
	private final int pes;
	
	public Camio(String matricula, int pes)
    {
		this.matricula = matricula;
		this.pes = pes;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public int getPes() {
		return pes;
	}

	@Override
	public String toString() {
		return "Camio{" +
				"matricula='" + matricula + '\'' +
				", pes=" + pes +
				'}';
	}
}
