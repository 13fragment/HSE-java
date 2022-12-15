package laboratory_3;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ex_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Размерность массива: ");
        while (true){
        try{
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
        System.out.print("Массив после обработки: ");
        for (int m = 0; m < array.length; m++) {
                if (array[m] != delete) {
                    System.out.print(array[m]+" ");
                }
        }
            System.out.print("\n"+"Введите размерность массива, либо выйдите из цикла используя /quit: ");
        if(in.hasNext("quit")){
            in.close();
            System.exit(0);
        }
        }catch (InputMismatchException e){
            System.out.println("Ошибка, массив и число к удалению должны быть целыми");
            System.exit(0);
            in.close();
        }
        }
    }
}
