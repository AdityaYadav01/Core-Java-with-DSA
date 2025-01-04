// find the last number of a number

import java.util.Scanner;

public class Ques3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int num = in.nextInt();

        int lastDigit = num % 10;

        // Output the last digit
        System.out.println("The last digit of the number is: " + lastDigit);
    }
}
