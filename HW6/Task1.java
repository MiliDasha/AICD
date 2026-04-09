package HW6;

public class Task1 {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9};
        int target = 6;
        int index = metod(arr, target);
        System.out.println(" индекс " + index);
    }
    public static int metod(int[] arr, int target) {
        int result = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < target) {
                result = i;
            } else {
                break;
            }
        }
        return result;
    }
}