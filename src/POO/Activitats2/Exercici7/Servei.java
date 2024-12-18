package POO.Activitats2.Exercici7;

class Servei {
    private final String tipus;

    public Servei(String tipus) {
        this.tipus = tipus;
    }

    @Override
    public String toString() {
        return "Servei{" +
                "tipus='" + tipus + '\'' +
                '}';
    }
}