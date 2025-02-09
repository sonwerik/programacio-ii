package POO.Activitats2.Solucions.Ex2.Institut.institut;

public class Modul {
	
	private final String nomModul;

	public Modul(String nomModul){
		this.nomModul = nomModul;
	}
	
	public String getNomModul(){
		return this.nomModul;
	}

	@Override
	public String toString() {
		return "Modul{" +
				"nomModul='" + nomModul + '\'' +
				'}';
	}
}


