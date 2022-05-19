import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите значение one: ");
        int one = scanner.nextInt();
        System.out.println("Введите значение two: ");
        int two = scanner.nextInt();
        if (one==two)
        {
            System.out.println("Числа равны");
        }
   else {System.out.println("Числа не равны");}
    }
}