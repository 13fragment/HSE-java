package laboratotory_1;

import java.util.Scanner;

public class ex4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Количество точек: ");
        int kol_vo = input.nextInt();
        System.out.print("Рудиус окружности: ");
        float radius = input.nextFloat();
        int counter = 0;
        for (int i = 1; i <= kol_vo; i++) {
            System.out.print("X ");
            System.out.print(i+" точки: ");
            float x1 = input.nextFloat();

            System.out.print("Y ");
            System.out.print(i+" точки: ");
            float y1 = input.nextFloat();
            if ((x1 * x1 + y1 * y1 <= radius * radius)) {
                counter += 1;
            }
        }
        System.out.println(counter + " точек попали в окружность");
        input.close();
    }
}