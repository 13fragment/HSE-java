import java.util.*;

public class Test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        String s1[] = s.split(" ");
        ArrayList<String>a = new ArrayList<>();
        for (int i=0;i<s1.length;i++){
            a.add(s1[i]);
        }
        int numerator1;
        int denominator1;
        int numerator2;
        int denominator2;
        while (a.size()!=1){
        String arOperation = a.get(1);
        String fraction1[] = a.get(0).split("/");
        numerator1 = Integer.parseInt(fraction1[0]);
        denominator1 = Integer.parseInt(fraction1[1]);
        String fraction2[]= a.get(2).split("/");
        numerator2 = Integer.parseInt(fraction2[0]);
        denominator2 = Integer.parseInt(fraction2[1]);
        if (arOperation== "+"){
            numerator2 = numerator2*denominator1;
            numerator1 = numerator1*denominator2;
            denominator1 = denominator1*denominator2;
        }
        numerator2 = numerator2*denominator1;
        numerator1 = numerator1*denominator2;
        denominator1 = denominator1*denominator2;
        String result = numerator1+numerator2+"/"+denominator1;
        a.add(0,result);
        for(int i =0;i<3;i++){
        a.remove(1);}}
        System.out.println(a.get(0));
    }
}