// Find the sum of all elements from the array

public class ArrayQues1 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};

        int sum = 0;  // We have initialize the sum to zero

        for (int i = 0; i < arr.length; i++) {
            sum = sum+arr[i];
        }
        System.out.println("The Sum of all elements in a array is " + sum);
    }
}
