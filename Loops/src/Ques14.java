// Display a G.P Series

import java.util.Scanner;

public class Ques14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the first term: ");
        int a = in.nextInt();

        System.out.println("Enter the common ratio: ");
        int r = in.nextInt();

        System.out.println("Enter the nth term: ");
        int n = in.nextInt();

        int temp = a;

        System.out.print("The G.P Series is ");
        for (int i = 0; i < n; i++) {
            System.out.print(temp + " ");
            temp *= r;

        }
    }
}
