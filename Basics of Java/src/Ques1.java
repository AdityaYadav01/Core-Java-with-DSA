import java.util.Scanner;

// Write a program to print whether a number is even or odd, also take input from the user.
public class Ques1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // Scanner - It is a java util class which is used to take input from the user.
        // in - It is an object that we are creating to take input.
        // new - It is a keyword used to create an object.
        // System.in - 'System' is a class and 'in' is a variable that denotes we are taking input from standard input stream.

        System.out.print("Enter a integer number: ");
        int num = in.nextInt(); //nextInt() - It is a method which is used to take integer input.

        if(num % 2 == 0){
            System.out.println(num + " is a even number");
        }else{
            System.out.println(num + " is a odd number");

        }

    }
}
