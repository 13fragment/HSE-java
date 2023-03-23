package final_lab;
import java.util.Objects;
import java.util.Scanner;
class FractionSort {
    public static String operations(String exp) {
        String[] arr_fr;
        Fractions fr1, fr2;
        String[] arr;
        int index = 1;
        while (exp.contains("*")) {
            arr = exp.split(" ");
            if (Objects.equals(arr[index], "*")) {
                arr_fr = arr[index - 1].split("/");
                fr1 = new Fractions(Integer.parseInt(arr_fr[0]), Integer.parseInt(arr_fr[1]));
                arr_fr = arr[index + 1].split("/");
                fr2 = new Fractions(Integer.parseInt(arr_fr[0]), Integer.parseInt(arr_fr[1]));
                arr[index] = Fractions.toString(Fractions.multiplication(fr1, fr2));
                String arr_str = String.join(" ", arr);
                arr_str = arr_str.replace(arr[index - 1] + " ", "");
                arr_str = arr_str.replace(" " + arr[index + 1], "");
                exp = arr_str;
            } else
                index += 2;
        }
        while (exp.contains(":")) {
            arr = exp.split(" ");
            if (Objects.equals(arr[index], ":")) {
                arr_fr = arr[index - 1].split("/");
                fr1 = new Fractions(Integer.parseInt(arr_fr[0]), Integer.parseInt(arr_fr[1]));
                arr_fr = arr[index + 1].split("/");
                fr2 = new Fractions(Integer.parseInt(arr_fr[0]), Integer.parseInt(arr_fr[1]));
                arr[index] = Fractions.toString(Fractions.division(fr1, fr2));
                String arr_str = String.join(" ", arr);
                arr_str = arr_str.replace(arr[index - 1] + " ", "");
                arr_str = arr_str.replace(" " + arr[index + 1], "");
                exp = arr_str;

            } else
                index += 2;
        }
        index = 1;
        while (exp.contains(" - ")) {
            arr = exp.split(" ");
            if (Objects.equals(arr[index], "-")) {
                arr_fr = arr[index - 1].split("/");
                fr1 = new Fractions(Integer.parseInt(arr_fr[0]), Integer.parseInt(arr_fr[1]));
                arr_fr = arr[index + 1].split("/");
                fr2 = new Fractions(Integer.parseInt(arr_fr[0]), Integer.parseInt(arr_fr[1]));
                arr[index] = Fractions.toString(Fractions.substraction(fr1, fr2));
                String arr_str = String.join(" ", arr);
                arr_str = arr_str.replace(arr[index - 1] + " ", "");
                arr_str = arr_str.replace(" " + arr[index + 1], "");
                exp = arr_str;

            } else
                index += 2;
        }
        while (exp.contains("+")) {
            arr = exp.split(" ");
            if (Objects.equals(arr[index], "+")) {
                arr_fr = arr[index - 1].split("/");
                fr1 = new Fractions(Integer.parseInt(arr_fr[0]), Integer.parseInt(arr_fr[1]));
                arr_fr = arr[index + 1].split("/");
                fr2 = new Fractions(Integer.parseInt(arr_fr[0]), Integer.parseInt(arr_fr[1]));
                arr[index] = Fractions.toString(Fractions.summarise(fr1, fr2));
                String arr_str = String.join(" ", arr);
                arr_str = arr_str.replace(arr[index - 1] + " ", "");
                arr_str = arr_str.replace(" " + arr[index + 1], "");
                exp = arr_str;

            } else
                index += 2;
        }
        return exp;
    }
}
class Fractions {
    int numerator;
    int denominator;
    protected Fractions(int numerator, int denominator) throws ArithmeticException{
        this.numerator = numerator;
        this.denominator = denominator;
        if (denominator == 0) {throw new ArithmeticException();}
    }
    protected static String toString(Fractions fractions){
        return fractions.numerator + "/" + fractions.denominator;
    }

    protected static Fractions summarise(Fractions fr1, Fractions fr2) {
        return new Fractions(fr1.numerator * fr2.denominator + fr2.numerator * fr1.denominator, fr1.denominator * fr2.denominator);
    }

    protected static Fractions substraction(Fractions fr1, Fractions fr2) {
        return new Fractions(fr1.numerator * fr2.denominator - fr2.numerator * fr1.denominator, fr1.denominator * fr2.denominator);
    }

    protected static Fractions multiplication(Fractions fr1, Fractions fr2) {
        return new Fractions(fr1.numerator * fr2.numerator, fr1.denominator * fr2.denominator);
    }

    public static Fractions division(Fractions fr1, Fractions fr2) {
        return new Fractions(fr1.numerator * fr2.denominator, fr2.numerator * fr1.denominator);
    }
}
public class Calc {
    public static void main(String[] args) throws Exception{
        System.out.println("Введите выражение вида (Число, пробел, арифметический знак, пробел, число: ");
        Scanner in = new Scanner(System.in);
        String exp = in.nextLine();
        in.close();
        try {
            String [] arr_res = FractionSort.operations(exp).split("/");
            int res_num = Integer.parseInt(arr_res[0]);
            int res_den = Integer.parseInt(arr_res[1]);
            if (res_num <0 && res_den <0){
                res_num = res_num * (-1);
                res_den = res_den *(-1);
            }
            int diviver = Reduction.reduce(res_num, res_den);
            if (res_den == 0){
                throw new Exception("Деление на 0");
            }
            if (res_den / diviver == 1) {
                System.out.println(res_num / diviver);
            }
            else {
                if (res_num == 0) {
                    System.out.println("0");
                }
                else{
                    System.out.println(res_num / diviver + "/" + res_den / diviver);
                }
            }
            }
        catch (ArithmeticException e){
            System.err.println("Деление на 0");
        }
        catch (Exception e) {
            System.err.println("Некорректное выражение");
        }
    }
}
class Reduction {
    public static int reduce(int numerator_res, int denominator_res) {
        numerator_res = Math.abs(numerator_res);
        denominator_res = Math.abs(denominator_res);
        if (numerator_res > 0 && denominator_res > 0) {
            while (numerator_res != denominator_res) {
                if (numerator_res > denominator_res){
                    numerator_res = numerator_res - denominator_res;
                }
                else denominator_res = denominator_res - numerator_res;
            }
            return numerator_res;
        }
       else return 1;
    }
}