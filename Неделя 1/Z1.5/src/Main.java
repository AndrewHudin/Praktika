import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int a = scanner.nextInt();
        System.out.print("Введите второе число: ");
        int b = scanner.nextInt();
        System.out.print("Введите, что Вы хотите сделать с числами (+, -, *, /): ");
        String c = scanner.next();

        if ((b == 0) && (c.equals("/")))
        {
            System.out.print("На 0 делить нельзя!!");
            System.exit(0);
        }

        switch (c)
        {
            case "+":
            {
                double sum = a+b;
                System.out.print("Сумма двух чисел = "+sum );
                break;
            }
            case "-":
            {
                double ras = a-b;
                System.out.print("Разность двух чисел = "+ras);
                break;
            }
            case "*":
            {
                double um = a*b;
                System.out.print("Произведение двух чисел = "+um);
                break;
            }
            case "/":
            {
                double de = a/b;
                System.out.println("Частное от деление первого числа на второе = "+de);
            }
        }
    }
}