// Write a function that returns all prime numbers between two given numbers.

import java.util.Scanner;

public class Ques8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter any number: ");
        int num = in.nextInt();

        if(isPrime(num)){
            System.out.println(num + " is a prime number");
        }else{
            System.out.println(num + " is not a prime number");
        }


        // This will check prime numbers between 100 and 200
        System.out.print("Prime Numbers from 100 to 200: ");
        for (int i = 100; i <= 200 ; i++) {
            if(isPrime(i)){
                System.out.print(i + " ");
            }
        }


    }

    // Method to check if a number is prime or not
    public static boolean isPrime(int n){
        if(n<=1){
            return false;
        }
        for (int i = 2; i < Math.sqrt(n); i++) {
            if(n%2 == 0){
                return false;
            }

        }
        return true;
    }


}
