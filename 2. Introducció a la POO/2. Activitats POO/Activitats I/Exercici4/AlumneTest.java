package POO.Activitats1.Exercici4;

public class AlumneTest {
    public static void main(String[] ignoredArgs) {
//crea un objecte uf4.exemples.Alumne i l'assigna a la variable alumne1
        Alumne alumne1;
        Alumne alumne2;
        Alumne alumne3;
        alumne1 = new Alumne();
        alumne1.setNom("Ramon");
        alumne2 = new Alumne();
        alumne2.setNom("Sonia");
        alumne3 = alumne1;

        alumne3.saluda();
        alumne1.saluda();
        alumne1 = alumne2;
        alumne1.saluda();
        alumne2.setNom("Moncho");
        alumne1.saluda();
    }
}