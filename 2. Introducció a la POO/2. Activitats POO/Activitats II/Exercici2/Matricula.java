package POO.Activitats2.Exercici2;

public class Matricula {
    private double nota;
    private Alumne alumne;
    private Modul modul;

    public Matricula(double nota, Alumne alumne, Modul modul) {
        this.nota = nota;
        this.alumne = alumne;
        this.modul = modul;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public Alumne getAlumne() {
        return alumne;
    }

    public void setAlumne(Alumne alumne) {
        this.alumne = alumne;
    }

    public Modul getModul() {
        return modul;
    }

    public void setModul(Modul modul) {
        this.modul = modul;
    }

    @Override
    public String toString() {
        return "Matricula{" +
                "nota=" + nota +
                ", alumne=" + alumne +
                ", modul=" + modul +
                '}';
    }
}
