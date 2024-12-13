package POO.Activitats2.Exercici7;

import java.util.ArrayList;

public class Habitacio {
    private int numeroHabitacio;
    private String tipus;
    private ArrayList<Servei> serveis;
    
    public Habitacio(int num, String tipus, ArrayList<Servei> serveis) {
        this.numeroHabitacio = num;
        this.tipus = tipus;
        this.serveis = serveis;
    }
    
    public Habitacio() {
        this.numeroHabitacio = 0;
        this.tipus = "";
        this.serveis = new ArrayList<>();
    }
    
    public int getNumeroHabitacio() {
        return numeroHabitacio;
    }
    
    public void setNumeroHabitacio(int numeroHabitacio) {
        this.numeroHabitacio = numeroHabitacio;
    }
    
    public String getTipus() {
        return tipus;
    }
    
    public void setTipus(String tipus) {
        this.tipus = tipus;
    }
    
    public ArrayList<Servei> getServeis() {
        return serveis;
    }
    
    public void setServeis(ArrayList<Servei> serveis) {
        this.serveis = serveis;
    }
    
    @Override
    public String toString() {
        return "Habitacio{" +
                "num=" + numeroHabitacio +
                ", tipus='" + tipus + '\'' +
                ", serveis=" + serveis +
                '}';
    }
    
}