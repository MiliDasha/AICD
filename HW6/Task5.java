package HW6;

public class Task5 {
    public static void main(String[] args) {
        int[] sortedArray = {1, 4, 7, 10, 13, 16, 19};
        int target = 32;
        int result = threeSum(sortedArray, target);
        System.out.println("Сумма трёх чисел, ближайшая к " + target + ": " + result);
    }
    public static int threeSum(int[] arr, int target) {
        int n = arr.length;
        int sum = arr[0] + arr[1] + arr[2];

        for (int i = 0; i < n - 2; i++) {
            int left = i + 1;
            int right = n - 1;

            while (left < right) {
                int currentSum = arr[i] + arr[left] + arr[right];
                if (currentSum == target) {
                    return currentSum;
                }
                if (Math.abs(currentSum - target) < Math.abs(sum - target)) {
                    sum = currentSum;
                }
                if (currentSum < target) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        return sum;
    }
}