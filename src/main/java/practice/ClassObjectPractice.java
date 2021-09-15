package main.java.practice;

// JVM has Class , Heap and Stack memory areas
// Instance objects are stored in Heap (specific to each object created, hence the name instance variable or method)
// Static variables are stored in Class area (Common to all objects)
// Stack holds frames. Each frame is crated by JVM when a new method is called. And destroyed when method execution is done
// Instantiation - creating new instance or object of a class
// Initialization - assigning values to instance variables
public class ClassObjectPractice {

    // instance variable or non-static variable
    // gets memory in object and object will be stored in heap
    int classId;

    public static void main(String[] args) {
        ClassObjectPractice classObjectPractice = createObject();
        System.out.println("Checking to see if instance is created - " + classObjectPractice);

        // static methods can access non-static methods only using objects
//        System.out.println("Class name - " + classObjectPractice.getClassName());
        classObjectPractice.someMethod();
        Operators operatorsObj = new Operators();
        operatorsObj.addTwoNumbers(1, 2);
    }

    static ClassObjectPractice createObject() {
        ClassObjectPractice obj1 = new ClassObjectPractice();
        return obj1;
    }

    String getClassName() {
        return "ClassObjectPractice";
    }

    void someMethod() {
        // Non-static methods are allowed to access all variables and methods in the class
        getClassName();
        createObject();
    }

}
