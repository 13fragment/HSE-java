package final_lab;

import java.util.Scanner;

class Fractions{
    protected String getValue(){
        Scanner in = new Scanner(System.in);
        String s = in.next();
        in.close();
    return s;
    }
}
public class Calc {
    public static void main(String[] args) {
        Fractions fractions = new Fractions();
        System.out.println(fractions.getValue());
    }
}
