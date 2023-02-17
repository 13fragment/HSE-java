package laboratory_5;
class Fractions{
    protected int[]fraction1={0,0};
    protected int[]fraction2 = {1,1};

    public void setFractions(int numerator_1, int denominator_1)throws Exception{
        this.fraction1[0]=numerator_1;
        this.fraction1[1]=denominator_1;
        if (denominator_1 == 0){
            throw new Exception("Деление на 0");
        }
    }

    public void setFractions(int numerator_1, int denominator_1,int numerator_2, int denominator_2)throws Exception{
        this.fraction1[0]=numerator_1;
        this.fraction1[1]=denominator_1;
        this.fraction2[0]=numerator_2;
        this.fraction2[1]=denominator_2;
        if (denominator_1 == 0|denominator_2==0){
            throw new Exception("Деление на 0");
        }
    }
    protected String summary(int[]fraction1){
        if (fraction1[0]==0){
         return fraction2[0]+"/"+fraction2[1];
        }else{
        return fraction1[0]+fraction1[1]+"/"+fraction1[1];
        }
    }
    protected String summary(int[]fraction1,int[]fraction2){
        if(fraction1[0]==0){
            return fraction2[0]+"/"+fraction2[1];
        }
        if(fraction2[0]==0){
            return fraction1[0]+"/"+fraction1[1];
        }
        else{
        fraction2[0] = fraction2[0]*fraction1[1];
        fraction1[0] = fraction1[0]*fraction2[1];
        fraction1[1] = fraction1[1]*fraction2[1];
        return fraction1[0]+fraction2[0]+"/"+fraction1[1];
        }
    }
    protected String subtraction(int[]fraction1){
        fraction2[0]=fraction1[1]*fraction2[0];
        fraction2[1]=fraction1[1]*fraction2[0];
        return fraction1[0]-fraction2[0]+"/"+fraction1[1];
    }
    protected String subtraction(int[]fraction1,int[]fraction2){
        if(fraction1[0]==0){
            return -fraction2[0]+"/"+fraction2[1];
        }
        if(fraction2[0]==0){
            return fraction1[0]+"/"+fraction1[1];
        }else{
        fraction2[0] = fraction2[0]*fraction1[1];
        fraction1[0] = fraction1[0]*fraction2[1];
        fraction1[1] = fraction1[1]*fraction2[1];
        return fraction1[0]-fraction2[0]+"/"+fraction1[1];
        }
    }
    protected String multiplication(int[]fraction1){
        if (fraction1[0]==0){
            return "0";
        }else{
        return fraction1[0]+"/"+fraction1[1];
        }
    }
    protected String multiplication(int[]fraction1,int[]fraction2){
        if (fraction1[0]==0|fraction2[0]==0){
            return "0";
        }else{
            return fraction1[0]*fraction2[0]+"/"+ fraction1[1]*fraction2[1];
        }
    }
    protected String division(int[]fraction1){
        if (fraction1[0]==0){
            return "0";
        }else{
            return fraction1[0]+"/"+ fraction1[1];
        }
    }
    protected String division(int[]fraction1,int[]fraction2)throws Exception{
        if (fraction1[0]==0){
            return "0";
        }
        if (fraction2[0] == 0){
            throw new Exception("Деление на 0");
        }
        else{
            return fraction1[0]*fraction2[1]+"/"+ fraction1[1]*fraction2[0];
        }
    }
}
public class Ex {
    public static void main(String[] args) {
    Fractions fractions = new Fractions();
        try{
        fractions.setFractions(2,5);
        System.out.println(fractions.division(fractions.fraction1));
        fractions.setFractions(1,0,2,6);
        System.out.println(fractions.division(fractions.fraction1, fractions.fraction2));
        }catch (Exception e){
            System.out.println("division on 0");
        }
    }
    /*
    ДОБАВИТЬ ОБРАБОКТУ ОШИБКИ введенного неверного типа
     */
}
