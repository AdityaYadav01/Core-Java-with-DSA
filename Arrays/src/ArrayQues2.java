// Search an element in an array
public class ArrayQues2 {
    public static void main(String[] args) {
        int[] arr = {10,3,5,2,8,12,56,789,12,13}; // For Searching all the elements should be unique

        int search = 56;

        for (int i = 0; i < arr.length; i++) {
            if(search==arr[i]){
                System.out.println("The Number is at this index: " + i);
                System.exit(0);  // It will end the program here after finding the element at this index
            }
        }
        System.out.println("Not Found");
    }
}
