package NW7;

import java.util.Scanner;

public class Task1 {
    private static boolean isPerfectSquare(long x) {
        long sqrt = (long) Math.sqrt(x);
        return sqrt * sqrt == x;
    }

    public static boolean isFibonacci(long n) {
        long square5 = 5 * n * n;
        return isPerfectSquare(square5 + 4) || isPerfectSquare(square5 - 4);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        scanner.close();

        if (isFibonacci(n)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}