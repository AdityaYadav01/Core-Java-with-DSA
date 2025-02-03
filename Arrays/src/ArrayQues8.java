// Ques. Copying an array

import java.util.Arrays;
public class ArrayQues8 {
    public static void main(String[] args) {
        int[] arr1 = {8,6,10,9,2,15,7,13,14,11};
        int[] arr2 = new int[10];

        System.out.println("Initial Array: ");
        for(int x: arr1){
            System.out.print(x + " ");
        }
        System.out.println();

        for (int i = 0; i < arr1.length; i++) {
            arr2[i] = arr1[i];

        }
        System.out.println("Copied Array: " + Arrays.toString(arr2));
    }
}
