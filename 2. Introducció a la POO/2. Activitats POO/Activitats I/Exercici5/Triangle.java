package POO.Activitats1.Exercici5;

public class Triangle {
    private final double side1;
    private final double side2;
    private final double side3;

    public Triangle() {
        this.side1 = 3.0;
        this.side2 = 4.0;
        this.side3 = 5.0;
    }

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double perimetreTriangle() {
        return side1 + side2 + side3;
    }

    public double areaTriangle(){
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s*(s- side1)*(s- side2)*(s- side3));
    }
}