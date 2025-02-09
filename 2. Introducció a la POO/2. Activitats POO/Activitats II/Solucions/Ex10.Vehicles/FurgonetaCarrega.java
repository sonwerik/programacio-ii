package POO.Activitats2.Solucions.Ex10.Vehicles;

public class FurgonetaCarrega extends Vehicle {
    protected float PMA;
    protected final float adicioCarrega = 20;

    public FurgonetaCarrega(String matricula, int dies, float PMA) {
        super(matricula, dies);
        this.PMA = PMA;
    }

    @Override
    public float getPreu() {
        return super.getPreu() + (PMA * adicioCarrega) ;
    }


    @Override
    public String toString() {
        return "FurgonetaCarrega:" + "\n" +
                "PMA = " + PMA + "\n" +
                "adicio = " + adicioCarrega;
    }
}
