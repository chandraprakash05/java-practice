package main.java.practice.loops;

import java.util.Arrays;

public class ForEachPractice {
    public static void main(String[] args){
        //declared int array of length 10
        int[] intArray = new int[10];
        System.out.println("intArray.length = " + intArray.length);
        // accessing array elements using a for loop
//        for(int i=0;i<intArray.length;i++){
//            System.out.print(intArray[i]);
//        }

        // Arrays is a utility class for arrays
        // toString(array_argument_here) returns the given array as a string
        System.out.println("intArray => "+ Arrays.toString(intArray));

//        intArray[0] = 0;
//        intArray[1] = 1;
//        intArray[2] = 2;
//        intArray[3] = 3;
//        intArray[4] = 4;
//        intArray[5] = 5;
//        intArray[6] = 6;
//        intArray[7] = 7;
//        intArray[8] = 8;
//        intArray[9] = 9;

//        updates array with values [2, 4, 6, 8, 10, 12, 14, 16, 18, 20]
//        for(int i=1;i<=intArray.length;i++){
//            intArray[i-1] = 2*i;
////            System.out.println(intArray[i]);
//        }
//          [20,18,16,14,12,10,8,6,4,2]
        // i= 0, 1, 2, 3, 4, 5,6,7,8,9
        // 0 -> 20  = (intArray.length - 0) * 2
        // 9 -> 2   = (intArray.length - 9) * 2
//        for(int i= intArray.length;i>=1;i--){
//            intArray[10-i] = 2*i;
//        }
        for(int i=0;i<intArray.length;i++){
            intArray[i] = (intArray.length - i) * 2;
        }
        //ArrayIndexOutOfBoundsException -> error occurs when we try to access an array index that is out of range
        System.out.println("intArray => "+ Arrays.toString(intArray));

    }
}
