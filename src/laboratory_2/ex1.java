package laboratory_2;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ex1 {
    public static void main(String[] args) {
        System.out.print("Введите дату: ");
        Scanner in = new Scanner(System.in);
        String date = in.next();
        in.close();
        class patterns{
            static final Pattern p1 = Pattern.compile("([0-9]|1[0-9]|2[0-9]|3[0-1])/([0-9]|1[0-2])/((19[0-9][0-9])|([2-9][0-9][0-9][0-9]))");
            static final Pattern p2 = Pattern.compile("\\.{1,}|,{1,}");
        }

        Matcher m1 = patterns.p1.matcher(date);
        Matcher m2 = patterns.p2.matcher(date);

        if((m1.matches())&(!m2.find())){
            System.out.println("Введенное выражение является датой");
        }
        else if (m2.find()){
            System.err.println("Введенное выражение не соответствует заданному формату даты dd/mm/yyyy");
        }
        else {
            System.err.println("Введенное выражение не является датой");
        }
    }
}