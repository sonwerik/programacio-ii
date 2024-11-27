package POO.Exercici6;

public class ComptadorCiclic {
    private int comptador;

    public ComptadorCiclic() {
        this.comptador = 0;
    }

    public int consultar() {
        return this.comptador;
    }

    public void incrementar() {
        if (this.comptador < 9) {comptador++;}
        else {comptador = 0;}switch (opcio) {
            case 1:
                // Consultar el digit
                System.out.println("Valor actual del digit: " + digit.consultar());
                break;
            case 2:
                // Incrementar el digit
                digit.incrementar();
                System.out.println("Valor actual del digit: " + digit.consultar());
                break;
            case 3:
                // Reset del digit
                digit.reset();
                System.out.println("Valor actual del digit: " + digit.consultar());
                break;
            default:
                System.out.println("Opció no vàlida. Torna a intentar-ho.");
                break;
        }

    }

    public void reset() {
        this.comptador = 0;
    }
}