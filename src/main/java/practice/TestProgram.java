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
        TestProgram testProgram = new TestProgram();
        System.out.println("Default value of testProgramId - " + testProgram.testProgramId1);
        System.out.println("Default value of testProgramId - " + testProgram.testProgramId2);

//        // Object creation or also called instantiation i.e., creating an instance
//        TestProgram testProgram1 = new TestProgram();
//        TestProgram testProgram2 = new TestProgram();`
//        // prints out unique hash or memory location value for each object
//        System.out.println("testProgram memory location or hash - "+testProgram1);
//        System.out.println("testProgram memory location or hash - "+testProgram2);

//        System.out.println(TestProgram.PI_VALUE);
//        Student chandra = new Student();
//        chandra.name = "Chandra Prakash";
//        chandra.rollNum = 1;
//        chandra.college = "WSU1";
//
//        Student abhilash = new Student();
//        abhilash.name = "Abhilash";
//        abhilash.rollNum = 2;
//        abhilash.college = "WSU2";
//
//        System.out.println("Student " + chandra.name + " roll number is - "+ chandra.rollNum + " studying in college - "+ chandra.college);
//        System.out.println("Student " + abhilash.name + " roll number is - "+ abhilash.rollNum + " studying in college - "+ abhilash.college);
//
//        Student.college="SAU";
    }
}

class Student {
    String name;
    int rollNum;
    static String college = "WSU";

    public static void purpose() {
        System.out.println("To study!");
    }

    void method1() {
        System.out.println("This is method1");
    }
}