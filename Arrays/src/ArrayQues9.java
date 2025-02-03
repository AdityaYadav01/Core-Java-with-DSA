// Reverse Copying an Array

import java.util.Arrays;

public class ArrayQues9 {
    public static void main(String[] args) {
        int[] arr1 = {8,6,10,9,2,15,7,13,14,11};
        int[] arr2 = new int[10];

        System.out.print("Array 1: ");
        for(int x: arr1){
            System.out.print(x+" ");
        }
        System.out.println();

        for (int i = arr1.length-1,j=0 ; i >=0 ; i--, j++) {
            arr2[j] = arr1[i];
        }
        System.out.print("Array 2: "+ Arrays.toString(arr2));
    }
}
