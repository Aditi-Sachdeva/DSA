package arrays.arraysMedium;

/**
- Problem: Longest Consecutive Sequence
- Link: https://leetcode.com/problems/longest-consecutive-sequence/
- Time Complexity: O(n)
- Space Complexity: O(n)
*/

import java.util.HashSet;

public class LongestConsecutiveSequence {
    public static void main(String[] args) {
        int[] nums = {100,4,200,1,3,2};
        System.out.println(longestConsecutive(nums));

    }
    public static int longestConsecutive(int[] nums) {
        int maxLength = 0;
        if(nums.length == 0){
            return 0;
        }
        HashSet<Integer> set = new HashSet<>();
        for(int n : nums){
            set.add(n);
        }

        for(int n : set){
            if(!set.contains(n-1)){
                int num = n;
                int count = 1;

                while(set.contains(num+1)){
                    num++;
                    count++;
                }

                maxLength = Math.max(count,maxLength);
            }
        }
        return maxLength;
    }
}
