import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Введите положительное двузначное число: ");
   int a = scanner.nextInt();
   int b = a%10;
   int c = (a-b)/10;
    if (b>c)
    {
        System.out.println("Наибольшее число: " + b);
    }
        if (c>b)
        {
            System.out.println("Наибольшее число: " + c);
        }
        if (b==c)
        {
            System.out.println("Числа равны");
        }
    }
}