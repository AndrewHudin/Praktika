public class Main {
    public static void main(String[] args) {
        int[] Diameter = new int[121];
        int[] Weight = new int[121];
        int count = 0;
        for (int i = 0; i < Diameter.length; i++)
        {
            Diameter[i] = 20 + (int) (Math.random() * 5);
        }
        //Рандом веса шариков
        for (int i = 1; i < Weight.length; i++)
        {
            Weight[i] = 70 + (int) (Math.random() * 10);
        }
        for (int i = 1; i < Weight.length; i++)
        {
            if ((Diameter[i] >= 22 && Diameter[i] <= 26) && (Weight[i] >= 71 && Weight[i] <= 77))
            {
                count++;
                System.out.println(i + " шарик имеет вес " + Weight[i] + " и его диаметр составляет " + Diameter[i] + "Сделано по правилам");
            }
            else
            {
                System.out.println(i + " шарик имеет вес " + Weight[i] + " и его диаметр составляет " + Diameter[i] + ":брак.");
            }
        }
        System.out.println("Количество шариков без брака: " + count);
    }
    }
