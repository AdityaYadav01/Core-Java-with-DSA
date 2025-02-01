import java.util.Scanner;

// Find if a number is hexadecimal number or not using regular expression
public class StringQues3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a hexadecimal number: ");
        String hexa = in.nextLine();

        boolean res = hexa.matches("[A-F0-9]*");

        if(res){
            System.out.println(hexa + " is a hexadecimal number");
        }else{
            System.out.println("It is not a hexadecimal number");
        }
    }
}
