package POO.Activitats2.Solucions.Ex10.Vehicles;

public class Microbus extends Vehicle {
    protected int places;
    protected final float adicioPlacesDies = 1.5F;
    protected final int adicioPlaces = 2;

    public Microbus(String matricula, int dies, int places) {
        super(matricula, dies);
        this.places = places;
    }


    @Override
    public float getPreu() {
        return (super.getPreu() + (adicioPlacesDies * places) * dies + adicioPlaces * places);
    }



    @Override
    public String toString() {
        return "Microbus:" + "\n" +
                "places = " + places + "\n" +
                "adicio places dies = " + adicioPlacesDies +  "\n" +
                "adicio places = " + adicioPlaces;
    }
}