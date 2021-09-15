package main.java.practice;

public class Operators {
    public static void main(String[] args) {
//        int tempVar = 5;
//        System.out.println("tempVar = " + tempVar);
//        System.out.println("tempVar = " + (++tempVar) + (" before post incrementing value = " + tempVar));
//        tempVar++;
//        System.out.println("tempVar = "+tempVar);
////        int sum = addTwoNumbers(3,4);
////        System.out.println("Sum of twoNum = " + sum);
//        boolean tempBoolVar = true;
//        System.out.println("tempBoolVar = "+ tempBoolVar + " after negation - " + (!tempBoolVar));
//        System.out.println(22<<28);
//        System.out.println(Math.pow(2,28)*22);
        int a = 10;
        int b = 5;
        int c = 20;
        System.out.println(a > b && ((b = c) == c) && a < b);//false && true = false
//        System.out.println(a>b
//                &&
//                (c==(b=c)));//false && true = false
        System.out.println(a < b & a < c);//false & true = false

//        TODO - have to learn about ^/XOR
    }

    int addTwoNumbers(int a, int b) {
        return a + b;
    }
}

