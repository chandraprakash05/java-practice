package main.java.practice;

public class MethodPractice {
    //method practice
//    public static void main(String[] args){
//      createMethod1();
//      createMethod1();
//    }
//    static void createMethod1(){
//        System.out.println("This is Method1");
//    }
    //anothermethod creation
//    public static void main(String[] args){
//        anotherMethod1("John");
//    }
//    static void anotherMethod1(String fname){
//        System.out.println(fname +" " + "Res");
//    }
//    public static void main(String[] args){
//        method2("John", 25, 5.11f);
//    }
//    static void method2(String fname, int age, float height){
//        System.out.println("Name " + fname +" " + "Age"+ age + " " + "Height" + height);
//    }
    //method3
//    public static void main(String[] args){
//       float z = methodPractice3(3);
//        System.out.println(z);
//    }
//    static int methodPractice3(int x){
//        return 5 + x;
//    }
    //newmethod
//    public static void main(String[] args){
//        int z = newMethod1(2,5);
//        System.out.println(z);
//    }
//    static int newMethod1(int x, int y){
//      return x + y;
//    }
    //Static method and public method example
    public static void main(String[] args) {
        //calling static method
        MethodPractice.staticMethod();

        //accessing public method
        MethodPractice myObject = new MethodPractice();
        myObject.publicMethod();
    }

    public void publicMethod() {
        System.out.println("This is public method");
    }

    private void privateMethod() {
        System.out.println("This is public method");
    }

    protected void protectedMethod() {
        System.out.println("This is public method");
    }

    void defaultMethod() {
        System.out.println("This is public method");
    }

    static void staticMethod() {
        System.out.println("This is static method");
    }
}
