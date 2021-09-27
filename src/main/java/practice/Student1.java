package main.java.practice;

public class Student1 {
    int id;
    String name;
    public static void main(String[] args){
        Student1 s1 = new Student1();
        s1.id = 10;
        s1.name = "John";
        System.out.println(s1.id);
        System.out.println(s1.name);
        Student2 s5 = new Student2();
        s5.idno = 505;
        s5.fname = "Chris";
        s5.age = 25;
        System.out.println("ID Num" + s5.idno);
        System.out.println("First Name" + s5.fname);
        System.out.println("Age" + s5.age);
    }
}
