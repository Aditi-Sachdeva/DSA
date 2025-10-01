package arrays.arrays2D;

import java.util.Arrays;

/**
 * Problem: Transpose Matrix
 * Link: https://leetcode.com/problems/transpose-matrix/
 * Time Complexity: O(m × n)
 * Space Complexity: O(n × m)
 */

public class TransposeMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6}
        };

        int[][] result = transpose(matrix);
        System.out.println(Arrays.deepToString(result)); 
    }

    public static int[][] transpose(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int[][] t = new int[n][m];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                t[j][i] = matrix[i][j];
            }
        }

        return t;
    }
}