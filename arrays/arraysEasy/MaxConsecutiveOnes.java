package arrays.arraysEasy;

/**
 * Problem: Max Consecutive Ones
 * Link: https://leetcode.com/problems/max-consecutive-ones/
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

public class MaxConsecutiveOnes {
    public static void main(String[] args) {
        int[] nums = {1,1,0,1,1,1};
        System.out.println(findMaxConsecutiveOnes(nums));
    }
    public static int findMaxConsecutiveOnes(int[] nums) {
        int count=0;
        int max=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                count++;
                max = Math.max(count,max);
            }
            else{
                count = 0;
            }
        }
        return max;
    }
}
