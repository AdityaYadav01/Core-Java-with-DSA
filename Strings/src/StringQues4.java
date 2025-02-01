// Find if a date is in the format of dd/mm/yyyy

import java.util.Scanner;

public class StringQues4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the date in this format(dd/mm/yyyy): ");
        String date = in.nextLine();

        boolean res = date.matches("[0-3][0-9]/[01][0-9]/[0-9]{4}");
        if(res){
            System.out.println(date + " is in correct format");
        }else{
            System.out.println(date + " is not in correct format");
        }
    }
}
