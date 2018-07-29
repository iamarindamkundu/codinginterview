/**
Rotate Matrix: Given an image represented by an NxN matrix, where each pixel in the image is 4
bytes, write a method to rotate the image by 90 degrees. (an you do this in place? 
 */

public class Util {
    public static void main(String args[]) {
        int[][] matrix = {  {1, 2, 3}, 
                            {4, 5, 6}, 
                            {7, 8, 9}
                        };
        int[][] rotatedMatrix = rotateMatrix(matrix);
        System.out.println("Rotated Matrix");
        for (int i = 0 ; i < matrix[0].length; i++) {
            for(int j = 0 ;j<matrix[0].length; j++) {
                System.out.print(rotatedMatrix[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static int[][] rotateMatrix(int[][] matrix) {
        int[][] rotatedMatrix = new int[matrix[0].length][matrix[0].length];
        for (int i = 0 ; i < matrix[0].length; i++) {
            int k = matrix[0].length-1;
            for (int j = 0; j < matrix[0].length; j++, k--) {
                rotatedMatrix[k][i] = matrix[i][j];
            }
        }
        return rotatedMatrix;
    }
}