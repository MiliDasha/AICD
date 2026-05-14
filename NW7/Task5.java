package NW7;

import java.util.*;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        scanner.close();
        Arrays.sort(a);
        int sum = 0;
        for (int i = 0; i < n; i += 2) {
            sum += Math.abs(a[i + 1] - a[i]);
        }
        System.out.println(sum);
    }
}