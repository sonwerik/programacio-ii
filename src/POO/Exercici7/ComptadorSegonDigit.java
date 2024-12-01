package POO.Exercici7;

public class ComptadorSegonDigit {
    private int segonDigit;

    public ComptadorSegonDigit() {
        this.segonDigit = 90;
    }

    public int consultarSegonDigit() {
        return this.segonDigit;
    }
    public void incrementarSegonDigit() {
        if (this.segonDigit < 99) {
            this.segonDigit++;
        } else {
            segonDigit = 0;
        }
    }
    public void resetSegonDigit() {
        this.segonDigit = 0;
    }
}