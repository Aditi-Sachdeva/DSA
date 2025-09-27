package arrays.arraysMedium;

/**
 * Problem: Maximum Subarray
 * Link: https://leetcode.com/problems/maximum-subarray/
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 * Approach: Kadane's Algorithm — track running sum and reset if it dips below zero.
 */

public class MaximumSubarray {
    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(nums));

    }
    public static int maxSubArray(int[] nums) {
        int n = nums.length;
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            sum += nums[i];
            if(sum > maxSum){
                maxSum = sum;
            }
            if(sum < 0){
                sum = 0;
            }
        }
        return maxSum;
    }
}
