package POO.Funcions;

public class Ex5ordena {
    public static void main(String[] args) {
        int n1 = 12;
        int n2 = 7;
        int n3 = 2;

        System.out.println(n3 + " " + n2 + " " + n1);
    }
    public static void ordena(int a, int b, int c) {
        if (a < b) {
            int temp = a;
            a = b;
            b = temp;
        }
        if (a < c) {
            int temp = a;
            a = c;
            c = temp;
        }
        if (b < c) {
            int temp = b;
            b = c;
            c = temp;
        }
    }
}

