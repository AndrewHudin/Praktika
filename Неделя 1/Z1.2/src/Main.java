import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.print("Введите число: ");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.println("Вы ввели число: " + a);
    }
}