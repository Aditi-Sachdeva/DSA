package arrays.arraysMedium;

/**
- Problem: Spiral Matrix II
- Link: https://leetcode.com/problems/spiral-matrix-ii/
- Time Complexity: O(n^2)
- Space Complexity: O(n^2)
*/

import java.util.Arrays;

public class SpiralMatrixII {
    public static void main(String[] args) {
        int n = 3;
        System.out.println(Arrays.deepToString(generateMatrix(n)));
    }
    public static int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];
        int  num = 1;
        int top = 0;
        int left = 0;
        int right = n-1;
        int bottom = n-1;
        while(left <=right && top<=bottom){
            for(int i=left ; i<=right;i++){
                matrix[top][i] = num++;
            }
            top++;
            for(int i=top;i<=bottom;i++){
                matrix[i][right] = num++;
            }
            right--;
            if(top<=bottom){
                for(int i=right;i>=left;i--){
                    matrix[bottom][i] = num++;
                }
                bottom--;
            }
            if(left <= right){
                for(int i=bottom;i>=top;i--){
                    matrix[i][left] = num++;
                }
                left++;
            }
        }

        return matrix;

    }
}
