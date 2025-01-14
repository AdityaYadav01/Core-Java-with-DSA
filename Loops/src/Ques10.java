import java.util.Scanner;

// Reverse a given number
public class Ques10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = in.nextInt();
        int revNum = 0;

        while(num>0){
            int digit = num%10;
            num /= 10;
            revNum = revNum*10 + digit;

        }
        System.out.println(revNum);
    }
}
