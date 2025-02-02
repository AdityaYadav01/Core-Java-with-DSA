// Arrays in Java
// Array is the collection of similar datatype

public class ArraysInJava {
    public static void main(String[] args) {
        // How to create an array

        int[] arr = new int[5];
        /* 1. int[] arr - It is a reference variable of integer type.
        *  2. new - It is a keyword we are using to create an object in Heap memory
        *  3. int[5] - Integer array of size 5*/

        //Storing the value in the array
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;

        int[] arr1 = {1,2,3,4,5,6,7,8,9};

        // Note: There is in-build property in array which is length
        // Accesing the elements of an array
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
        System.out.println();

        System.out.println("Array in Reverse Order: ");
        // Accessing the elements in reverse order
        for (int i = arr1.length-1; i >=0 ; i--) {
            System.out.println(arr1[i] + " ");
        }
        System.out.println();

        // Using for each loop to access elements in array
        for(int x: arr){
            System.out.print(x + " ");
        }

    }
}
