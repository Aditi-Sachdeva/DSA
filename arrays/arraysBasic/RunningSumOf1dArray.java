package arrays.arraysBasic;


/**
 * Problem: Running Sum of 1d Array
 * Link: https://leetcode.com/problems/running-sum-of-1d-array/
 * Time Complexity: O(n)
 * Space Complexity: O(1) 
 */

import java.util.Arrays;

public class RunningSumOf1dArray {
    public static void main(String[] args) {
        int[] nums = {3,1,2,10,1};
        System.out.println(Arrays.toString(runningSum(nums)));
    }
    public static int[] runningSum(int[] nums) {
        for(int i = 1;i<nums.length;i++){
            nums[i] += nums[i-1];
        }
        return nums;
    }
}
