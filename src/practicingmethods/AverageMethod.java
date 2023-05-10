package practicingmethods;

public class AverageMethod {
    public static void main(String[] args) {

        System.out.println(average(2,5,8));

    }

    public static double sum(double num1, double num2, double num3){
        return (num1+num2+num3);
    }

    public static double average(double num1,double num2, double num3 ){
        sum(num1,num2,num3);

        return (sum(num1,num2,num3)/3);
    }


}
