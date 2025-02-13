import java.util.Scanner;

// Q. Create a method to check if a number is armstrong number or not
public class Ques2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int num = in.nextInt();

        int res = isArmstrong(num);
        if(res == num){
            System.out.println(num + " is a armstrong number");
        }else{
            System.out.println(num + " is not a armstrong number");
        }

    }

    public static int isArmstrong(int n){
        int armStrong = 0;
        while(n>0){
            int rem = n%10;
            int cube = rem*rem*rem;
            armStrong += cube;
            n /= 10;
        }
        return armStrong;

    }
}
