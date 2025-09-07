package arrays.arraysEasy;

/**
 * Problem: Sort Colors
 * Link: https://leetcode.com/problems/sort-colors/
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

import java.util.Arrays;

public class SortColors {
    public static void main(String[] args) {
        int[] nums = {2,0,2,1,1,0};
        sortColors(nums);
        System.out.println(Arrays.toString(nums));
    }
    public static void sortColors(int[] nums) {
       int n = nums.length;
       int low = 0;
       int mid=0;
       int high = n-1;
       while(mid <= high){
        if(nums[mid] == 0){
            int temp = nums[mid];
            nums[mid] = nums[low];
            nums[low] = temp;
            low++;
            mid++;
        }
        else if(nums[mid] == 1){
            mid++;
        }
        else{
            int temp = nums[high];
            nums[high] = nums[mid];
            nums[mid] = temp;
            high--;
        }
       }
    }
}
