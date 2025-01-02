import java.util.Scanner;

public class Ques1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Input a number
        System.out.print("Enter a number: ");
        int num = in.nextInt();

        System.out.println("Factors of " + num + " are:");
        // Loop to find factors
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                System.out.println(i);
            }
        }
        
    }

}
