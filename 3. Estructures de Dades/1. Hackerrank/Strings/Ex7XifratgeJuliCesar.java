import java.util.Scanner;

public class Ex7XifratgeJuliCesar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String msg = sc.next().toUpperCase();
        int position = sc.nextInt();
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        for (int i = 0; i < msg.length(); i++) {
            int newPosition = (alphabet.indexOf(msg.charAt(i)) + position) % alphabet.length();
            System.out.print(alphabet.charAt(newPosition));
        }
    }
}