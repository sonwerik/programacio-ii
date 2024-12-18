package POO.Activitats2.Solucions.Ex10.Vehicles;

public class Camio extends Vehicle{
    protected float PMA;
    protected final float adicioCarrega = 20;
    protected final float adicioCamio = 40;

    public Camio(String matricula, int dies, float PMA) {
        super(matricula, dies);
        this.PMA = PMA;
    }

    @Override
    public float getPreu() {
        return super.getPreu() + (PMA * adicioCarrega) + adicioCamio;
    }

    @Override
    public String toString() {
        return "Camio:" + "\n" +
                "PMA = " + PMA + "\n" +
                "adicio carrega = " + adicioCarrega + "\n" +
                "adicio camio = " + adicioCamio;
    }
}
