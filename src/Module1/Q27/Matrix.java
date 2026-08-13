// matrix add and mult
import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Matrix Addition
        System.out.println("MATRIX ADDITION");

        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();

        int[][] A = new int[rows][cols];
        int[][] B = new int[rows][cols];
        int[][] sum = new int[rows][cols];

        System.out.println("Enter elements of Matrix A:");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                A[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter elements of Matrix B:");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                B[i][j] = sc.nextInt();
            }
        }

        // Addition
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                sum[i][j] = A[i][j] + B[i][j];
            }
        }

        System.out.println("Matrix Addition:");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }

        // Matrix Multiplication
        System.out.println("\nMATRIX MULTIPLICATION");

        System.out.print("Enter rows of Matrix A: ");
        int r1 = sc.nextInt();

        System.out.print("Enter columns of Matrix A: ");
        int c1 = sc.nextInt();

        System.out.print("Enter rows of Matrix B: ");
        int r2 = sc.nextInt();

        System.out.print("Enter columns of Matrix B: ");
        int c2 = sc.nextInt();

        if (c1 != r2) {
            System.out.println("Matrix multiplication is not possible.");
        } else {

            int[][] X = new int[r1][c1];
            int[][] Y = new int[r2][c2];
            int[][] product = new int[r1][c2];

            System.out.println("Enter elements of Matrix A:");

            for (int i = 0; i < r1; i++) {
                for (int j = 0; j < c1; j++) {
                    X[i][j] = sc.nextInt();
                }
            }

            System.out.println("Enter elements of Matrix B:");

            for (int i = 0; i < r2; i++) {
                for (int j = 0; j < c2; j++) {
                    Y[i][j] = sc.nextInt();
                }
            }

            // Multiplication
            for (int i = 0; i < r1; i++) {

                for (int j = 0; j < c2; j++) {

                    for (int k = 0; k < c1; k++) {

                        product[i][j] =
                                product[i][j] + X[i][k] * Y[k][j];
                    }
                }
            }

            System.out.println("Matrix Multiplication:");

            for (int i = 0; i < r1; i++) {
                for (int j = 0; j < c2; j++) {
                    System.out.print(product[i][j] + " ");
                }
                System.out.println();
            }
        }

        sc.close();
    }
}