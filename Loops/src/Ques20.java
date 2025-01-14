/* Display this pattern
*       1
        1 2
        1 2 3
        1 2 3 4
        1 2 3 4 5
* */

public class Ques20 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5 ; i++) {
            for (int j = 1; j <= 5 ; j++) {
                if(i>=j){
                    System.out.print(j + " ");
                }else{
                    System.out.print(" ");
                }

            }
            System.out.println();

        }
    }
}
