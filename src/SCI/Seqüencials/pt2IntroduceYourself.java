package SCI.Seqüencials;

import java.util.Scanner;

public class pt2IntroduceYourself {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.next();
        String lastName = scanner.next();
        int age = scanner.nextInt();
        String study = scanner.next();

        System.out.println("Hola em dic " + name + " " +  lastName + ", tinc " + age + " anys i realitzo el cicle formatiu de " + study);
    }
}
