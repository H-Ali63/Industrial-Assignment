package Assingment;

import java.util.Arrays;

public class Fifth_Assingment01 {

    public static int[][] construct2DArray(int[] original, int m, int n) {
        int totalElements = original.length;

        if (m * n != totalElements) {
            // If it's impossible to create the 2D array, return an empty array
            return new int[0][0];
        }

        int[][] result = new int[m][n];

        int currentIndex = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                result[i][j] = original[currentIndex];
                currentIndex++;

                if (currentIndex >= totalElements) {
                    // All elements from the original array are used
                    return result;
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] original1 = {1, 2, 3, 4};
        int m1 = 2;
        int n1 = 2;
        int[][] result1 = construct2DArray(original1, m1, n1);
        printArray(result1);
        // Output: [[1, 2], [3, 4]]

        int[] original2 = {1, 2, 3};
        int m2 = 1;
        int n2 = 3;
        int[][] result2 = construct2DArray(original2, m2, n2);
        printArray(result2);
        // Output: [[1, 2, 3]]

        int[] original3 = {1, 2};
        int m3 = 1;
        int n3 = 1;
        int[][] result3 = construct2DArray(original3, m3, n3);
        printArray(result3);
        // Output: [] (Empty 2D array)
    }

    private static void printArray(int[][] array) {
        for (int[] row : array) {
            System.out.println(Arrays.toString(row));
        }
    }
}
