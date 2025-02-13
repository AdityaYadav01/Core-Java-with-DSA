import java.util.Scanner;

// Q. Create a method to check if a number is divided by prime number or not
public class Ques1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = in.nextInt();

        if(isPrime(num)){
            System.out.println(num + " is a prime number");
        }else{
            System.out.println(num + " is not a prime number");
        }

    }

    public static boolean isPrime(int n){
        if(n <= 1){
            return false;
        }

        for (int i = 2; i <= Math.sqrt(n) ; i++) {      // Math.sqrt is used to optimize the code
            if(n%i == 0){                        // If a number is divisible by any number between i to root of n. It is not a prime number.
                return false;
            }
        }
        return true;

    }
}
