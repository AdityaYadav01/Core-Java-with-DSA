// Multiplying 2 Matrices

public class MatrixQues2 {
    public static void main(String[] args) {

        int[][] A = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] B = {{1,0,0},{0,1,0},{0,0,1}};

        int[][] mul = new int[3][3];  // Created a multiplication matrices of 3*3 matrices

        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {
                mul[i][j]=0;
                for (int k = 0; k < 3; k++) {
                    mul[i][j] = mul[i][j]+A[i][k]*B[k][j];

                }

            }

        }
        for(int x[]:mul){
            for(int y: x){
                System.out.print(y+" ");
            }
            System.out.println("\n");
        }


    }
}
