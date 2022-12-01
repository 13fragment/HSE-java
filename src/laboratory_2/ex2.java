package laboratory_2;

import java.util.Scanner;
public class ex2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();

        while (s.length()<8){
            System.out.println("Пароль ненадежен. Повторите ввод");
            s = in.next();
        }

        in.close();
        System.out.println("Пароль надежен");
    }
}
