import java.util.Scanner;

import java.lang.Math;

public class Main {
    public static void main(String[] args)
    {
        System.out.println("Введите длину прямоугольника: ");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.println("Введите ширину прямоугольника: ");
        int b = scanner.nextInt();
    int p = (a+b)*2;
    double d2 = a^2+b^2;
    double d =Math.sqrt(d2);
        System.out.println("Периметр прямоугольника равен: "+p);
        System.out.println("Диагональ прямоугольника равна: "+d);
    }
}