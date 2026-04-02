package NW5;

import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {
        int[] arr = {3, 30, 34, 5, 9};
        String[] strs = new String[arr.length];
        for (int i = 0; i < arr.length; i++) {
            strs[i] = String.valueOf(arr[i]);
        }
        Arrays.sort(strs, (a, b) -> (b + a).compareTo(a + b));
        if (strs[0].equals("0")) {
            System.out.println("0");
            return;
        }
        StringBuilder result = new StringBuilder();
        for (String s : strs) {
            result.append(s);
        }
        System.out.println(result.toString());
    }
}