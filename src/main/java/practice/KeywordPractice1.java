package main.java.practice;

public class KeywordPractice1 {
    int empid;
    double salary;
    int age;
    static String cName = "HCL";
    static void change1(){
        cName = "Infy";
    }
    KeywordPractice1(int empid, double salary, int age){
        this.empid = empid;
        this.salary = salary;
        this.age = age;
    }
    void displayInfo(){
        System.out.println("Empid" + empid + "Salary" + salary + "Age" + age + "Company Name" + cName);
    }
    public static void main(String[] args){
        KeywordPractice1.change1();
        KeywordPractice1 k1 = new KeywordPractice1(101,50000,27);
        KeywordPractice1 k2 = new KeywordPractice1(102,65000,29);
        k1.displayInfo();
        k2.displayInfo();
    }
}
