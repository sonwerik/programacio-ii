package POO.Correcccions2.Exercici8;

class Localitzacio {
    private double latitud;
    private double longitud;
    private String ciutat;

    public Localitzacio(double latitud, double longitud, String ciutat) {
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
