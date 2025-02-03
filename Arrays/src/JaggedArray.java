// Jagged Array - They are arrays of arrays with varying sizes, allowing for dynamic memory allocation and efficient space utilization

import java.util.Arrays;

public class JaggedArray {
    public static void main(String[] args) {
        int[][] arr;
        arr = new int[3][];  // Array with 3 rows
        arr[0] = new int[2];
        arr[1] = new int[3];
        arr[2] = new int[4];

        System.out.println(Arrays.deepToString(arr));  // We should use Arrays.deepToString to print 2D array in correct order
    }
}
