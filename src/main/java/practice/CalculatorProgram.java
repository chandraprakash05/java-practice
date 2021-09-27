package main.java.practice;

public class CalculatorProgram {
    int x;
    int y;
    //main method
    public static void main(String[] args){
        CalculatorProgram A = new CalculatorProgram();
        int sum = A.addMethod(100,150);
        System.out.println("Addition is " + sum);
        CalculatorProgram S = new CalculatorProgram();
        S.subtractMethod(150,100);
        CalculatorProgram M = new CalculatorProgram();
//        M.multiplyMethod(10,5);
        CalculatorProgram D = new CalculatorProgram();
        D.divisionMethod(10,5);
        CalculatorProgram sqrt = new CalculatorProgram();
        sqrt.sqrt(25);
//        CalculatorProgram meanObj = new CalculatorProgram();
//        meanObj.mean();
    }
    int addMethod(int a,int b){
        x = a;
        y = b;
        return  x + y;
    }
    void subtractMethod(int a,int b){
        x = a;
        y = b;
        int sub = x - y;
        System.out.println("Subtraction is " + sub);
    }
    double multiply(double a, double b, double c) {
        return multiply(multiply(a, b), c);
    }
    double multiply(double a,double b){
        return a * b;
    }
    void divisionMethod(int a,int b){
        x = a;
        y = b;
        int division = x / y;
        System.out.println("Division is " + division);
    }
    void sqrt(double sq){
       double x = sq;
        System.out.println("Sqrt is " + Math.sqrt(x));
    }
//    void mean(int k){
//        int n = k;
//        double resultValue;
//        int a[] = new int[n];
//        for(int i=0;i<n;i++)
//            resultValue = resultValue + a[i];
//        System.out.println("Mean is" + resultValue/n);
//    }
}