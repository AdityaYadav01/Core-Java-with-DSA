// Check whether a number is Armstrong Number or not

import java.util.Scanner;

public class Ques9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int num = in.nextInt();
        int temp = num;
        int sum=0;

        while(num>0){
            int digit = num%10;
            num /= 10;
            sum += digit*digit*digit;
        }

        if(temp == sum){
            System.out.println(temp + " is a Armstrong Number");
        }else{
            System.out.println(temp + " is not a Armstrong Number");
        }

    }
}
