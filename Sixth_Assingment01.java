package Assingment;

import java.util.Arrays;

public class Sixth_Assingment01 {

    public static void duplicateZeros(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            if (arr[i] == 0) {
                // Shift the elements to the right
                for (int j = n - 1; j > i; j--) {
                    arr[j] = arr[j - 1];
                }

                // Duplicate the zero
                arr[++i] = 0;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 0, 2, 3, 0, 4, 5, 0};
        duplicateZeros(arr1);
        printArray(arr1);
        // Output: [1, 0, 0, 2, 3, 0, 0, 4]

        int[] arr2 = {1, 2, 3};
        duplicateZeros(arr2);
        printArray(arr2);
        // Output: [1, 2, 3]
    }

    private static void printArray(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }
}
