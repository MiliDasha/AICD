package NW7;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        if (n == 0) {
            System.out.println(0);
            return;
        }
        int a = 0;
        int b = 1;
        for (int i = 2; i <= n; i++) {
            int next = (a + b) % 10;
            a = b;
            b = next;
        }
        System.out.println(b);
    }
}
