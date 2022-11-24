package laboratotory_1;
import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.print("День рождения: ");
            int day = input.nextInt();

            if (day < 1 | day > 31) {
                System.err.println("Введен неверный день");
                System.exit(1);
            }

            System.out.print("Месяц рождения: ");
            int month = input.nextInt();

            if (month < 1 | month > 12) {
                System.err.println("Введен неверный месяц");
                System.exit(1);
            }

            if ((month == 1) & (day > 31) |
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

            System.out.print("Год рождения: ");
            int year = input.nextInt();
            input.close();

            if (year < 0 | year > 2022) {
                System.err.println("Введен неверный год");
                System.exit(1);
            }

            class current_date {
                private static final int day = 17;
                private static final int month = 11;
                private static final int year = 2022;
            }

            if (month > current_date.month) {
                System.out.println((current_date.year - year - 1) + " лет" + ", " + (current_date.month) + " месяцев" + " и " + (current_date.day - day + " дней"));
            }
            if (day > current_date.day) {
                System.out.println((current_date.year - year) + " лет" + ", " + (current_date.month - month) + " месяцев" + " и " + (current_date.day + " дней"));
            }
            else if ((day==current_date.day)|(month<current_date.month)) {
                System.out.println((current_date.year - year) + " лет" + ", " + (current_date.month - month) + " месяцев" + " и " + (current_date.day - day + " дней"));
            }
    }
}