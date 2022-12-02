package laboratory_2;
import java.util.Scanner;
import java.util.regex.*;
public class ex2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Введите пароль: ");

        while (true) {
            if (input.hasNextLine()){
                String date = input.nextLine();
                String pattern1 = "((?=.*[a-z])(?=.*[A-Z])(?=.*\\d)[0-9a-zA-Z_]{8,})";
                Pattern p1 = Pattern.compile(pattern1);
                Matcher match1 = p1.matcher(date);
                if (match1.matches()) {
                    System.out.println("Пароль надёжный");
                    System.exit(0);
                }
                else {

                    System.out.println("Пароль ненадёжный"+"\n"+"Повторите ввод");
                }
            }

        }
    }
}