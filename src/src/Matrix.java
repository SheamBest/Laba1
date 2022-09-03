package src;

import java.util.Scanner;

public class Matrix {
    private final int numberOfRows;
    private final int numberOfColumns;
    private final int[][] matrix;

    public Matrix(final int rows, final int columns) {
        this.numberOfRows = rows;
        this.numberOfColumns = columns;
        matrix = new int[rows][columns];
    }

    public Matrix() {
        final Scanner byKeyboard = new Scanner(System.in);
        System.out.println();
        System.out.print("Please enter the number of rows: ");
        numberOfRows = byKeyboard.nextInt();
        System.out.print("Please enter the number of columns: ");
        numberOfColumns = byKeyboard.nextInt();
        matrix = new int[numberOfRows][numberOfColumns];
        System.out.println("Please assign the following elements: ");
        for (int i = 0; i < numberOfRows; i++)
            for (int j = 0; j < numberOfColumns; j++) {
                System.out.print("[" + i + "]" + "[" + j + "]: ");
                matrix[i][j] = byKeyboard.nextInt();
            }
    }

    public Matrix transposition() {
        final Matrix transMatrix = new Matrix(this.numberOfColumns, this.numberOfRows);

        for (int i = 0; i < transMatrix.numberOfRows; i++) {
            for (int j = 0; j < transMatrix.numberOfColumns; j++) {
                transMatrix.matrix[i][j] = this.matrix[j][i];
            }
        }
        return transMatrix;
    }

    public void print() {
        for (int i = 0; i < numberOfRows; i++) {
            for (int j = 0; j < numberOfColumns; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
