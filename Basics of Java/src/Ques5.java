// Find the Area of Triangle

import java.util.Scanner;

public class Ques5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the base of the triangle: ");
        float base = in.nextInt();

        System.out.print("Enter the height of the triangle: ");
        float height = in.nextInt();

        float triangle;

        triangle = (float) 1 /2 * (base*height);
        System.out.println("Area of Triangle is " + triangle);

    }
}
