// Reverse the order of number

import java.util.Scanner;

public class Ques2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int num = in.nextInt();

        int reverseNum = 0;
        while(num != 0){
            int digit = num % 10;
            reverseNum = reverseNum * 10 + digit;
            num /= 10;
        }

        System.out.println("Reversed number: " + reverseNum);


    }
}
