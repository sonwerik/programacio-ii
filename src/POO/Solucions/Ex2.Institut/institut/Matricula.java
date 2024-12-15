package POO.Solucions.Ex2.Institut.institut;

public class Matricula {

	private Modul modul;
	private Alumne alumne;
	private int nota;
	
	public Matricula(){
		this.alumne = null;
		this.modul = null;
	}

	public Matricula(Alumne alumne, Modul modul){
		this.alumne = alumne;
		this.modul = modul;
	}
	
	public Matricula(Alumne alumne, Modul modul, int nota){
		this.alumne = alumne;
		this.modul = modul;
		this.nota = nota;
	}
	
	public int getNota(){
		return this.nota;
	}
	
	public void setNota(int nota){
		this.nota = nota;
	}
	
	public Alumne getAlumne(){
		return this.alumne;
	}
	
	public void setAlumne(Alumne alumne){
		this.alumne = alumne;
	}
	
	public Modul getModul(){
		return this.modul;
	}
	
	public void setModul(Modul modul){
		this.modul = modul;
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
