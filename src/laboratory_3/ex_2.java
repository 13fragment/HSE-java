package laboratory_3;

import java.util.Arrays;
import java.util.Scanner;

public class ex_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Размерность массива: ");
        String elem = " ";
        int k = in.nextInt();
        int[] array = new int[k];
        for (int i = 0; i < k; i++) {
            array[i] = in.nextInt();
        }
        System.out.println("Массив: " + Arrays.toString(array));
        System.out.print("Число к удалению: ");
        int delete = in.nextInt();
        for (int m = 0; m < array.length - 1; m++) {
                if (array[m] != delete) {
                    System.out.print(array[m]+" ");
                }
        }
    }
}
