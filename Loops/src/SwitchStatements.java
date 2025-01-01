// In switch statement, we can jump to various cases based on your expression.

import java.util.Scanner;

public class SwitchStatements {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the fruit name: ");
        String fruit = in.nextLine().toLowerCase();
        switch(fruit){
            case "mango":
                System.out.println("King of fruits");
                break;
            case "banana":
                System.out.println("A sweet yellow fruit");
                break;
            case "grapes":
                System.out.println("A small fruit");
                break;
            default:
                System.out.println("Please enter a valid fruit name");

        }

        System.out.println("Enter the number from 1 to 7: ");
        int day = in.nextInt();
        switch(day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Please enter a valid month");
        }
    }
}
