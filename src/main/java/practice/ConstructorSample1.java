package main.java.practice;

public class ConstructorSample1 {
    //Creating a default constructor
//    ConstructorSample1(){
//        System.out.println("This is a Constructor");
//    }
//    public static void main(String[] args){
//        ConstructorSample1 cs = new ConstructorSample1();
//    }

    // Example of Default constructor
//    int id;
//    String name;
//    // Display method
//    void display(){
//        System.out.println("ID is " + id + "Name is " + name);
//    }
//    public static void main(String[] args){
//        ConstructorSample1 s1 = new ConstructorSample1();
//        ConstructorSample1 s2 = new ConstructorSample1();
//        s1.display();
//        s2.display();
//    }
    //Parameterized constructor
//    int id;
//    String name;
//    // Constructor creation
//    ConstructorSample1(int i, String n){
//        id = i;
//        name = n;
//    }
    // Display method creation
//    void display(){
//        System.out.println("id is "+ id +"name is "+ name);
//    }
//    public static void main(String[] args){
//        // Object creation and passing values
//        ConstructorSample1 s4 = new ConstructorSample1(101,"John");
//        ConstructorSample1 s5 = new ConstructorSample1(102,"Rachel");
//        s4.display();
//        s5.display();
//    }
    // Constructor overloading
    int id;
    String name;
    int age;
    // two args constructor creation
    ConstructorSample1(int i,String n){
        id = i;
        name = n;
    }
    // three args constructor
    ConstructorSample1(int i, String n, int a){
        id = i;
        name = n;
        age = a;
    }
    void display(){
        System.out.println("Id is " + id + "Name is" + name + "Age is " + age);
    }

    public static void main(String[] args){
        //object creation and passing values
        ConstructorSample1 s7 = new ConstructorSample1(301,"Chris");
        ConstructorSample1 s8 = new ConstructorSample1(302,"Christopher", 25);
        s7.display();
        s8.display();
    }
}
