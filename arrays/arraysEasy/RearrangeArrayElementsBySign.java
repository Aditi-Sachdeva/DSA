package arrays.arraysEasy;

/**
 * Problem: Rearrange Array Elements by Sign
 * Link: https://leetcode.com/problems/rearrange-array-elements-by-sign/
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */

import java.util.Arrays;

public class RearrangeArrayElementsBySign {
    public static void main(String[] args) {
        int[] nums = {3,1,-2,-5,2,-4};
        System.out.println(Arrays.toString(rearrangeArray(nums)));

    }
    public static int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        int posIdx = 0;
        int negIdx = 1;
        for(int i=0;i<n;i++){
            if(nums[i] > 0){
                ans[posIdx] = nums[i];
                posIdx += 2;
            }
            else{
                ans[negIdx] = nums[i];
                negIdx += 2;
            }
        }
        return ans;
    }
}
