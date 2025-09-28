package arrays.arraysMedium;

/**
 * Title: Longest Subarray with Sum K (Only Positives)
 * Pattern: Sliding Window
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */


public class LongestSubarrayWithSumKOnlyPositives {
    public static void main(String[] args) {
        int[] nums = {10, 5, 2, 7, 1, 9};
        int k = 15;
        System.out.println(longestSubarray(nums, k));
    }
    public static int longestSubarray(int[] nums, int k) {
        int left = 0;
        int right = 0;
        int maxLen = 0;
        int sum = 0;
        int n = nums.length;
        while(right < n){
            sum += nums[right];
            while(sum > k){
                sum -= nums[left];
                left++;
            }
            if(sum == k){
                maxLen = Math.max(maxLen,right-left+1);
            }
            right++;
        }
        return maxLen;
    }
}

