package laboratory_2;

import java.util.Scanner;
import java.util.regex.*;


public class ex1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Введите дату: ");
        String date = input.nextLine();
        class patterns{
            static final String pattern = "^[0-9][0-9]/[0-9][0-9]/[0-9][0-9][0-9][0-9]";
            static final String pattern1 = "(29|[3-9][0-9])/02/[0-2][0-9][0-9][0-9]";
            static final String pattern2 = "^(0[1-9]|[1-2][0-9]|3[0-1])/(0[1-9]|1[0-2])/(19[0-9][0-9]|[2-9][0-9][0-9][0-9])";
        }
        Pattern p1 = Pattern.compile(patterns.pattern1);
        Matcher match1 = p1.matcher(date);
        Pattern p = Pattern.compile(patterns.pattern);
        Matcher match = p.matcher(date);
        if (!(match.matches())) {
            System.out.println("Введенное выражение не соответствует заданному формату даты dd/mm/yyyy");
            System.exit(0);
        }
        Pattern p2 = Pattern.compile(patterns.pattern2);
        Matcher match2 = p2.matcher(date);
        if (match2.matches()) {
            if(!match1.matches()) {
                System.out.println("Данные корректны");
            }
            else {
                System.out.println("Данные некорректны");
            }

        } else {
            System.out.println("Данные некорректны");
        }

    }
}