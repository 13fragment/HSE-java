package laboratory_3;

import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.Scanner;

public class rewrited_ex_3 {
    public static void main(String[] args) {
        LinkedList <Integer> a = new LinkedList<>();
        Scanner in = new Scanner(System.in);
        System.out.print("Размерность массива: ");
        while (true){
        try{
        int k = in.nextInt();
        if(k<=0){
            System.err.println("Длина массива не может быть <=0, исходя из условия");
            System.exit(1);
            in.close();
        }
        for (int i = 0; i<k;i++){
            int f = in.nextInt();
            a.add(f);
        }
        System.out.println("Исходный массив: " + " " + a);
        System.out.print("Число к удалению: ");
        int delete  = in.nextInt();
        a.removeIf(n -> (n == delete));
        System.out.println("Массив после обработки" + " "+ a);
        System.out.print("Введите размерность массива, либо выйдите из цикла используя /quit: ");
        a.clear();
        if (in.hasNext("/quit")) {
            in.close();
            System.exit(0);
        }
        }catch(InputMismatchException e){
            System.err.println("Введен неверный тип переменной");
            in.close();
        }
        }
    }
}
