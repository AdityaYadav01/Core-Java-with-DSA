// Find the second-largest number from the array

public class ArrayQues4 {
    public static void main(String[] args) {
        int[] arr = {10,34,54,396,20,74,100,143,234,198,222};
        int max1, max2;
        max1 = max2 = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max1){
                max2 = max1;
                max1 = arr[i];
            } else if (arr[i]>max2) {
                max2 = arr[i];
                
            }
        }
        System.out.println("The Second Largest Number is " + max2);

    }
}
