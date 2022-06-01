public class Main {
    public static void main(String[] args) {
        int i = 0;

        while (i<98)
        {
            i=i+2;

            String ch = Integer.toString(i)+" ";
            System.out.print(ch);
        }
        System.out.print("Вывод двузначных чётных чисел закончился");
    }
}