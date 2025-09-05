package arrays.arraysBasic;

/**
 * Problem: Concatenation of Array
 * Link: https://leetcode.com/problems/concatenation-of-array/
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */

import java.util.Arrays;

public class ConcatenationOfArray{
    public static void main(String[] args) {
        int[] nums = {1,3,2,1};
        System.out.println(Arrays.toString(getConcatenation(nums)));
    }

    public static int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n*2];
        for(int i = 0;i<n;i++){
            ans[i] = nums[i];
            ans[i+n] = nums[i];
        }
        return ans;
    }
}