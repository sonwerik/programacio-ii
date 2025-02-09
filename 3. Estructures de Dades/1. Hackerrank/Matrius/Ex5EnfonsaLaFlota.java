import java.util.Scanner;

public class pt5EnfonsaLaFlota {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); sc.nextLine();

        char[][] board = new char[n][n];

        for (int i = 0; i < n; i++) {
            String line = sc.nextLine();
            board[i] = line.replace(" ", "").toCharArray();
        }

        boolean[][] hits = new boolean[n][n];
        while (true) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            if (x == -1 && y == -1) {
                break;
            }

            if (x >= 0 && x < n && y >= 0 && y < n) {
                hits[x][y] = true;
            }
        }

        boolean win = true;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == 'V' && !hits[i][j]) {
                    win = false;
                    break;
                }
            }
            if (!win) {
                break;
            }
        }

        System.out.println(win ? "GUANYA" : "NO GUANYA");
    }
}