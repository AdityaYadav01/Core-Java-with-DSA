// Check if a number is palindrome or not

import java.util.Scanner;

// Palindrome Number - A number is a palindrome number if the reverse of that number is equal to the given number. Example:- num = 12321 & the reverse of that number is also 12321.
public class Ques11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = in.nextInt();
        int temp = num;
        int revNum = 0;

        while(num>0){
            int digit = num%10;
            num /= 10;
            revNum = revNum*10+digit;
        }
        if(revNum==temp){
            System.out.println(temp + " is a palindrome number");
        }else{
            System.out.println(temp + " is not a palindrome number");
        }

    }
}
