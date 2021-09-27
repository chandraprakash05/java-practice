package main.java.practice;

public class ConstructorPractice {

    String purpose;
    int id;

    // This is a default constructor
    // Name same as class, no explicit return type
    // Default constructor shouldn't have any input parameters
//    ConstructorPractice() {}

    ConstructorPractice(String givenPurpose, int givenId ){
        purpose = givenPurpose;
        id = givenId;
    }

    public static void main(String[] args){
        ConstructorPractice constructorPractice = new ConstructorPractice("Practicing constructors", 5);
        System.out.println(constructorPractice);
    }

    // \ (back-slash) is escape character to let JVM ignore the adjacent character
//    @Override
//    public String toString() {
//        return "ConstructorPractice{" +
//                "purpose=\"" + purpose + "\"" +
//                ", id=" + id +
//                '}';
//    }
}
