package main.java.practice.loops;

public class ForLoopPractice {
    public static void main(String[] args) {
    //    String name = "Sravan";
//        for (int i = 0; i < 10; i++) {
//            if (i < 9) {
//                System.out.print(name+", ");
//            } else {
//                System.out.print(name);
//            }
//        }
//        for (int i = 10; i >= 0; i -= 2) {
//            System.out.println(i);
//        }
        //Print Right angle triangle
        //*
        //* *
        //* * *
        //* * * *
        //* * * * *
//        for(int i=1;i<=5;i++){
//            for(int j=1;j<=i;j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
        //Print Square Pattern
//        for(int i=1;i<=5;i++){
//            for(int j=1;j<=5;j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

        // Print hollow square

        // Print a diamond

        // find if a given number is prime using for loop

        // print diagonal line

        // print a circle with a center

        /*
        // Print hollow square
        // i = 1 => inside if => j = 1 to 5 => * * * * *  => println
        // i = 2 => inside else
        for (int i = 1; i <= 5; i++) {

            if (i == 1 || i == 5) {
                for (int j = 1; j <= 5; j++) {
//                if(i==1||i==5){
                    System.out.print("* ");
                }
//                else(i>1&&i<5){
//                    System.out.println("*     *");
//                }
            } else {
                System.out.print("*       *");
            }

            System.out.println();
        }
        */
        printHollowSquare(10);

    }

    // i=0,j=0 => *
    static void printHollowSquare(int n) {

        for(int i = 0; i<n; i++) {
            for( int j = 0; j<n; j++) {
                if(i==0 || i==n-1 || j==0 || j==n-1) {
                    System.out.print("* ");
                    continue;
                }
                System.out.print("  ");
            }
            System.out.println();
        }
    }
}
