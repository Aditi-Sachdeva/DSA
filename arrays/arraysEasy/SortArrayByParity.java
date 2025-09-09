package arrays.arraysEasy;

/**
 * Problem: Sort Array By Parity
 * Link: https://leetcode.com/problems/sort-array-by-parity/
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */


import java.util.Arrays;

public class SortArrayByParity {
    public static void main(String[] args) {
        int[] nums = {3,1,2,4};
        System.out.println(Arrays.toString(sortArrayByParity(nums)));
    }
    public static int[] sortArrayByParity(int[] nums) {
        int n = nums.length;
        int left = 0;
        int right = n-1;
        while(left < right){
            if(nums[left] % 2 == 0){
                left++;
            }
            else if(nums[right]%2 != 0){
                right--;
            }
            else{
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                left++;
                right--;
            }
        }
        return  nums;
    }
}
