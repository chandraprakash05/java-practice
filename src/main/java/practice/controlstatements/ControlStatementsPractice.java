package main.java.practice.controlstatements;

public class ControlStatementsPractice {
    public static void main(String[] args){
        Student student1 = new Student("Chandra",505,100);
        Student student2 = new Student("Rahul",511,90);
        // ==      equal to
        // !=      not equal to
        // >       greater than
        // >=      greater than or equal to
        // <       less than
        // <=      less than or equal to
        if(student1.getMarks() > student2.getMarks()){
            System.out.println("winner is Student1: " + student1.getName());
        }else{
            System.out.println("winner is Student2" + student2.getName());
        }
        // TODO - print who comes first based on rollnum
        if(student1.getRollNum() < student2.getRollNum()){
            System.out.println("Student1 gets first call" + student1.getName());
        }else {
            System.out.println("Student2 gets first call" + student2.getName());
        }
    }
}
