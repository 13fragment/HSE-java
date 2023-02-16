package laboratory_5;
class Fractions{
    protected int[]fraction1={0,0};
    protected int[]fraction2 = {1,1};

    public void setFractions(int numerator_1, int denominator_1){
        this.fraction1[0]=numerator_1;
        this.fraction1[1]=denominator_1;
    }

    public void setFractions(int numerator_1, int denominator_1,int numerator_2, int denominator_2){
        this.fraction1[0]=numerator_1;
        this.fraction1[1]=denominator_1;
        this.fraction2[0]=numerator_2;
        this.fraction2[1]=denominator_2;
    }
    protected String summary(int[]fraction1){
        fraction1[0] = fraction1[0]+fraction1[1];
        return fraction1[0]+"/"+fraction1[1];
    }
    protected String summary(int[]fraction1,int[]fraction2){
        fraction2[0] = fraction2[0]*fraction1[1];
        fraction1[0] = fraction1[0]*fraction2[1];
        fraction1[1] = fraction1[1]*fraction2[1];
        return fraction1[0]+fraction2[0]+"/"+fraction1[1];
    }
}

public class Ex {
    public static void main(String[] args) {
    Fractions fractions = new Fractions();
        fractions.setFractions(7,8);
        System.out.println(fractions.summary(fractions.fraction1));
        fractions.setFractions(7,8,9,6);
        System.out.println(fractions.summary(fractions.fraction1, fractions.fraction2));
    }
}
