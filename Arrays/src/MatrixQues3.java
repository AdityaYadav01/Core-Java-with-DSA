// Sorting Array of String

public class MatrixQues3 {
    public static void main(String args[]){
        String[] arr = {"Java","Ada","Pascal","C++","Python","Javascript"};
        // All the name of the languages are the objects of the String class

        java.util.Arrays.sort(arr);  // Java contain in-build method to sort array

        for(String x: arr){
            System.out.print(x+" ");
        }



    }
}
