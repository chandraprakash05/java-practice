package main.java.practice;

public class Methods1 {
    //METHOD1 EXAMPLE
//    static void myMethod(){
//        System.out.println("hey there!");
//    }
//
//    public static void main(String[] args){
//        myMethod();
//        myMethod();
//        myMethod();
    //METHOD2 EXAMPLE(Parameters and Arguments)
//    static void myMethod2(String fname){
//        System.out.println(fname + "hems");
//    }
//    public static void main(String[] args){
//        myMethod2("hell");
//        myMethod2("lou");
//        myMethod2("clar");
//    }
    //METHOD3 EXAMPLE(Multiple parameters)
//
    //RETURN VALUES
//    static int myMethod4(int x, int y){
//        return x + y;
//    }
//    public static void main(String[] args){
//        int z = myMethod4(3,5);
//        System.out.println(z);
//    }
    //if else in method5
    static void myMethod5(int age){
        if (age < 18){
            System.out.println("access denied");
        } else {
            System.out.println("Access granted");
        }
    }
    public static void main(String[] args){
        myMethod5(20);
    }

}
