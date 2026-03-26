public class Task2 {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 5};
        int missingNumber = findMissingNumber(arr);
        System.out.println("Отсутствует число: " + missingNumber);
    }

    public static int findMissingNumber(int[] arr) {
        int n = arr.length;
        int expectedSum  = n * (n + 1) / 2;
        int realSum = 0;
        for (int i = 0; i < n; i++) {
            realSum += arr[i];
        }
        return expectedSum  - realSum;
    }
}
