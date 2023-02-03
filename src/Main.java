import java.util.Scanner;

abstract class Figure{
    public abstract String NameFigure();
    public abstract double P();
    public abstract double S();
}
class Triangle extends Figure{
    double a,b,c;
    public String NameFigure(){
    return "треугольник";
    }
    public Triangle (double c,double b, double a){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public String toString(){
        return "a = " + a + "b = " +b +"c= "+c;
    }
    public double P(){
        return a+b+c;
    }
    public double S(){
        double p = a +b+c/2;
        return Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }
}
 class Rectangle extends Figure {
    double a,b;
     public String NameFigure(){
         return "прямоугольник";
     }
    public Rectangle (double b, double a){
        if (a>=0 && b>=0){
        this.a = a;
        this.b = b;
        }
    }
    public String toString(){
        return "a = " + a + "b = " +b;
    }
    public double P(){
        return (a+b)*2;
    }
    public double S(){
        return a*b;
    }
}
class Octagon extends Figure{
    double a;
    public String NameFigure(){
        return "восьмиугольник";
    }
    public Octagon(double a){
        if(a >= 0) {
            this.a = a;
        }
    }

    public String toString() {
        return "a = " + a;
    }
    public double P(){
        return a*8;
    }

    public double S() {
        return (2 * a * a) * (1 + Math.sqrt(2));
    }

}
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Triangle triangle = new Triangle(3,4,5);
        if (in.hasNext(triangle.NameFigure())){
            System.out.println(triangle.toString()+"P = "+triangle.P()+"S = "+triangle.S());
        }
        Rectangle rectangle = new Rectangle(4,8);
        if(in.hasNext(rectangle.NameFigure())){
            System.out.println(rectangle.toString()+"P = "+rectangle.P()+"S = "+rectangle.S());
        }
        Octagon octagon = new Octagon(6);
        if(in.hasNext(octagon.NameFigure())){
            System.out.println(octagon.toString()+"P = "+octagon.P()+"S = "+octagon.S());
        }
        in.close();
    }
}
