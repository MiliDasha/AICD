package NW7;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        scanner.close();

        StringBuilder result = new StringBuilder();
        int a = 1, b = 1;
        if (a <= s.length()) {
            result.append(s.charAt(a - 1));
        }

        while (b <= s.length()) {
            if (b != 1) {
                result.append(s.charAt(b - 1));
            }
            int next = a + b;
            a = b;
            b = next;
        }
        System.out.println(result.toString());
    }
}