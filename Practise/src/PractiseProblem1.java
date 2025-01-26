import java.util.Scanner;

// Swap two Numbers
public class PractiseProblem1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = in.nextInt();

        System.out.println("Enter the second number: ");
        int num2 = in.nextInt();
        System.out.println("Original numbers are: " + num1 + "," + num2);

         // Creating a Temporary Variable to store a number

        int temp = num1; // Storing num1 value in temp variable
        num1 = num2;
        num2 = temp;

        System.out.println("Reversed number are: " + num1 + "," + num2);


    }
}
