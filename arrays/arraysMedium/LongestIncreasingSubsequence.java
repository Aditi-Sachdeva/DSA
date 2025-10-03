package arrays.arraysMedium;

/**
 * Problem: Longest Increasing Subsequence
 * Link: https://leetcode.com/problems/longest-increasing-subsequence/
 * Time Complexity: O(n log n)
 * Space Complexity: O(n)
 */

import java.util.ArrayList;
import java.util.List;

public class LongestIncreasingSubsequence {
    public static void main(String[] args) {
        int[] nums = {10,9,2,5,3,7,101,18};
        System.out.println(lengthOfLIS(nums));
    }
    public static int lengthOfLIS(int[] nums) {
        List<Integer> list = new ArrayList<>();
        int n = nums.length;
        list.add(nums[0]);
        for(int i=1;i<n;i++){
            if(nums[i] > list.get(list.size()-1)){
                list.add(nums[i]);
            }
            else {
                int idx = lowerBound(list,nums[i]);
                list.set(idx,nums[i]);
            }
        }
        return list.size();
    }

    public static int lowerBound(List<Integer> list, int num){
        int low = 0;
        int high = list.size()-1;
        int idx = -1;
        while(low <= high){
            int mid = low+(high-low)/2;
            if(list.get(mid) >= num){
                idx = mid;
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return idx;
    }
}
