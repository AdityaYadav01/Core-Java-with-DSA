// Adding 2 matrices

import java.util.Arrays;

public class MatrixQues1 {
    public static void main(String[] args) {
        int[][] A = {{3,5,9},{7,6,2},{4,3,5}};
        int[][] B = {{1,5,2},{6,8,4},{3,9,7}};
        int[][] Sum = new int[3][3];

        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {
                Sum[i][j] = A[i][j] + B[i][j];
            }
            System.out.println("\n");
        }
        System.out.println("Sum of two arrays: " + Arrays.deepToString(Sum));
    }
}
