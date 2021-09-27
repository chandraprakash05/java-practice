package main.java.practice;

public class Sample5 {
    int x;
    int y;
    public void addOperation(int a,int b){
        x = a;
        y = b;
        int add = x + y;
        System.out.println("Addition is " + add);
    }
    public static void main(String[] args){
        Sample5 Obj1 = new Sample5();
        Obj1.addOperation(100,150);
    }
}
