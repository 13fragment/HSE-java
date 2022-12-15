package laboratory_3;
import java.util.Scanner;

public class ex_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Размерность массива: ");
        int k = in.nextInt();
        int[] array = new int[k];
        for (int i = 0; i < k; i++) {
            array[i] = in.nextInt();
        }
        System.out.print("Исходный массив: ");
        for (int elem :array){
            System.out.print(elem+" ");
        }
        System.out.print("\n"+"Число к удалению: ");
        int delete = in.nextInt();
        System.out.print("Массив после обрабтки: ");
        for (int m = 0; m < array.length; m++) {
                if (array[m] != delete) {
                    System.out.print(array[m]+" ");
                }
        }
    }
}
