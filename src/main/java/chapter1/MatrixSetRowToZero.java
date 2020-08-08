package chapter1;

// 1.7 Write an algorithm such that if an element in an MxN matrix is 0
// its entire row and column is set to 0.

public class MatrixSetRowToZero {

    public static void main(String[] args) {
        int[][] matrix = {  {2, 5, 7},
                            {8, 1, 1},
                            {44, 32, 0}
        };
        print(matrix);
        print(setZeros(matrix));
        print(matrix);
    }

    static int[][] setZeros(int[][] matrix) {
        int[] row = new int[matrix.length];
        int[] column = new int[matrix[0].length];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    row[i] = 1;
                    column[j] = 1;
                }
            }
        }
        int[][] zeroMatrix = new int[matrix.length][matrix[0].length];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if ((row[i] == 1 || column[j] == 1)) {
                    zeroMatrix[i][j] = 0;
                } else {
                    zeroMatrix[i][j] = matrix[i][j];
                }
            }
        }
        return zeroMatrix;
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

