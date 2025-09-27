package arrays.arraysMedium;

/**
 * Title: Longest Subarray with Sum K (Positives, Negatives and Zeroes)
 * Pattern: Prefix Sum + HashMap
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */

import java.util.HashMap;

public class LongestSubarrayWithSumK {
    public static void main(String[] args) {
        int[] nums = {1, -1, 5, -2, 3};
        int k = 3;
        System.out.println(longestSubarray(nums, k)); 
    }
    public static int longestSubarray(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int sum = 0;
        int maxLen = 0;
        for(int i=0;i<nums.length;i++){
            sum += nums[i];
            if(sum == k){
                maxLen = i+1;
            }
            int rem = sum-k;
            if(map.containsKey(rem)){
                int len = i-map.get(rem);
                maxLen = Math.max(len,maxLen);
            }
            if(!map.containsKey(sum)){
                map.put(sum, i);
            }
        }
        return maxLen;

    }

}
