package final_lab;
import java.util.Arrays;
import java.util.Scanner;
class Fractions{
    protected String getValue(){
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        in.close();
    return s;
    }
    protected String [] sortElements(){
        String [] g = getValue().split(" ");
        return g;
    }
}
public class Calc {
    public static void main(String[] args) {
        Fractions fractions = new Fractions();
        System.out.println(Arrays.toString(fractions.sortElements()));
//    1/2 + 1/3 = 5/6
    }
}
