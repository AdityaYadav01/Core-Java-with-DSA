// Find if a number is binary or not using regular expression

import java.util.Scanner;

public class StringQues2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the binary number: ");
        int binary = in.nextInt();

        String str = String.valueOf(binary);  // valueOf method will convert binary number into string. valueOf is a static method

        boolean res = str.matches("[01]+");
        if(res){
            System.out.println("It is a binary number");
        }else{
            System.out.println("It is not a binary number");
        }

        in.close();  // Closing the scanner to avoid resource leak

    }
}
