package main.java.util;

import main.java.practice.MethodPractice;

public class MethodPractice2 {

    public static void main(String[] args) {
        MethodPractice2 myCar = new MethodPractice2();
        myCar.fullThrottle();
        myCar.speed(50);

        MethodPractice methodPracticeObj = new MethodPractice();
    }

    public void fullThrottle() {
        System.out.println("fullthrottle");
    }

    public void speed(float x) {
        System.out.println("speed is" + x);
    }

}
