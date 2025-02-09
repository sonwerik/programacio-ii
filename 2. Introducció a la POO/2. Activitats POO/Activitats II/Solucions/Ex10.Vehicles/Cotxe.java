package POO.Activitats2.Solucions.Ex10.Vehicles;

public class Cotxe extends Vehicle {
    protected int places;
    protected final float adicio = 1.5F;

    public Cotxe(String matricula, int dies, int places) {
        super(matricula, dies);
        this.places = places;
    }

    @Override
    public float getPreu() {
        return super.getPreu() + (adicio * places) * dies;
    }

    @Override
    public String toString() {
        return super.toString() + "Cotxe:" + "\n" +
                "places = " + places + "\n" +
                "adicio = " + adicio;
    }
}
