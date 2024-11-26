package ASM.Hackerrank.Matrius;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class entrenaments {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int[][] table = new int[10][10];

        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                table[i][j] = rand.nextInt(100);
            }
        }

        for (int[] i : table) {
            System.out.println(Arrays.toString(i));
        }

        System.out.print("Entra un nombre: ");
        int num = sc.nextInt();
        boolean find = false;

        for (int[] ints : table) {
            for (int anInt : ints) {
                if (anInt == num) {
                    find = true;
                    break;
                }
            }
        }
        if (find) System.out.println("El nombre " + num + " está a la taula.");
        else System.out.println("El nombre " + num + " no apareix la taula.");
    }
}