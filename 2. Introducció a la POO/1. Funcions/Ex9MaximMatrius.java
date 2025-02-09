package Funcions;

public class Ex9MaximMatrius {
    public static void main(String[] args) {
        int[][] matriu = new int[][] {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {10, 11, 12}};

        System.out.println(maximMatriu(matriu));
    }
    public static int maximMatriu(int[][] a) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (max < a[i][j]) max = a[i][j];
            }
        }
        return max;
    }
}