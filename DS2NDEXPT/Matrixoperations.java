import java.util.Scanner;

public class Matrixoperations {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[][] A = new int[2][2];
        int[][] B = new int[2][2];
        int[][] add = new int[2][2];
        int[][] sub = new int[2][2];
        System.out.println("enter elements for matrix A");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                A[i][j] = sc.nextInt();
            }
        }
        System.out.println("\nEnter elements of Matrix B (2x2):");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                B[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                add[i][j] = A[i][j] + B[i][j];
            }
        }
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                sub[i][j] = A[i][j] - B[i][j];
            }
        }
        System.out.println("\nMatrix Addition (A + B):");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(add[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("\nMatrix Subtraction (A - B):");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(sub[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
