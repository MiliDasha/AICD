public class MainTask1 {
    public static void main(String[] args) {
        String expression = "A B +";
        int a = 10;
        int b = 15;
        int result1 = Task1.calculation(expression, a, b);

        System.out.println("Выражение: " + expression + " (где A = " + a + ", B = " + b + ")");
        System.out.println("Результат: " + result1);

        String expr2 = "5 1 2 + 4 * + 3 -";
        int result2 = Task1.calculation(expr2, 0, 0);

        System.out.println("Выражение: " + expr2);
        System.out.println("Результат: " + result2);
    }
}

