/**
Rotate Matrix: Given an image represented by an NxN matrix, where each pixel in the image is 4
bytes, write a method to rotate the image by 90 degrees. (an you do this in place? 
 */
public class Util {
    public static void main(String args[]) {
        int[][] matrix = {
                            {1,2,3},
                            {4,5,6},
                            {7,8,0}
                        };
        matrix = createZeroMatrix(matrix);
        System.out.println("Zero Matrix:");
        displayMatrix(matrix);
    }

    public static void displayMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] createZeroMatrix(int[][] matrix) {
        //int[][] zeroMatrix = new int[matrix.length][matrix[0].length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    // make ith row zero
                    for (int r = 0; r < matrix.length; r++) {
                        matrix[r][j] = 0;
                    }
                    // make jth column zero
                    for (int c = 0; c < matrix[0].length; c++) {
                        matrix[i][c] = 0;
                    }
                }
            }
        }
        return matrix;

    }
}