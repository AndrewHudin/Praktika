import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

            Scanner scanner=new Scanner(System.in);
        System.out.println("Введите два различных числа: ");
            int a = scanner.nextInt();
            int b = scanner.nextInt();
    if (a>b)
    {
        System.out.println("В порядке возрастания: "+b+" "+a);
        System.out.println("В порядке убывания: "+a+" "+b);
    }
        if (b>a)
        {
            System.out.println("В порядке возрастания: "+a+" "+b);
            System.out.println("В порядке убывания: "+b+" "+a);
        }
    }
}
