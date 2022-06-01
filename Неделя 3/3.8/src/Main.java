import java.util.Random;
public class Main {
    public static void main(String[] args) {
        int[] Numbers = new int[25];
        int count = 0;
        int x = 0;
        Random random = new Random();
        for (int i = 0; i < Numbers.length; i++)
        {
            Numbers[i] = random.nextInt(900) + 100;
            System.out.print(Numbers[i] + " ");
        }
        for (int i = 0; i < Numbers.length; i++)
        {
            if (Numbers[i] > x)
            {
                x = Numbers[i];
                count = i;
            }
        }
        count++;
        System.out.println("Максимальное число: " + x + "Оно под номером: " + count + ".");
    }
}