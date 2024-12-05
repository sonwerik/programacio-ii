package POO.Activitats2.Exercici2;

public class GestorInstitut {
    public static void main(String[] args) {

        Alumne erik = new Alumne("Èrik", "Lledó", 20, "43572893Z");
        Modul programacio = new Modul("Programació");
        Matricula matriculaErik = new Matricula(9.2, erik, programacio);

        System.out.println(matriculaErik);
    }
}