package main.java.practice;

public class Sample1 {
    public static void main(String[] args){
   //Widening
//        int myNum = 10;
//        double myDouble = myNum;
//        System.out.println("printing myNum value" + myNum );
//        System.out.println("printing myDouble value" + myDouble );
   //Narrowing
//        int myNum1 = (int) myDouble;
//        System.out.println("printing myNum1 value" + myNum1 );
        //Conditional statements
//        int x = 10;
//        int y = 12;
//        if (x>y){
//            System.out.println("hey there");
//        } else {
//            System.out.println("Condition is false");
//        }
        //ANOTHER IF CONDITION EXAMPLE
        int m = 20;
        int n = 30;
        if (m>n){
            System.out.println("m is greater than n");
        } else if (m<n){
            System.out.println("m is less than n");
        }
        else {
                System.out.println("both the above conditions are false");
        }
        //SWITCH STATEMENT EXAMPLE
        int p = 3;
        switch (p){
            case 1:
                System.out.println("one");
                break;
            case 2:
                System.out.println("two");
                break;
            case 3:
                System.out.println("three");
                break;
            case 4:
                System.out.println("four");
                break;
            default:
                System.out.println("default");
        }

    }
}
