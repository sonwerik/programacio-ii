package ASM.Matrius;

import java.util.Arrays;

public class chess {
    public static void main(String[] args) {

        String[][] table = new String[8][8];
        String space = "X";
        String pawn = "P";
        String knight = "N";
        String bishop = "B";
        String rook = "R";
        String queen = "Q";
        String king = "K";

        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                table[i][j] = space;
            }
        }
/*
        for (String[] strings : table) {
            Arrays.fill(strings, space);
        }
 */

        table[7][7] = rook;
        table[7][6] = knight;
        table[7][5] = bishop;
        table[7][4] = king;
        table[7][3] = queen;
        table[7][2] = bishop;
        table[7][1] = knight;
        table[7][0] = rook;

        table[0][0] = rook;
        table[0][1] = knight;
        table[0][2] = bishop;
        table[0][3] = king;
        table[0][4] = queen;
        table[0][5] = bishop;
        table[0][6] = knight;
        table[0][7] = rook;

        table[1][0] = pawn;
        table[1][1] = pawn;
        table[1][2] = pawn;
        table[1][3] = pawn;
        table[1][4] = pawn;
        table[1][5] = pawn;
        table[1][6] = pawn;
        table[1][7] = pawn;

        table[6][7] = pawn;
        table[6][6] = pawn;
        table[6][5] = pawn;
        table[6][4] = pawn;
        table[6][3] = pawn;
        table[6][2] = pawn;
        table[6][1] = pawn;
        table[6][0] = pawn;

        for (String[] i : table) {
            System.out.println(Arrays.toString(i));
        }
    }
}