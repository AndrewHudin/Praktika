import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
        System.out.println("Введите значение avg: ");
   int avg = scanner.nextInt();
   if (avg==100)
   {
       System.out.println("Молодец");
   }
        System.out.println("Введите значение mark: ");
        int mark = scanner.nextInt();
        if (mark<60)
        {
            System.out.println(mark*1.1);
        }

        System.out.println("Введите значение one: ");
        int one = scanner.nextInt();
        System.out.println("Введите значение two: ");
        int two = scanner.nextInt();
        if (one>two)
        {
            System.out.println(one);
        }
        else if (two==one)
        {
            System.out.println("Числа равны");
        }
        else
        {
            System.out.println(two);
        }

        System.out.println("Введите значение num: ");
        int num = scanner.nextInt();
        if (num>=0)
        {
            System.out.println("Положительное");
        }
        if (num<=0)
        {
            System.out.println("Положительное");
        }
        System.out.println("Введите значение ugol, ugol2, ugol3: ");
        int ugol = scanner.nextInt();
        int ugol2 = scanner.nextInt();
        int ugol3 = scanner.nextInt();
    if (ugol+ugol2+ugol3==180)
    {
        System.out.println("Это углы одного треугольника");
    }
    else {
        System.out.println("Это не углы треугольника");
    }


    }

}