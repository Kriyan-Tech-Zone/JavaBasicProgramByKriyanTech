public class JavaAddTwoMatrics {
    public static void main(String[] args) {
      
        int matrixA[][] = { { 5, 2, 7 }, { 1, 6, 3 }, { 9, 8, 4 } };
        int matrixB[][] = { { 4, 5, 3 }, { 2, 7, 1 }, { 7, 6, 8 } };

        int matrixC[][] = new int[3][3];

        for (int i = 0; i < matrixA.length; i++) {
            for (int j = 0; j < matrixA.length; j++) {
                matrixC[i][j] = matrixA[i][j] + matrixB[i][j];
                System.out.print(matrixC[i][j] + " ");
            }
            System.out.println();
        }

    }
}
/* Output::

9 7 10 
3 13 4
16 14 12

 */

