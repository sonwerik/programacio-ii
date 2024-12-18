package POO.Activitats2.Solucions.Ex8.Terratremol.terratremol;

public class Localitzacio {

    private final double latitude;
    private final double longitude;
    private final String city;

    public Localitzacio(double latitude, double longitude, String city) {
        this.latitude = latitude;
        this.longitude = longitude;
        this.city = city;
    }

    @Override
    public String toString() {
        return "Localitzacio{" +
                "latitude=" + latitude +
                ", longitude=" + longitude +
                ", city='" + city + '\'' +
                '}';
    }
}
