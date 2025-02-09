package POO.Activitats1.Exercici9;

import POO.Activitats1.Exercici8.Player;
import POO.Activitats1.Exercici8.Position;

import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Player[] players = new Player[10];
        int playerCount = 0;

        boolean exit = false;

        while (!exit) {
            System.out.println("\nMenu:");
            System.out.println("1. Add new player");
            System.out.println("2. Remove last player");
            System.out.println("3. Reset game");
            System.out.println("4. Show players");
            System.out.println("0. Exit");
            System.out.print("Choose an option: ");
            int option = sc.nextInt();

            switch (option) {
                case 1:
                    if (playerCount >= 10) {
                        System.out.println("Error: Maximum number of players reached.");
                    } else {
                        System.out.print("Enter player name: ");
                        String name = sc.next();

                        System.out.print("Enter initial X coordinate: ");
                        int x = sc.nextInt();

                        System.out.print("Enter initial Y coordinate: ");
                        int y = sc.nextInt();

                        players[playerCount] = new Player(new Position(x, y), name);
                        playerCount++;
                        System.out.println("Player added successfully.");
                    }
                    break;

                case 2:
                    if (playerCount > 0) {
                        playerCount--;
                        players[playerCount] = null;
                        System.out.println("Last player removed.");
                    } else {
                        System.out.println("Error: No players to remove.");
                    }
                    break;

                case 3:
                    for (int i = 0; i < playerCount; i++) {
                        players[i] = null;
                    }
                    playerCount = 0;
                    System.out.println("All players removed. Game reset.");
                    break;

                case 4:
                    if (playerCount > 0) {
                        System.out.println("Players:");
                        for (int i = 0; i < playerCount; i++) {
                            System.out.println((i + 1) + ". " + players[i]);
                        }
                    } else {
                        System.out.println("No players to show.");
                    }
                    break;

                case 0:
                    exit = true;
                    System.out.println("Exiting the game.");
                    break;

                default:
                    System.out.println("Invalid option. Try again.");
                    break;
            }
        }
    }
}