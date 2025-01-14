// Display a multiplication table

import java.util.Scanner;

public class Ques4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the Table Number: ");
        int num = in.nextInt();

        for (int i = 1; i <=10 ; i++) {
            int mul = num*i;
            System.out.println(num + "*" + i + "=" + mul);
        }

        // Optimize Version for printing table
        for (int multiplier = 11; multiplier <=20 ; multiplier++) {
            System.out.printf("%d * %d = %d%n", num, multiplier, num*multiplier);

        }
        /*  printf() - It stands for print format
                       It allow formatted output by specifying a format string.
                       Common format specifiers are:-

                       1. %d - decimal Integer
                       2. %f - floating-point number
                       3. %s - String
                       4. %n - newline character (platform independent)

        * */

        in.close();   // Closing the Scanner class to prevent resource leak
    }
}
