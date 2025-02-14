// Write a program to print the factorial of a number by defining a method named 'Factorial'.

public class Ques6 {
    public static void main(String[] args) {
        int num = 5;
        int res = factorial(num);
        System.out.println("The factorial of " + num + " is " + res);

    }

    public static int factorial(int n){
        int fact = 1;
        for (int i = n; i >= 1 ; i--) {
            fact *= i;
            
        }
        return fact;
    }
}
