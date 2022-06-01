import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int  countNumber = 1;
        int number;
        while (count < 4)
        {
            System.out.print("Введите " + countNumber + " число: ");
            number = scanner.nextInt();
            if ((number % 2 == 0) && (countNumber % 2 == 0))
            {
                count = count + 1;
                countNumber++;
            }
            else
            {
                countNumber++;
            }
        }
        System.out.println("Количество четных чисел на нечетных позициах: " + count );


    }
    }
