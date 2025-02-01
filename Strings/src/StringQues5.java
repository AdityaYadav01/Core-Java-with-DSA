// Remove a special character from the string using regular expression

import java.util.Scanner;

public class StringQues5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the string with special charcters: ");
        String str = in.nextLine();

        String newStr = str.replaceAll("[^A-Za-z0-9]","");
        System.out.println("New String without special characters: " + newStr);
    }
}
