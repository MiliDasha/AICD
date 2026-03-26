import java.util.Scanner;

public class Task1 {
    public static boolean isShift(String s1, String s2){
        if (s1.length() != s2.length()) {
            return false;
        }
        if (s1.isEmpty()) {
            return true;
        }
        String doubled = s1 + s1;
        return doubled.contains(s2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String s1 = scanner.nextLine();
        String s2 = scanner.nextLine();

        if (isShift(s1, s2)) {
            System.out.println("Да, " + s1 + "является циклическим сдвигом " + s2);
        } else {
            System.out.println("Нет, " + s1 + "не является циклическим сдвигом " + s2 );
        }
        scanner.close();
    }

}
