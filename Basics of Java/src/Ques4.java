import java.util.Scanner;

// Calculate the fibonnaci series upto nth number
public class Ques4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the number till where print fibonnaci series: ");
        int num = in.nextInt();

        int n1 = 0;
        int n2 = 1;
        int sum;

        if(num<=0){
            System.out.println("Please enter positive number");
        } else if (num == 1) {
            System.out.println(n1);
        } else {
            System.out.print(n1 + ", " + n2);

            for (int i = 3; i <= num; i++) {
                sum = n1 + n2;
                n1 = n2;
                n2 = sum;
                System.out.print(", " + sum);
            }
        }
    }
}
