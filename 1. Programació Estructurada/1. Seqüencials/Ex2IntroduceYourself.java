package SCI.Sequencials;

import java.util.Scanner;

public class pt2IntroduceYourself {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name = sc.next();
        String lastName = sc.next();
        int age = sc.nextInt();
        String study = sc.next();

        System.out.println("Hola em dic " + name + " " +  lastName + ", tinc " + age + " anys i realitzo el cicle formatiu de " + study);
    }
}
