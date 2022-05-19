import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое трёхзначное положительное число: ");
    int a = scanner.nextInt();
    if (a>500)
    {
        int a1=a%10;
        int a2=((a%100)-a1)/10;
        int a3=(((a%1000)-((a2*10)+a1))/100);
        String ch1 = Integer.toString(a1);
        String ch2 = Integer.toString(a2);
        String ch3 = Integer.toString(a3);
        String ch = ch1+ch2+ch3;
        System.out.println("Поменяли местами единицы и сотни: " + ch);
    }
    else {
        int a1=a%10;
        int a2=((a%100)-a1)/10;
        int a3=(((a%1000)-((a2*10)+a1))/100);

        String ch1 = Integer.toString(a1);
        String ch2 = Integer.toString(a2);
        String ch3 = Integer.toString(a3);
        String ch = ch3+ch1+ch2;
        System.out.println("Поменяли местами единицы и десятки: " + ch);
    }
    }
}