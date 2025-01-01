//                                                      Conditions & Loops in Java

// Condition - It provides check for the statement.
// Loops - They are used to iterate a part of program several times.

public class Loops {
    public static void main(String[] args) {

        // 1. If-Else Statement - It is used to check the condition, it checks the boolean condition true or false.
        if(2>0){
            System.out.println("True Condition");
        }else{
            System.out.println("False Condition");
        }

        // 2. For Loop - It is generally used when we know how many times loop will iterate.
        for (int i = 0; i <= 10; i++) {
            System.out.print(i +" ");
        }
        System.out.println();

        // 3. While Loop - It is generally used when we don't know how many times loop will iterate.
        //                 It is called entry control loop.

        int num = 10;
        while(num>=0){
            System.out.print(num + " ");
            num--;
        }

        /* 4. do-while loop - It is used when we want to execute our statement at least one time.
                              It is called exit control loop because it checks condition after execution of statement.
                              Semicolon is required at the end of while(condition).


         */
        do{
            System.out.println("This is do-while statement");
            int num2 = 3;
            num2--;
        }while(num>0);


    }
}
