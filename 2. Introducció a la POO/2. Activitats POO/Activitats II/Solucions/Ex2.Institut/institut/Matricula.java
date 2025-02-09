package POO.Activitats2.Solucions.Ex2.Institut.institut;

public class Matricula {

	private final Modul modul;
	private final Alumne alumne;
	private final int nota;

	public Matricula(Alumne alumne, Modul modul, int nota){
		this.alumne = alumne;
		this.modul = modul;
		this.nota = nota;
	}
	
	public int getNota(){
		return this.nota;
	}

	public Alumne getAlumne(){
		return this.alumne;
	}

	public Modul getModul(){
		return this.modul;
	}

	@Override
	public String toString() {
		return "Matricula{" +
				"modul=" + modul +
				", alumne=" + alumne +
				", nota=" + nota +
				'}';
	}
}
