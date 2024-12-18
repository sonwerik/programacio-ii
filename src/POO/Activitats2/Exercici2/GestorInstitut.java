package POO.Activitats2.Exercici2;

import java.util.ArrayList;

public class GestorInstitut {
    private final ArrayList<Matricula> matricules;

    public GestorInstitut() {
        matricules = new ArrayList<>();
    }

    public void afegirMatricula(Matricula matricula) {
        matricules.add(matricula);
    }

    public double mitjaNotes(String dni) {
        double suma = 0;
        int comptador = 0;
        for (Matricula matricula : matricules) {
            if (matricula.getAlumne().toString().equals(dni)) {
                suma += matricula.getNota();
                comptador++;
            }
        }
        double notes;
        if (comptador > 0) {
            notes = suma / comptador;
        } else {
            notes = 0;
        }
        return notes;
    }

    public ArrayList<Modul> modulsSuspesos(String dni) {
        ArrayList<Modul> suspesos = new ArrayList<>();
        for (Matricula matricula : matricules) {
            if (matricula.getAlumne().getDni().equals(dni) && matricula.getNota() < 5) {
                suspesos.add(matricula.getModul());
            }
        }
        return suspesos;

    }

    public static void main(String[] ignoredArgs) {
        GestorInstitut poblenou = new GestorInstitut();

        Alumne alumne1 = new Alumne("Èrik", "Lledó", 20, "43572893Z");
        Alumne alumne2 = new Alumne("Nicolas", "Bondia", 20, "39827534A");

        Modul modul1 = new Modul("Sistemes Informàtics");
        Modul modul2 = new Modul("Bases de Dades");
        Modul modul3 = new Modul("Programació");

        poblenou.afegirMatricula(new Matricula(6.5, alumne1, modul1));
        poblenou.afegirMatricula(new Matricula(4.0, alumne1, modul2));
        poblenou.afegirMatricula(new Matricula(7.0, alumne1, modul3));

        poblenou.afegirMatricula(new Matricula(8.0, alumne2, modul1));
        poblenou.afegirMatricula(new Matricula(5.5, alumne2, modul2));
        poblenou.afegirMatricula(new Matricula(3.5, alumne2, modul3));

        System.out.println("Mitjana de notes de " + alumne1.getNom() + ": " + poblenou.mitjaNotes("12345678A"));
        System.out.println("Mòduls suspesos per " + alumne2.getNom() + ": " + poblenou.modulsSuspesos("87654321B"));

    }
}