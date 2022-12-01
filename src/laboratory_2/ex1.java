package laboratory_2;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ex1 {
    public static void main(String[] args) {

        class output{
            static final String valid = "Введеное выражение является датой";
            static final String invalidDate = "Введеное выражение не является датой";
            static final String invalidFormat = "Введеное выражение не соответсвует заданому формату даты dd/mm/yyyy";
        }

        Scanner input = new Scanner(System.in);
        System.out.print("Дата: ");
        String s = input.next();
        input.close();

        String Regexp = "[0-9]+/[0-9]+/[0-9]+";


        input.close();

        Pattern p = Pattern.compile(Regexp);
        Matcher m = p.matcher(s);
        boolean Result = m.matches();

        if (Result == true){
            System.out.println(output.valid);
        }
        else{
            System.out.println(output.invalidFormat);
        }

    }
}
