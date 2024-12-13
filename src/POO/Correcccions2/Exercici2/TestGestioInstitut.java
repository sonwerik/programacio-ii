package POO.Correcccions2.Exercici2;

import java.util.ArrayList;
import java.util.List;

class TestGestioInstitut {
    private List<Matricula> matricules;

    public TestGestioInstitut() {
        matricules = new ArrayList<>();
    }

    public void afegirMatricula(Matricula matricula) {
        matricules.add(matricula);
    }

    public double extreureNotesMitjana(String dni) {
        double suma = 0;
        int comptador = 0;
        for (Matricula m : matricules) {
            if (m.getAlumne().getDni().equals(dni)) {
                suma += m.getNota();
                comptador++;
            }
        }
        return comptador > 0 ? suma / comptador : 0;
    }

    public List<Modul> extreuModulsSuspesos(String dni) {
        List<Modul> suspesos = new ArrayList<>();
        for (Matricula m : matricules) {
            if (m.getAlumne().getDni().equals(dni) && m.getNota() < 5) {
                suspesos.add(m.getModul());
            }
        }
        return suspesos;
    }

    public static void main(String[] args) {
        TestGestioInstitut institut = new TestGestioInstitut();

        // Creem alumnes
        Alumne alumne1 = new Alumne("Joan", "Garcia", 20, "12345678A");
        Alumne alumne2 = new Alumne("Anna", "Martínez", 22, "87654321B");

        // Creem mòduls
        Modul modul1 = new Modul("Matemàtiques");
        Modul modul2 = new Modul("Programació");
        Modul modul3 = new Modul("Bases de Dades");

        // Afegim matrícules
        institut.afegirMatricula(new Matricula(alumne1, modul1, 6.5));
        institut.afegirMatricula(new Matricula(alumne1, modul2, 4.0));
        institut.afegirMatricula(new Matricula(alumne1, modul3, 7.0));

        institut.afegirMatricula(new Matricula(alumne2, modul1, 8.0));
        institut.afegirMatricula(new Matricula(alumne2, modul2, 5.5));
        institut.afegirMatricula(new Matricula(alumne2, modul3, 3.5));

        // Mostrem resultats
        System.out.println("Mitjana de notes de Joan: " + institut.extreureNotesMitjana("12345678A"));
        System.out.println("Mòduls suspesos per Anna: " + institut.extreuModulsSuspesos("87654321B"));
    }
}