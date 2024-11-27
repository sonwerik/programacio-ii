package POO.Exercici5;

public class Triangle {
    private final double SIDE_1;
    private final double SIDE_2;
    private final double SIDE_3;

    public Triangle() {
        this.SIDE_1 = 3.0;
        this.SIDE_2 = 4.0;
        this.SIDE_3 = 5.0;
    }

    public Triangle(double side1, double side2, double side3) {
        this.SIDE_1 = side1;
        this.SIDE_2 = side2;
        this.SIDE_3 = side3;
    }

    public double perimetreTriangle() {
        return SIDE_1 + SIDE_2 + SIDE_3;
    }

    public double areaTriangle(){
        double s = (SIDE_1 + SIDE_2 + SIDE_3) / 2;
        return Math.sqrt(s*(s-SIDE_1)*(s-SIDE_2)*(s-SIDE_3));
    }
}