package arrays.arrays2DBasic;

/**
 * Problem: Cells with Odd Values in a Matrix
 * Link: https://leetcode.com/problems/cells-with-odd-values-in-a-matrix/
 * Time Complexity: O(k + m × n)
 * Space Complexity: O(m + n)
 */

public class CellsWithOddValuesInAMatrix {
    public static void main(String[] args) {
        int m = 2;
        int n = 3;
        int[][] indices = {{0,1},{1,1}};
        System.out.println(oddCells(m, n, indices));
    }
    public static int oddCells(int m, int n, int[][] indices) {
        int[] row = new int[m];
        int[] col = new int[n];
        for(int[] i : indices){
            row[i[0]]++;
            col[i[1]]++;
        }
        int count = 0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if((row[i]+col[j])%2!=0){
                    count++;
                }
            }
        }
        return count;
    }
}
