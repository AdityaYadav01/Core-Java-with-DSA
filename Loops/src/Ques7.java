// Display a digit of a number

import java.util.Scanner;

public class Ques7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = in.nextInt();

        System.out.print("The digits of " + num +" are ");
        int temp = num;
        while(temp>0){
            int digit = temp%10;
            temp /= 10;
            System.out.print(digit + " ");
        }


    }
}
