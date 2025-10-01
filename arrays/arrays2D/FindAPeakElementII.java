package arrays.arrays2D;

/**
 * Problem: Find a Peak Element II
 * Link: https://leetcode.com/problems/find-a-peak-element-ii/
 * Time Complexity: O(n × log m) - Binary search on columns
 * Space Complexity: O(1)
 */

import java.util.Arrays;

public class FindAPeakElementII {
    public static void main(String[] args) {
        int[][] mat = {{1,4},{3,2}};
        System.out.println(Arrays.toString(findPeakGrid(mat)));
    }
    public static int[] findPeakGrid(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;
        int low = 0;
        int high = m-1;
        while(low <= high){
            int mid = low+(high-low)/2;
            int row = maxIndex(mat,n,m,mid);
            int left = mid-1>=0 ? mat[row][mid-1] : -1;
            int right = mid+1 <m ? mat[row][mid+1] : -1;
            if(mat[row][mid] > left && mat[row][mid] > right){
                return new int[] {row,mid};
            }
            else if(mat[row][mid] < left){
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return new int[] {-1,-1};
    }

    public static int maxIndex(int[][] mat, int n, int m , int col){
        int max = -1;
        int idx = -1;
        for(int i=0;i<n;i++){
            if(mat[i][col] > max){
                max = mat[i][col];
                idx = i;
            }
        }
        return idx;
    }
}
