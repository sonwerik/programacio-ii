package POO.Activitats1.Exercici5;

public class TriangleTest {
    public static void main(String[] args) {

        Triangle triangle = new Triangle();
        System.out.println("\nEl perímetre del triangle amb els valors predeterminats és: " + triangle.perimetreTriangle());
        System.out.println("L'area del triangle amb els valors predeterminats és: " + triangle.areaTriangle());

        Triangle triangleModificat = new Triangle(6.0, 8.0, 10.0);
        System.out.println("\nEl perímetre del triangle amb els valors modificats és: " + triangleModificat.perimetreTriangle());
        System.out.println("L'area del triangle amb els valors modificats és: " + triangleModificat.areaTriangle());
    }
}