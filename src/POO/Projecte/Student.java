package POO.Projecte;

import java.util.Scanner;

class Student {
    private String name;
    private String surname;
    private String email;

    public void addStudent(Scanner sc) {
        System.out.print("Introdueix el nom de l'estudiant: ");
        this.name = sc.nextLine();
        System.out.print("Introdueix el cognom de l'estudiant: ");
        this.surname = sc.nextLine();
        System.out.print("Introdueix el correu electrònic de l'estudiant: ");
        this.email = sc.nextLine();
    }

    @Override
    public String toString() {
        return name + " " + surname + " (" + email + ")";
    }
}