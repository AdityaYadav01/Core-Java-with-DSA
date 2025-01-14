// Display A.P Series

import java.util.Scanner;

public class Ques13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the first term: ");
        int a = in.nextInt();

        System.out.println("Enter the common difference: ");
        int d = in.nextInt();

        System.out.println("Enter the nth term: ");
        int n = in.nextInt();

        int term = a;
        for (int i = 1; i <= n; i++) {
            System.out.print(term+" ");
            term += d;

        }
    }
}
