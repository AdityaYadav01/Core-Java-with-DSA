// Insert an element in a array

import java.util.Arrays;

public class ArrayQues6 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        // Inserting a value in array with few space left
        arr[0] = 5;
        arr[1] = 9;
        arr[2] = 6;
        arr[3] = 10;
        arr[4] = 12;
        arr[5] = 7;

        System.out.print("Intial Array: ");
        for(int x: arr){
            System.out.print(x + " ");
        }
        System.out.println();

        for (int i = 6; i>2 ; i--) {
            arr[i] = arr[i-1];
        }
        arr[2] = 5;  // Inserting a value 5 at index 2
        System.out.println(Arrays.toString(arr));

    }
}
