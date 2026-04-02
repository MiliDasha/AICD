package NW5;

import java.util.*;

public class Task2 {
    public static void main(String[] args) {
        String[] arr = {"яблоко", "апельсин", "персик", "клубника", "банан"};
        Arrays.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                if (s1.equals(s2)) return 0;
                int minLength = Math.min(s1.length(), s2.length());
                for (int i = 0; i < minLength; i++) {
                    if (s1.charAt(i) < s2.charAt(i)) return -1;
                    if (s1.charAt(i) > s2.charAt(i)) return 1;
                }
                if (s1.length() < s2.length()) return -1;
                return 1;
            }
        });
        for (String s : arr) {
            System.out.println(s);
        }
    }
}