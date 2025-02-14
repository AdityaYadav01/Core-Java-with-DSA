// Write a function to check if a given triplet is a Pythagorean triplet or not.

import java.util.Scanner;

public class Ques10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the value of Hypotenuese: ");
        int H = in.nextInt();

        System.out.println("Enter the value of Base: ");
        int B = in.nextInt();

        System.out.println("Enter the value of Perpendicular: ");
        int P = in.nextInt();

        if(isPythagorean(H, B, P)){
            System.out.println("It is a Pythagorean Triplet");
        }else{
            System.out.println("It is not a Pythagorean Triplet");
        }
    }

    public static boolean isPythagorean(int H, int B, int P){
        int side1 = H*H;
        int side2 = (B*B) + (P*P);

        if(side1 == side2){
            return true;
        }
        return false;
    }
}
