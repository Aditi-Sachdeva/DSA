package arrays.arraysEasy;

/**
 * Problem: Single Number
 * Link: https://leetcode.com/problems/single-number/
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

public class SingleNumber {
    public static void main(String[] args) {
        int[] nums = {4,1,2,1,2};
        System.out.println(singleNumber(nums));
    }
    public static int singleNumber(int[] nums) {
        int xor=0;
        for(int n : nums){
            xor ^= n;
        }
        return xor;
    }
}
