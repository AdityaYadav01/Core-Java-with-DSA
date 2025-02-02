// Rotating an array towards left side

import java.util.Arrays;

public class ArrayQues5 {
    public static void main(String[] args) {
        int[] arr = {5,9,6,10,12,7,3,5,4,2};

        System.out.print("Initial Array: ");
        for(int x: arr){
            System.out.print(x+" ");
        }
        System.out.println();

        int temp = arr[0];  // Storing the first element of array in a temporary variable

        for (int i = 0; i < arr.length-1; i++) {
            arr[i] = arr[i+1];

        }
        arr[arr.length-1] = temp;
        System.out.println("Rotated Array "+Arrays.toString(arr));
    }
}
