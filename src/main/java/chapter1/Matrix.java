package chapter1;

import java.util.Arrays;

// 1.6 Given an image represented by an NxN matrix, where each pixel in the image is 4 bytes,
// write a method to rotate the image by 90 degrees Can you do this in place?

public class Matrix {

    public static void main(String[] args) {

        Matrix matrix = new Matrix();

        int[][] grid = new int[][]{
                {6, 4, 3, 7},
                {2, 1, 8, 5},
                {9, 0, 2, 1}
        };

        print(grid);
        System.out.println();
        print(matrix.rotate(grid, 270));
    }

    int[][] rotate(int[][] matrix, int degrees) {
        if (degrees % 360 == 0) {
            return copyOf(matrix);
        } else {
            int[][] rotatedMatrix = reverseRows(transpose(matrix));

            for (int i = 1; i < rotations(degrees); i++) {
                rotatedMatrix = reverseRows(transpose(rotatedMatrix));
            }
            return copyOf(rotatedMatrix);
        }
    }

    private int[][] transpose(int[][] matrix) {
        int rows = matrix.length;
        int columns = matrix[0].length;
        int transpose[][] = new int[columns][rows];

        for (int i = 0; i < columns; i++) {
            for (int j = 0; j < rows; j++) {
                transpose[i][j] = matrix[j][i];
            }
        }
        return transpose;
    }

    private int[][] reverseRows(int[][] matrix) {
        int[][] reversed = new int[matrix.length][matrix[0].length];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                int temp = matrix[i][j];
                reversed[i][j] = matrix[i][matrix[i].length - j - 1];
                reversed[i][reversed[i].length - j - 1] = temp;
            }
        }
        return reversed;
    }

    private int rotations(int degrees) {
        if (degrees % 90 != 0) {
            throw new IllegalArgumentException("Input +- 90 degree increments");
        }
        return Math.floorMod(-degrees, 360) / 90;
    }

    private int[][] copyOf(int[][] matrix) {
        return Arrays.stream(matrix)
                .map(int[]::clone)
                .toArray(int[][]::new);
    }

    private static void print(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
