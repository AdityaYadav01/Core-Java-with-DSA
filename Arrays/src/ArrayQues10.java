// Increase the size of array

import java.util.Arrays;

public class ArrayQues10 {
    public static void main(String[] args) {
        int[] A = {1, 2, 3, 4, 5};            // This Set of Array will be removed by garbage collector
        int[] B = new int[2 * (A.length)];

        System.out.print("Initial Array: ");
        for(int x: A){
            System.out.print(x+" ");
        }
        System.out.println();

        for (int i = 0; i < A.length-1; i++) {
            B[i] = A[i];
        }

        A=B;

        System.out.println("Updated Length of Array A: " + A.length);
        System.out.print("Array A: " + Arrays.toString(A) );

    }
}
