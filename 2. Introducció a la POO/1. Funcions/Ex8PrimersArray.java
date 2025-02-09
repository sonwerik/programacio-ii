package Funcions;

public class Ex8PrimersArray {
    public static void main(String[] args) {
        int[] arr = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        int[] arrPrimers = primersArray(arr);

        for (int i : arrPrimers) {
            System.out.print(i + " ");
        }
    }

    public static int[] primersArray(int[] a) {
        int count = 0;

        for (int i : a) {
            if (primer(i)) count++;
        }

        int[] motlleArrPrimers = new int[count];
        int temp = 0;
        for (int i : a) {
            if (primer(i)) {
                motlleArrPrimers[temp++] = i;
            }
        }
        return motlleArrPrimers;
    }

    public static boolean primer(int a) {
        if (a <= 1) return false;

        for (int i = 2; i < Math.sqrt(a); i++) {
            if (a % i == 0) return false;
        }
        return true;
    }
}