package laboratotory_1;

import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите день: ");
        int day = input.nextInt();
        System.out.print("Введите месяц: ");
        int month = input.nextInt();
        input.close();
        if      ((month == 1) & (day>30)  |
                (month == 2) & (day > 29) |
                (month == 3) & (day > 31) |
                (month == 4) & (day > 30) |
                (month == 5) & (day > 31) |
                (month == 6) & (day > 30) |
                (month == 7) & (day > 31) |
                (month == 8) & (day > 31) |
                (month == 9) & (day > 30) |
                (month == 10) & (day > 31) |
                (month == 11) & (day > 30) |
                (month == 12) & (day > 31)
        ) {
            System.err.println("В этом месяце меньше дней");
            System.exit(1);
        }
        if (month == 12 | month == 1 | month == 2){
            System.out.println("зима");
        }
        if (month == 3 | month == 4 | month == 5){
            System.out.println("весна");
        }
        if (month == 6 | month == 7 | month == 8){
            System.out.println("лето");
        }
        if (month == 9 | month == 10 | month == 11){
            System.out.println("осень");
        }
    }
}
