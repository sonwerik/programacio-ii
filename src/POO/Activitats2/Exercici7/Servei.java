package POO.Activitats2.Exercici7;

class Servei {
    private String tipus;

    public Servei(String tipus) {
        this.tipus = tipus;
    }

    public String getTipus() {
        return tipus;
    }

    @Override
    public String toString() {
        return "Servei{" +
                "tipus='" + tipus + '\'' +
                '}';
    }
}