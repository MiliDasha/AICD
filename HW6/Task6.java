package HW6;

import java.util.HashSet;

public class Task6 {
    public static void main(String[] args) {
        int[] first = {1, 2, 3, 4, 5, 6};
        int[] second = {1, 3, 7};
        int[] third = {1, 2, 6, 8, 15, 10, 5};

        HashSet<Integer> set = new HashSet<>();
        for (int num : first) set.add(num);

        HashSet<Integer> intersection = new HashSet<>();
        for (int num : second) {
            if (set.contains(num)) intersection.add(num);
        }

        HashSet<Integer> result = new HashSet<>();
        for (int num : third) {
            if (intersection.contains(num)) result.add(num);
        }

        System.out.println(result);
    }
}