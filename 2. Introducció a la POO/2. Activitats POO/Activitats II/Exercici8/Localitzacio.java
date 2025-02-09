package POO.Activitats2.Exercici8;

class Localitzacio {
    private final double latitud;
    private final double longitud;
    private final String ciutat;

    public Localitzacio(double latitud, double longitud, String ciutat) {
        if (latitud < -90 || latitud > 90) {
            throw new IllegalArgumentException("Latitud fora de rang.");
        }
        if (longitud < -180 || longitud > 180) {
            throw new IllegalArgumentException("Longitud fora de rang.");
        }
        this.latitud = latitud;
        this.longitud = longitud;
        this.ciutat = ciutat;
    }

    @Override
    public String toString() {
        return "Localitzacio{" +
                "latitud=" + latitud +
                ", longitud=" + longitud +
                ", ciutat='" + ciutat + '\'' +
                '}';
    }
}