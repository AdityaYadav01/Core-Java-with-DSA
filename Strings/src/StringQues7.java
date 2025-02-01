// Find the numbers of word in a string

import java.util.Scanner;

public class StringQues7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter any paragraph: ");
        String str = in.nextLine();

        // First we will remove the extra space from the string
        str = str.replaceAll("\\s+"," ").trim();

        String[] words = str.split("\\s+");  // This will split all the words from the string

        if(str.isEmpty()){
            System.out.println("Number of words are 0.");
        }else{
            System.out.println("Numbers of words in paragraph: " + words.length);
        }

        in.close();

    }
}
