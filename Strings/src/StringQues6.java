// Remove the extra space from the string

import java.util.Scanner;

public class StringQues6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the String with space: ");
        String str = in.nextLine();

        String str1 = str.replaceAll("\\s+"," ");
        System.out.println("New String"+str1);


    }
}
