// 2D Array - Array of Array is called 2D array

import java.util.Arrays;

public class TwoDimArray {
    public static void main(String[] args) {
        // How to create 2D Array
        int[][] A = new int[3][4];  // Here, 3 represents number of rows & 4 represents number of column. It is created in Heap Memory because we are creating new object.
        // OR
        int[][] B = {{1,2,3},{4,5,6},{7,8,9}};   // It is 3*3 Matrix
        // OR
        int[][] C;
        C=new int[3][3];

        System.out.println(Arrays.toString(B));

        // How to Access the element in 2D Array

        for (int i = 0; i < A.length; i++) {            // Outer Loop, It is used to change the row, A.length - It represents number of rows
            for (int j = 0; j < A[0].length; j++) {     // Inner Loop, It is used to access the columns, A[0].length - It represents number of columns
                System.out.print(A[i][j] + " ");

            }
            System.out.println("\n");
        }

        // Using for-each loop to access element in 2D Array
        for(int x[]: B){
            for(int y: x){
                System.out.print(y+" ");
            }
            System.out.println("\n");
        }




    }
}
