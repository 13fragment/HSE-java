import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите размерность массива: ");
        int size = in.nextInt();
        float [] a = new float[size];
        float [] a2 = new float[size-1];
        String tmp ="";
        for (int i =0;i<a.length;i++){
            a[i]=in.nextFloat();
        }
        for (int m = 0; m<a.length-1;m++){
            if (a[m+1]<a[m]){
                a2[m] = a[m];
                }
         }
        for (int m = 0; m<a2.length-1;m++){
            if (a2[m+1]<a2[m]){
                tmp+=a2[m]+" ";
            }
        }
        if (a[a.length-1]>a[a.length-2]) tmp += a[a.length - 1];
        System.out.print("Искодный массив: ");
        for (float elem:a){
            System.out.print(elem+" ");
        }
        System.out.println("\n"+"Обработанный массив: "+tmp);
    }
}