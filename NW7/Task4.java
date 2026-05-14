package NW7;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int[][] grid = new int[N][M];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                grid[i][j] = scanner.nextInt();
            }
        }
        scanner.close();

        int[] dp = new int[M];

        dp[0] = grid[0][0];
        for (int j = 1; j < M; j++) {
            dp[j] = dp[j-1] + grid[0][j];
        }

        for (int i = 1; i < N; i++) {
            dp[0] = dp[0] + grid[i][0];

            for (int j = 1; j < M; j++) {
                dp[j] = Math.min(dp[j], dp[j-1]) + grid[i][j];
            }
        }
        System.out.println(dp[M-1]);
    }
}
