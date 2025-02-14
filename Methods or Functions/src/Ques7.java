// Write a function to find if a number is a palindrome or not. Take number as parameter.

import java.util.Scanner;

public class Ques7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int num = in.nextInt();

        int res = isPalindrome(num);
        if(num == res){
            System.out.println(num + " is a palindrome number");
        }else{
            System.out.println(num + " is not a palindrome number");
        }
    }

    public static int isPalindrome(int n){
        int temp = 0;
        while(n>0){
            int rem = n%10;  //  Will give us the last number
            temp = rem + temp*10;
            n /= 10;
        }
        return temp;
    }
}
