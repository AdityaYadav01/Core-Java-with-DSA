// Find if the email id is on gmail or not

import java.util.Scanner;

public class StringQues1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter your email id: ");
        String email = in.nextLine();

        int i = email.indexOf('@');  // It will tell us the index of @
        System.out.println(i);

        String username = email.substring(0,i);
        System.out.println("Username: " + username);

        String domain = email.substring(i+1, email.length());
        System.out.println("Domain: " + domain);

        if(domain.equals("gmail.com")){
            System.out.println("It is a Gmail Id");
        }else{
            System.out.println("Other domain");
        }

    }
}
