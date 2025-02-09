import java.util.Scanner;

public class Ex9BubbleSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        String[] teams = new String[n];
        int[] scores = new int[n];

        for (int i = 0; i < n; i++) {
            teams[i] = sc.next();
            scores[i] = sc.nextInt();
        }

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (scores[j] < scores[j + 1]) {

                    int tempScore = scores[j];
                    scores[j] = scores[j + 1];
                    scores[j + 1] = tempScore;


                    String tempTeam = teams[j];
                    teams[j] = teams[j + 1];
                    teams[j + 1] = tempTeam;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.println(teams[i] + " " + scores[i]);
        }
    }
}