package Collections.HashSet.Ex1;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

class Lottery {
    private Set<Integer> ballBag;
    private Set<Player> players;
    private Set<Integer> drawnBalls;
    private Random rand;

    public Lottery() {
        ballBag = new HashSet<>();
        players = new HashSet<>();
        drawnBalls = new HashSet<>();
        rand = new Random();
        initializeBag();
    }

    private void initializeBag() {
        for (int i = 0; i <= 100; i++) {
            ballBag.add(i);
        }
    }

    public void addPlayer(Player player) {
        players.add(player);
    }

    public void play() {
        while (true) {
            // Draw a random ball from the bag
            int ball = drawBall();
            drawnBalls.add(ball);
            System.out.println("S'ha tret la bola: " + ball);

            for (Player player : players) {
                if (player.hasWon(drawnBalls)) {
                    System.out.println("El guanyador és el jugador amb DNI: " + player.getDni());
                    return;
                }
            }
        }
    }

    private int drawBall() {
        int ball = rand.nextInt(101);
        while (!ballBag.contains(ball)) {
            ball = rand.nextInt(101);
        }
        ballBag.remove(ball);
        return ball;
    }
}
