package two_D_Arrays;

import java.util.Scanner;

public class Transpose_Of_Matrix {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);

    System.out.print("Enter number of rows: ");
    int row = in.nextInt();

    System.out.print("Enter number of columns: ");
    int col = in.nextInt();
    int[][] arr = new int[row][col];
    System.out.println("Enter matrix elements:");
    for (int i = 0; i < row; i++) {
        for (int j = 0; j < col; j++) {
            arr[i][j] = in.nextInt();
        }
    }
    int[][] transpose = new int[col][row];
    
    for (int i = 0; i < row; i++) {
        for (int j = 0; j < col; j++) {
            transpose[j][i] = arr[i][j];
        }
    }
    System.out.println("Original Matrix:");

    for (int i = 0; i < row; i++) {
        for (int j = 0; j < col; j++) {
            System.out.print(arr[i][j] + " ");
        }
        System.out.println();
    }
    System.out.println("Transpose Matrix:");

    for (int i = 0; i < col; i++) {
        for (int j = 0; j < row; j++) {
            System.out.print(transpose[i][j] + " ");
        }
        System.out.println();
    }
}
}
