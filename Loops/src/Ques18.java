/* Display this pattern
*       2 3 4 5
        3 4 5 6
        4 5 6 7
        5 6 7 8
        6 7 8 9
* */


public class Ques18 {
    public static void main(String[] args) {
        for (int i = 1; i <=5 ; i++) {
            for (int j = 1; j < 5; j++) {
                System.out.print((i+j) + " ");
            }
            System.out.println();

        }
    }
}
