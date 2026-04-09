package HW6;

public class Task2 {
    public static void main(String[] args) {
        int first = 25;
        int second = 5;
        boolean result = checkSquare(first, second);
        System.out.println("Результат: " + result);
    }

    public static boolean checkSquare(int first, int second) {
        int square = bitwiseSquare(second);
        return (first ^ square) == 0;
    }

    public static int bitwiseSquare(int n) {
        int result = 0;
        int a = n;
        int b = n;
        while (b != 0) {
            if ((b & 1) == 1) {
                result = bitwiseAdd(result, a);
            }
            a <<= 1;
            b >>= 1;
        }
        return result;
    }

    public static int bitwiseAdd(int a, int b) {
        while (b != 0) {
            int carry = a & b;
            a = a ^ b;
            b = carry << 1;
        }
        return a;
    }
}