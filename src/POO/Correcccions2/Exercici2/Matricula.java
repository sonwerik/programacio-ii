package POO.Correcccions2.Exercici2;

class Matricula {
    private Alumne alumne;
    private Modul modul;
    private double nota;

    public Matricula(Alumne alumne, Modul modul, double nota) {
        this.alumne = alumne;
        this.modul = modul;
        this.nota = nota;
    }

    public Alumne getAlumne() {
        return alumne;
    }

    public Modul getModul() {
        return modul;
    }

    public double getNota() {
        return nota;
    }

    @Override
    public String toString() {
        return "Matricula{" +
                "alumne=" + alumne +
                ", modul=" + modul +
                ", nota=" + nota +
                '}';
    }
}