package laboratotory_1;

import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("x: ");
        int x = input.nextInt();
        System.out.print("n: ");
        int n = input.nextInt();
        input.close();
        int power = x;
        float one = 1;
        float power_2 = one / x;
        if (n >0) {
            int f =1;
            while (f<n) {
                f++;
                power = power * x;
            }
                System.out.println(power);

            }
        if(n==0){
            System.out.println(1);
        }
        else {
            int f =-1;
            while (f>n) {
                f--;
                power_2 = power_2 * one/x;
            }
            System.out.println(power_2);
        }
    }
}