package POO.Activitats1.Exercici3;

public class Cotxe {
    private String marca;
    private String model;
    private String matricula;


    public void setMarca(String marca) {
        this.marca = marca;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void infoCotxe() {
        System.out.println("Marca: " + marca);
        System.out.println("Model: " + model);
        System.out.println("Matricula: " + matricula);
    }
}