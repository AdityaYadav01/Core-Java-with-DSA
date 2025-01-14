// Count digits of a number

import java.util.Scanner;

public class Ques8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int num = in.nextInt();
        int count = 0;

        while(num>0){
            //int digit = num%10;  // Give us the last digit
            num /= 10;
            count++;
        }
        System.out.println("There are total " + count + " digits");
    }
}
