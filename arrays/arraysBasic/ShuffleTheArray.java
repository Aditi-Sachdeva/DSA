package arrays.arraysBasic;

/**
 * Problem: Shuffle the Array
 * Link: https://leetcode.com/problems/shuffle-the-array/
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */


import java.util.Arrays;

public class ShuffleTheArray {
    public static void main(String[] args) {
        int[] nums = {2,5,1,3,4,7};
        System.out.println(Arrays.toString(shuffle(nums,3)));
    }
    public static int[] shuffle(int[] nums, int n) {
        int[] ans = new int[2*n];
        int j = 0;
        for(int i = 0;i<n;i++){
            ans[j++] = nums[i];
            ans[j++] = nums[i+n];
        }
        return ans;
    }
}
