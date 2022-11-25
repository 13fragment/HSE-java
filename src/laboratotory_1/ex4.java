package laboratotory_1;

import java.util.Scanner;

public class ex4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        Количество точек: 2
//        Радиус окружности: 2
//        X 1 точки: 10
//        Y 1 точки: 12
//        X 2 точки: 500
//        Y 2 точки: -6
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
        input.close();
    }
}