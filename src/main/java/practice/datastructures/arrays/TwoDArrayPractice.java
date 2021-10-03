package main.java.practice.datastructures.arrays;

public class TwoDArrayPractice {
    public static void main(String[] args){
        // Declaring a 2d Array
        int[][] array = new int[4][5];
        // int[row_count][column_count]
        // Assigning values manually
        // representation of a 4x5 2d array => arrays within an array
        // 2d array can be represented as a matrix with row (r) and column (c) values as shown below
        // [    [r0c0,r0c1,r0c2,r0c3,r0c4],
        //      [r1c0,r1c1,r1c2,r1c3,r1c4],
        //      [r2c0,r2c1,r2c2,r2c3,r2c4],
        //      [r3c0,r3c1,r3c2,r3c3,r3c4]   ]

        // problem - using two for loops, get the following values in the above 2d array
        // 1  2  3  4  5
        // 6  7  8  9  10
        // 11 12 13 14 15
        // 16 17 18 19 20

        // assigning values to 2d array
        for(int r=0;r<array.length;r++){
            for(int c=0;c<array[r].length;c++){
                array[r][c] = r+c;
            }
        }
        print2DArray(array);
    }


    // method to print values of a 2d array
//    private static String arrayTwoString(int[][] array){
//        String retVal = "";
//        for(int r=0;r<array.length;r++){
//            for(int c=0;c<array[r].length;c++){
//
//            }
//        }
//    }

    // method to print a 2d array
    private static void print2DArray(int[][] array){
        for(int r=0;r<array.length;r++){
            for(int c=0;c<array[r].length;c++){
               System.out.print(array[r][c]);
            }
            System.out.println();
        }
    }
}
