package arrays.arrays2D;

/**
 * Problem: Search a 2D Matrix
 * Link: https://leetcode.com/problems/search-a-2d-matrix/
 * Time Complexity: O(log(m × n))
 * Space Complexity: O(1)
 */

public class SearchA2DMatrix {
    public static void main(String[] args) {
        int[][] matrix = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int target = 3;
        System.out.println(searchMatrix(matrix, target));
    }
    public static boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length;
        int m = matrix[0].length;
        int low = 0;
        int high = n*m-1;
        while(low<=high){
            int mid = low + (high-low)/2;
            int row = mid/m;
            int col = mid%m;
            if(matrix[row][col] == target){
                return true;
            }
            else if(matrix[row][col] > target){
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return false;
    }
}
