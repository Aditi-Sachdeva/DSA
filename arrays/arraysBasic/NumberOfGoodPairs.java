package arrays.arraysBasic;

/**
 * Problem: Number of Good Pairs
 * Link: https://leetcode.com/problems/number-of-good-pairs/
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */


public class NumberOfGoodPairs {
    public static void main(String[] args) {
        int[] nums = {1,2,3,1,1,3};
        System.out.println(numIdenticalPairs(nums));
    }
    public static int numIdenticalPairs(int[] nums) {
        int[] freq = new int[101];
        int count = 0;
        for(int n:nums){
            freq[n]++;
            count += freq[n] - 1;
        }
        return count;
    }
}
