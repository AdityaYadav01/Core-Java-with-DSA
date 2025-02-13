
// Methods/Function - It is a block of code which only runs when it is called

import java.util.Scanner;

public class MethodsInJava {
    public static void main(String[] args) {
        sum();   // Here we are calling the function

        int ans = multiply();  // The variable 'ans' is storing the value of multiply function
        System.out.println("Multiplication of Two Numbers: " + ans);


    }

    // Write a method to print sum of two numbers
    // access-modifier return-type methodName()
    static void sum(){
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = in.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = in.nextInt();

        int sum = num1+num2;
        System.out.println("The sum of two numbers are: "+sum);  // We are printing here, not returning anything
    }


    // Using the return type
    static int multiply(){
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = in.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = in.nextInt();

        int mul = num1*num2;
        return mul;      // Function will end here

    }
}
