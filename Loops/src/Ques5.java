import java.util.Scanner;

// Find sum on n numbers
public class Ques5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the number till where you want to find the sum of the number: ");
        int num = in.nextInt();

        int sum = 0;
        for (int i = 1; i <= num ; i++) {
            sum += i;
        }
        System.out.println("Sum of " + num + " numbers is " + sum);

        in.close();               // Closing the scanner class to prevent resource leak
    }
}
