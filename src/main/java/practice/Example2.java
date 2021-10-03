package main.java.practice;

import java.util.Arrays;

public class Example2 {
 /*   //main method
    public static void main(String[] args){
        //Array declaration and instantiation
        int array1[] = new int[5];
        //Array initializing
        array1[0] = 10;
        array1[1] = 20;
        array1[2] = 30;
        array1[3] = 40;
        array1[4] = 50;
        //Array Traversing
        for(int i = 0;i<array1.length;i++){
            System.out.println(array1[i]);
        }
*/

        public static void main(String[] args){
        int array2[] = {10,20,30,40,50};
        printAnIntegerArray(array2);
//        for(int i:array2)
//        {
//            System.out.print(i);
//            System.out.print(", ");
//        }
//
//        System.out.println("array2 = " + Arrays.toString(array2));
//        System.out.println("before loop");
//        //Traversing the array
//          for(int i=0;array2.length<5;i++){
//              System.out.println(array2[i]);
//          }
//        System.out.println("after loop");
//
    }
        private static void printAnIntegerArray(int[] array){
            System.out.println("Array = "+ Arrays.toString(array));
        }

}
