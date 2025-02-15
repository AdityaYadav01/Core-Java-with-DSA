// Swapping a value in Array

import java.util.Arrays;

public class ArrayQues11 {
    public static void main(String[] args) {
        int[] arr = {5, 10, 15, 20, 25, 30, 35, 40};
        swap(arr, 1,5);

        System.out.println("The reversed array is "+Arrays.toString(arr));
    }

    public static void swap(int[] arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;

    }
}
