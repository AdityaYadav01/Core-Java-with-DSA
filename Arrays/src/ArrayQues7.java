// Delete an element form array

import java.util.Arrays;

public class ArrayQues7 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        // Inserting a value in array with few space left
        arr[0] = 5;
        arr[1] = 9;
        arr[2] = 6;
        arr[3] = 10;
        arr[4] = 12;
        arr[5] = 7;

        System.out.print("Initial Array: ");
        for(int x: arr){
            System.out.print(x + " ");
        }
        System.out.println();

        int index = 1;
        arr[index] = 0;

        for (int i = index; i < arr.length-1; i++) {
            arr[i] = arr[i+1];
        }

        System.out.println("Array after removing the element from index 1: "+Arrays.toString(arr));
    }
}
