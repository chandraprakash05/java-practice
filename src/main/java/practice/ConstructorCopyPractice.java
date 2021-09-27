package main.java.practice;

public class ConstructorCopyPractice {
    int id;
    String name;


    ConstructorCopyPractice(int i, String n) {
        id = i;
        name = n;
    }

    // Parameter s can be considered as local variable
    ConstructorCopyPractice(ConstructorCopyPractice s) {
        id = s.id;
        name = s.name;
        System.out.println(" s = " + s.toString().split("@")[1]);
    }

    public static void main(String[] args) {
        ConstructorCopyPractice s1 = new ConstructorCopyPractice(111, "Karan");
        System.out.println(" s1 = " + s1.toString().split("@")[1]);
        ConstructorCopyPractice s2 = new ConstructorCopyPractice(s1);
        s1.display();
        s2.display();
    }

    void display() {
        System.out.println(id + " " + name);
    }
}
