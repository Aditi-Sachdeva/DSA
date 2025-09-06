package arrays.arraysEasy;

/**
 * Problem: Missing Number
 * Link: https://leetcode.com/problems/missing-number/
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

public class MissingNumber {
    public static void main(String[] args) {
        int[] nums = {3,0,1};
        System.out.println(missingNumber(nums));
    }
    
    public static int missingNumber(int[] nums) {
        int n = nums.length;
        int XOR1 = 0;
        int XOR2 = 0;
        for(int i=0;i<n;i++){
            XOR1 ^= i;
            XOR2 ^= nums[i];
        }
        XOR1 ^= n;
        return XOR1 ^ XOR2;
    }

    // public static int missingNumber(int[] nums) {
    //     int n = nums.length;
    //     int actualSum=0;
    //     int expectedSum= n *(n+1)/2;
    //     for(int i =0;i<n;i++){
    //         actualSum += nums[i];
    //     }
    //     return expectedSum - actualSum;
    // }
}
