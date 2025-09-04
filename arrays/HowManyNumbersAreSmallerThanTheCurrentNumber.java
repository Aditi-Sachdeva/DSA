package arrays;

/**
 * Problem: How Many Numbers Are Smaller Than the Current Number
 * Link: https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/
 * Time Complexity: O(n+k) → k = 101, treated as O(n) for fixed input range
 * Space Complexity: O(k) -> k = 101, treated as O(1) for fixed input range
 */

import java.util.Arrays;

public class HowManyNumbersAreSmallerThanTheCurrentNumber {
    public static void main(String[] args) {
        int[] nums = {8,1,2,2,3};
        System.out.println(Arrays.toString(smallerNumbersThanCurrent(nums)));
    }
    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] freq = new int[101];
        for(int n : nums){
            freq[n]++;
        }
        for(int i = 1;i<101;i++){
            freq[i] = freq[i] + freq[i-1];
        }
        int[] res = new int[nums.length];
        for(int i =0;i<nums.length;i++){
            if(nums[i] == 0){
                res[i] = 0;
            }
            else{
                res[i] = freq[nums[i]-1];
            }
        }
        return res;
    }
}
