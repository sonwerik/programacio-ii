package SCI.Condicionals;

import java.util.Scanner;

public class pt1MajorEdat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();
        int birthYear = sc.nextInt();
        int age = 2024 - birthYear;

        if (age >= 18) {
            System.out.println(name + " te " + age + " anys i es major d'edat.");
        } else {
            System.out.println(name + " te " + age + " anys i es menor d'edat.");
        }
    }
}