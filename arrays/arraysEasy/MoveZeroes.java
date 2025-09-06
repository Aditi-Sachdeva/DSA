package arrays.arraysEasy;

import java.util.Arrays;

/**
 * Problem: Move Zeroes
 * Link: https://leetcode.com/problems/move-zeroes/
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

public class MoveZeroes {
    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12};
        moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }
    public static void moveZeroes(int[] nums) {
        int n = nums.length;
        int i=0;
        for(int j=0;j<n;j++){
            if(nums[j] != 0){
                nums[i++] = nums[j];
            }
        }
        while(i<n){
            nums[i++] = 0;
        }
    }
}
