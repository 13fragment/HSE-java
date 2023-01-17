package laboratory_3;

import java.util.LinkedList;
import java.util.Scanner;

public class rewrited_ex_3 {
    public static void main(String[] args) {
        LinkedList <Integer> a = new LinkedList<>();
        Scanner in = new Scanner(System.in);
        System.out.print("Размерность массива: ");
        int k = in.nextInt();
        for (int i = 0; i<k;i++){
            int f = in.nextInt();
            a.add(f);
        }
        System.out.println("Исходный массив: " + " " + a);
        System.out.print("Число к удалению: ");
        int delete  = in.nextInt();
        a.removeIf(n -> (n == delete));
        System.out.println("Массив после обработки" + " "+ a);
        in.close();
    }
}
