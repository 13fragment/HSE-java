class Triangle{
    double a,b,c;
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
 class Rectangle{
    double a,b;
    public Rectangle (double b, double a){
        this.a = a;
        this.b = b;
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
public class Main {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(3,4,5);
        System.out.println(triangle.P());
        Rectangle rectangle = new Rectangle(4,5);
        System.out.println(rectangle.toString()+" S = "+rectangle.S());
    }
}