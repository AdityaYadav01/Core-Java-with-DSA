// Display the nth fibonnaci number

import java.util.Scanner;

public class Ques16 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the nth number for which you want to find the fibonnaci number: ");
        int num = in.nextInt();
        
        int a = 0;
        int b = 1;
        int sum = 0;

        if(num<0){
            System.out.println("Please enter a valid number");
        }else if(num == 0){
            System.out.println("The nth fibonnaci series is " + 0);
        }else if(num == 1){
            System.out.println("The nth fibonnaci series is " + 1);
        }else{
            for (int i = 2; i <= num ; i++) {
                sum = a+b;
                a = b;
                b = sum;
            }
            System.out.println("The nth fibonnaci series is " + sum);
        }
    }
}
