public class Main {
    public static void main(String[] args) {
        int[] array = new int[90];
        int a = 10;
        System.out.println("Заполнение массива: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = a;

            a++;
        }
        System.out.println("Вывод чисел: ");
        for (int i = 0; i < array.length; i++) {
            if ((array[i] + array[i++]) <= 99) {
                System.out.print(array[i] + " ");
            }

        }
    }
}
