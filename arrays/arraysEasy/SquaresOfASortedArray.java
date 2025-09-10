package arrays.arraysEasy;

/**
 * Problem: Squares of a Sorted Array
 * Link: https://leetcode.com/problems/squares-of-a-sorted-array/
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */

import java.util.Arrays;

public class SquaresOfASortedArray {
    public static void main(String[] args) {
        int[] nums = {-7,-3,2,3,11};
        System.out.println(Arrays.toString(sortedSquares(nums)));

    }
    public static int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        int left =0;
        int right = n-1;
        int pos = n-1;
        while(left <= right){
            int leftSq = nums[left] * nums[left];
            int rightSq = nums[right] * nums[right];
            if(leftSq > rightSq){
                res[pos--] = leftSq;
                left++;
            }
            else{
                res[pos--] = rightSq;
                right--;
            }
        }
        return res;
    }
    
}
