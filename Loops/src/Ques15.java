// Display fibonacci series upto nth term

import java.util.Scanner;

public class Ques15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the nth term: ");
        int n = in.nextInt();

        if(n<0){
            System.out.println("Please Enter Positive Number");
        } else if (n == 0) {
            System.out.println("Fibonnaci Series: 0");
        }else{
            System.out.println("Fibonnaci Series: 0 1");
        }

        int a = 0;
        int b = 1;
        int sum;

        for (int i = 2; i <= n; i++) {
            sum = a+b;
            a = b;
            b = sum;
            System.out.print(sum + " ");
        }
        in.close(); // Closing the Scanner class to avoid leaks

    }
}
