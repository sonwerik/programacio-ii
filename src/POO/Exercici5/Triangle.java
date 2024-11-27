package POO.Exercici5;

public class Triangle {
    private final double stage1;
    private final double stage2;
    private final double stage3;

    public Triangle(){
        this.stage1 = 3.0;
        this.stage2 = 4.0;
        this.stage3 = 5.0;
    }

    public Triangle(double stage1, double stage2, double stage3) {
        this.stage1 = stage1;
        this.stage2 = stage2;
        this.stage3 = stage3;
    }

    public double perimetre() {
        return stage1 + stage2 + stage3;
    }

    public double area() {
        double s = (stage1 + stage2 + stage3) / 2;
        return Math.sqrt(s * (s - stage1) * (s - stage2) * (s - stage3));
    }
}
