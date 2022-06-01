import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
    System.out.println("Введите целое положительное число: ");
    int x = scanner.nextInt();
    int x1 = x+1;
    int i = 0;
    while (i<17)
    {
        String ch = Integer.toString(x1)+" ";
        i++;
       x1=x1+3;
        System.out.println(ch);
    }
    }
}