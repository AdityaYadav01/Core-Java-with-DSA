// Display a number in words even tailing with zero

import java.util.Scanner;

public class Ques12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int num = in.nextInt();
        String revNum = "";
        System.out.println("Given Number: " + num);
        
        while(num>0){
            int digit = num%10;
            num /= 10;
            revNum += digit;          // Reversing a number & storing it in String
        }
        System.out.println("Reverse Number: " + revNum);
        System.out.println("Numbers in word: " );

        for (int i = revNum.length()-1; i >=0 ; i--) {
            char ch = revNum.charAt(i);
            switch(ch){
                case '0':
                    System.out.print("Zero ");
                    break;
                case '1':
                    System.out.print("One ");
                    break;
                case '2':
                    System.out.print("Two ");
                    break;
                case '3':
                    System.out.print("Three ");
                    break;
                case '4':
                    System.out.print("Four ");
                    break;
                case '5':
                    System.out.print("Five ");
                    break;
                case '6':
                    System.out.print("Six ");
                    break;
                case '7':
                    System.out.print("Seven ");
                    break;
                case '8':
                    System.out.print("Eight ");
                    break;
                case '9':
                    System.out.print("Nine ");
                    break;
                default:
                    System.out.println("Please enter a valid number");
            }
        }


    }
}
