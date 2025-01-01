import java.util.Scanner;

// Take in two numbers and an operator (+, -, *, /) and calculate the value.
public class Ques2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = in.nextInt();

        System.out.println("Enter the second number: ");
        int num2 = in.nextInt();;

        System.out.print("Enter the operation you want to perform: ");
        char ch = in.next().charAt(0);

        if(ch == '+'){
            System.out.println("Sum of two number: " + (num1+num2));
        } else if (ch == '-') {
            System.out.println("Subtraction of two number: " + (num1-num2));
        } else if (ch == '*') {
            System.out.println("Multiplication of two number: " + (num1*num2));
        } else if (ch == '%') {
            System.out.println("Division of two numbers: " + (num1/num2));
        } else{
            System.out.println("Invalid Character");
        }
    }
}
