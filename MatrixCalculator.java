import java.util.Scanner;

/**************************************************************
 * Author:  Nebi Malik
 * Created: August 12, 2023
 *************************************************************/

public class MatrixCalculator {

    public static void main(String[] args){

        int[][] a;
        int[][] b;
        int[][] c = new int[4][4];
        Scanner input = new Scanner(System.in);
        int n = 0;
        int a1 = 0;
        System.out.println("Please enter a value for n, must be 2, 3, or 4,  for which n is the dimension, n x n, for matrix a and b.");
        n = Integer.parseInt(input.nextLine());
        a = new int[n][n];
        b = new int[n][n];
        a1 = n * n;
        System.out.println("Please enter "+a1+" values for matrixes a and b.");
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                System.out.print("MatrixA["+i+"]["+j+"]: ");
                a[i][j] = Integer.parseInt(input.nextLine());
            }
        }
        System.out.println("Now enter "+a1+" values for matrix b.");
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                System.out.print("MatrixB["+i+"]["+j+"]: ");
                b[i][j] = Integer.parseInt(input.nextLine());
                
            }
        }
        c = MatrixSum(a, b, n);

        System.out.println("Matrix A:");
        matrixPrint(a, n);

        System.out.println("Matrix B:");
        matrixPrint(b, n);

        System.out.println("Sum of A and B:");
        matrixPrint(c, n);

        matrixMult(a, b, c, n);
        System.out.println("Result of A times B:");
        matrixPrint(c, n);

        matrixMult(b, a, c, n);
        System.out.println("Result of B times A:");
        matrixPrint(c, n);


        input.close();
    }

    private static int[][] MatrixSum(int[][] a, int[][] b, int n){
        int[][] c = new int[n][n];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
              c[i][j] = a[i][j] + b[i][j];
            }
        }
        return c;
    }
    private static void matrixMult(int[][] a, int[][] b, int[][] c, int n){

        for (int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                c[i][j] = 0;
                for (int k = 0; k < n; k++){
                    c[i][j] += a[i][k] * b[k][j];
                }
            }
        }


    }

    private static void matrixPrint(int[][] matrix, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
