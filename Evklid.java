import java.util.Scanner;
public class Evklid {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(nod(a,b));
    }

    public static int nod(int a, int b){
        if (a == 0 && b == 0){ // Ну тут логично
            return 0;
        }
        if (a == 0){ // По свойству НОД
            return b;
        }
        if (b == 0){ // Я написала бы, что на ноль делить нельзя, но по свойству НОД вроде так правильно
            return a;
        }
        while (b != 0){
            int temp = b;
            b =a % b;
            a= temp;
        }
        return a;
    }
}
