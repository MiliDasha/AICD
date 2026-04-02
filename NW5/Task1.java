package NW5;

import java.util.HashMap;
import java.util.Map;

public class Task1 {
    public static void main(String[] args) {
        int[] arr = {1, 4, 5, 7, 2};
        int target = 9;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int complement = target - arr[i];
            if (map.containsKey(complement)) {
                System.out.println("Числа: " + complement + " + " + arr[i] + " = " + target);
            }

            map.put(arr[i], i);
        }
    }
}