// Find the maximum element from the array

public class ArrayQues3 {
    public static void main(String[] args) {
        int[] arr = {10, 13, 15, 45, 76, 87, 98, 123, 657};

        int max = 0;
        for (int i = 0; i < arr.length ; i++) {
            if(arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println("The highest element in the array is " + max);

    }
}
