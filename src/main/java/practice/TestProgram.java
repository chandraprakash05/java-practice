package main.java.practice;


class TestProgram {
    // const example
    static final double PI_VALUE = 3.14;
    Integer testProgramId1;
    int testProgramId2;

    public static void main(String[] args) {

        // Default value of an instance variable
        // actual default values for primitive types
        // for classes or different types - null
//        TestProgram testProgram = new TestProgram();
//        System.out.println("Default value of testProgramId - " + testProgram.testProgramId1);
//        System.out.println("Default value of testProgramId - " + testProgram.testProgramId2);

//        // Object creation or also called instantiation i.e., creating an instance
//        TestProgram testProgram1 = new TestProgram();
//        TestProgram testProgram2 = new TestProgram();`
//        // prints out unique hash or memory location value for each object
//        System.out.println("testProgram memory location or hash - "+testProgram1);
//        System.out.println("testProgram memory location or hash - "+testProgram2);

//        System.out.println(TestProgram.PI_VALUE);
        Student chandra = new Student("Chandra Prakash", 1);
//        chandra.name = "Chandra Prakash";
//        chandra.rollNum = 1;
//        chandra.college = "WSU1";
        System.out.println(chandra);

        Student abhilash = new Student("Abhilash", 2);
//        abhilash.name = "Abhilash";
//        abhilash.rollNum = 2;
//        abhilash.college = "WSU2";
        System.out.println(abhilash);

//        System.out.println("Student " + chandra.name + " roll number is - "+ chandra.rollNum + " studying in college - "+ chandra.college);
//        System.out.println("Student " + abhilash.name + " roll number is - "+ abhilash.rollNum + " studying in college - "+ abhilash.college);
//
//        Student.college="SAU";
    }
}

// POJO - plain old java objects
class Student {
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
    Student(String name, int rollNum) {
        this.name = name;
        this.rollNum = rollNum;
    }
    Student(String name, int rollNum,double marks) {
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