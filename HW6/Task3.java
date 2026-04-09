package HW6;

public class Task3 {
    public static void main(String[] args) {
        String input = "можно мне балл";
        String[] words = new String[100];
        int countWords = 0;
        String word = "";
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (c != ' ') {
                word += c;
            } else {
                if (!word.isEmpty()) {
                    words[countWords++] = word;
                    word = "";
                }
            }
        }
        if (!word.isEmpty()) {
            words[countWords++] = word;
        }

        String result = "";
        for (int i = countWords - 1; i >= 0; i--) {
            result += words[i];
            if (i > 0) result += " ";
        }
        System.out.println(result);
    }
}