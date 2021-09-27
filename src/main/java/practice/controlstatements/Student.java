package main.java.practice.controlstatements;


// POJO - plain old java objects
 public class Student {
    final static String college = "WSU";
    private String name;
    private int rollNum;
    private double marks;

    public String getName() {
        return name;
    }

    public void setName(String firstName, String lastName) {
        this.name = lastName + " " +firstName;
    }

    public int getRollNum() {
        return rollNum;
    }

    public void setRollNum(int rollNum) {
        this.rollNum = rollNum;
    }

    public double getMarks() {
        return marks;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }


    //Once a user defines parameterized constructor such as below, JVM won't create a default constructor
    //Default constructor(No args constructor)
    public Student(String name, int rollNum) {
        this.name = name;
        this.rollNum = rollNum;
    }
    public Student(String name, int rollNum,double marks) {
        this(name,rollNum);
        this.marks = marks;
    }


    static void staticMethod() {
        System.out.println("This is staticMethod, frequently called hence made static");
    }

    public void purpose() {
        System.out.println("To study!");
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rollNum=" + rollNum +
                ", marks=" + marks +
                '}';
    }

    void instanceMethod() {
        System.out.println("This is instance method");
    }

}
