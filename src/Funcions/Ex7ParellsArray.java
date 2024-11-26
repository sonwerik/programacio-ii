package Funcions;

public class Ex7ParellsArray {
    public static void main(String[] args) {
        int[] arr = new int[] {1, 2, 3, 4, 5, 6, 7, 8 , 9, 10};

        System.out.println(parellsArray(arr));
    }

    public static int parellsArray(int[] a) {
        int count = 0;
        for (int i : a) {
            if (i % 2 == 0) count++;
        }
        return count;
    }
}
