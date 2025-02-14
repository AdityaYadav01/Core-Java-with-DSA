import java.util.Scanner;

// Define a program to find out whether a given number is even or odd.
public class Ques4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int num = in.nextInt();

        if(oddEven(num)){
            System.out.println(num + " is a even number");
        }else{
            System.out.println(num + " is a odd number");
        }
    }

    public static boolean oddEven(int n){
        if(n%2 == 0){
            return true;
        }
        return false;
    }
}
