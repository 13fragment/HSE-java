package laboratotory_1;

import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("День: ");
        int day = input.nextInt();
        if (day>31| day<1){
            System.err.println("Неверное количество дней");
            System.exit(1);
        }
        System.out.print("Месяц: ");
        int month = input.nextInt();
        if (month<1| month>12){
            System.err.println("Указан неверный месяц");
            System.exit(1);
        }
        input.close();
        if (        (month == 2) & (day > 29) |
                    (month == 4) & (day > 30) |
                    (month == 6) & (day > 30) |
                    (month == 9) & (day > 30) |
                    (month == 11) & (day > 30)
            ) {
                System.err.println("В этом месяце меньше дней");
                System.exit(1);
            }
            if (month == 12 | month == 1 | month == 2) {
                System.out.println("зима");
            }
            if (month == 3 | month == 4 | month == 5) {
                System.out.println("весна");
            }
            if (month == 6 | month == 7 | month == 8) {
                System.out.println("лето");
            }
            if (month == 9 | month == 10 | month == 11) {
                System.out.println("осень");
            }
    }
}