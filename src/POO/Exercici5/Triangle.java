package POO.Exercici5;

public class Triangle {
    private final double STAGE_1;
    private final double STAGE_2;
    private final double STAGE_3;

    public Triangle(){
        this.STAGE_1 = 3.0;
        this.STAGE_2 = 4.0;
        this.STAGE_3 = 5.0;
    }

    public Triangle(double stage1, double stage2, double stage3) {
        this.STAGE_1 = stage1;
        this.STAGE_2 = stage2;
        this.STAGE_3 = stage3;
    }

    public double perimetre() {
        return STAGE_1 + STAGE_2 + STAGE_3;
    }

    public double area() {
        double s = (STAGE_1 + STAGE_2 + STAGE_3) / 2;
        return Math.sqrt(s * (s - STAGE_1) * (s - STAGE_2) * (s - STAGE_3));
    }
}
