package main.java.practice;

import java.util.Arrays;

public class StringsPractice {
    public static void main(String[] args){
        // String array declaration
        // can be pictured a    [null, null, null, null, null]
        // indexing for arrays => 0     1      2    3      4
        // array indexing starts from zero
        String[] stringArray = new String[5]; // 5 represents the length at the time of array creation, it is required
        System.out.println("0th element initially: "+stringArray[0]);
        stringArray[0] = "updated";
        System.out.println("0th element after updating: "+stringArray[0]);
        // Alternative declaration and assignment (when values are known).
        int[] intArray = {0, 1, 2, 3, 4, 5};
        System.out.println("intArray: "+ Arrays.toString(intArray));
    }
}
