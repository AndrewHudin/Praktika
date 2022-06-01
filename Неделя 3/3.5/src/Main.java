import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество чисел Фиббоначи: ");
        int count = scanner.nextInt();
        int a = 1;
        int a2=1;
        int i = 2;
        int x;
System.out.print(a + " " + a2+ " ");
        while (i<count)
        {
            i++;
            x = a + a2;
            System.out.print(x + " ");
            a = a2;
            a2 = x;
        }

    }
}