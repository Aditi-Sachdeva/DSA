package arrays.arraysMedium;

/**
 * - Problem: Jump Game
 * - Link: https://leetcode.com/problems/jump-game/
 * - Time Complexity: O(n)
 * - Space Complexity: O(1)
 */

public class JumpGame {
    public static void main(String[] args) {
        int[] nums = {2,3,1,1,4};
        System.out.println(canJump(nums));
    }
    public static boolean canJump(int[] nums) {
        int max = 0;
        for(int i=0;i<nums.length;i++){
            if(i>max){
                return false;
            }
            max = Math.max(max,nums[i]+i);

            if(max >= nums.length-1){
                return true;
            }
        }
        return true;
    }
}

