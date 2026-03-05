public class Task1 {
    public static int calculation(String input, int a, int b) {
        Stack stack = new Stack();
        String[] symbols = input.split(" ");

        for (String symbol : symbols) {
            switch (symbol) {
                case "+":
                    stack.add(new StackNode(stack.remove().getValue() + stack.remove().getValue()));
                    break;
                case "*":
                    stack.add(new StackNode(stack.remove().getValue() * stack.remove().getValue()));
                    break;
                case "-":
                    int operand2 = stack.remove().getValue(); // тут уже порядок важет поэтому 2, потом 1
                    int operand1 = stack.remove().getValue();
                    stack.add(new StackNode(operand1 - operand2));
                    break;
                case "A":
                    stack.add(new StackNode(a));
                    break;
                case "B":
                    stack.add(new StackNode(b));
                    break;
                default:
                    stack.add(new StackNode(Integer.parseInt(symbol))); // текст в число
                    break;
            }
        }
        return stack.remove().getValue();
    }
}
