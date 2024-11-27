package POO.Exercici5;

public class TriangleTest {
    public static void main(String[] args) {

        Triangle triangle = new Triangle();
        System.out.println("\nEl perimetre del Triangle és: " + triangle.perimetre());
        System.out.println("L'area del triangle és: " + triangle.area());

        Triangle triangleVariacioParametres = new Triangle(6.0, 8.0, 10.0);
        System.out.println("\nEl perimetre del Triangle és: " + triangleVariacioParametres.perimetre());
        System.out.println("L'area del Triangle és: " + triangleVariacioParametres.area());
    }
}
