// Write a function that returns the sum of first n natural numbers.

import java.util.Scanner;

public class Ques9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = in.nextInt();

        int res = sumNatural(num);
        System.out.println("The sum of n natural number is " + res);

    }

    public static int sumNatural(int n){
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum += i;
        }
        return sum;
    }



}
