// Q. Define two methods to print the maximum and the minimum number respectively among three numbers entered by the user.

import java.util.Scanner;

public class Ques3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int num1 = in.nextInt();

        System.out.println("Enter the second number: ");
        int num2 = in.nextInt();

        System.out.println("Enter the third number: ");
        int num3 = in.nextInt();

        int maxRes = max(num1, num2, num3);
        System.out.println("The highest number among the three number is " + maxRes);

        int minRes = min(num1,num2, num3);
        System.out.println("The Minimum number among the three number is " + minRes);

    }

    public static int max(int a, int b, int c){
        if(a>b && a>c){
            return a;
        } else if (b>a && b>c) {
            return b;
        }
        return c;
    }

    public static int min(int a, int b, int c){
        if(a<b && a<c){
            return a;
        } else if (b<a && b<c) {
            return b;
        }
        return c;
    }
}
