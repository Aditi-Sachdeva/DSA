package arrays.arrays2D;

/**
 * Problem: Matrix Diagonal Sum
 * Link: https://leetcode.com/problems/matrix-diagonal-sum/
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

public class MatrixDiagonalSum {
    public static void main(String[] args) {
        int[][] mat = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(diagonalSum(mat));
    }
    public static int diagonalSum(int[][] mat) {
        int n = mat.length;
        int sum = 0;
        for(int i =0;i<n;i++){
            sum += mat[i][i];
            sum += mat[i][n-i-1];
        }
        if(n%2!=0){
            sum -= mat[n/2][n/2];
        }
        return sum;
    }
}
