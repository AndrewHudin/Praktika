import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Введите первое число: ");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.println("Введите второе число: ");
        int b = scanner.nextInt();
        if (a == b) {
            System.out.println("Числа равны");
        }
        if (a > b) {
            System.out.println("Первое число больше");
        }
        if (b > a) {
            System.out.println("Второе число больше");
        }
    }
}