package laboratotory_1;

import java.util.Scanner;

public class ex4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Количество точек: ");
        int kol_vo = input.nextInt();
        System.out.print("Рудиус окружности: ");
        float radius = input.nextFloat();

            System.out.print("X 1 точки: ");
            float x1 = input.nextFloat();

            System.out.print("Y 1 точки: ");
            float y1 = input.nextFloat();

            System.out.print("X 2 точки: ");
            float x2 = input.nextFloat();

            System.out.print("Y 2 точки: ");
            float y2 = input.nextFloat();
        int counter = 0;

        input.close();
        if((x1*x1+y1*y1<=radius*radius)|(x2*x2+y2*y2<=radius*radius)){
            counter +=1;
        }
        System.out.println(counter + " точек попали в окружность");
    }
}