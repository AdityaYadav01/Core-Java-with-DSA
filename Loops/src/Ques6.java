// Finding the factorial of a number

import java.util.Scanner;
public class Ques6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the number to find factorial: ");
        int num = in.nextInt();

        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;

        }
        System.out.println("The factorial of " + num + " is " + fact);

    }
}
