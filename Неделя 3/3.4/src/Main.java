import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int[] x = new int[number];
        int a = 1;
        int count = 0;
        for (int i = 0; i < x.length; i++)
        {
            x[i] = a;
            a++;
        }

        for (int i = 0; i < x.length; i++)
        {
            if (number % x[i] == 0)
            {
                if ((x[i]>1) && (x[i]<number)) {
                    count++;
                    System.out.println("Вариант №" + count);
                    System.out.println(number + ":" + x[i] + "=" + (number / x[i]));
                }
            }
        }
    }
}