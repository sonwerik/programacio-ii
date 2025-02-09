package Collections.ArrayList.Ex1;

import java.util.ArrayList;
import java.util.Scanner;

public class NotesDAM {
    public static void main(String[] args) {
        ArrayList<Integer> notes = introdueixValors();

        int suma = sumaValors(notes);

        if (!notes.isEmpty()) {
            double mitjana = (double) suma / notes.size();
            System.out.println("La nota mitjana és: " + mitjana);
        } else {
            System.out.println("No s'han introduït notes vàlides.");
        }
    }

    public static ArrayList<Integer> introdueixValors() {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> notes = new ArrayList<>();
        int nota;

        System.out.print("Introdueix les notes (escriu -1 per acabar): ");
        while (true) {
            nota = sc.nextInt();
            if (nota == -1) {
                break;
            } else if (nota > 0 && nota <= 10) {
                notes.add(nota);
            } else {
                System.out.println("Nota no vàlida");
            }
        }
        sc.close();
        return notes;
    }

    public static int sumaValors(ArrayList<Integer> notes) {
        int suma = 0;
        for (Integer note : notes) {
            suma += note;
        }
        return suma;
    }
}