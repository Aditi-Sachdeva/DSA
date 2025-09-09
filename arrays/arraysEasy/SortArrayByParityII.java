package arrays.arraysEasy;

/**
 * Problem: Sort Array By Parity II
 * Link: https://leetcode.com/problems/sort-array-by-parity-ii/
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

import java.util.Arrays;

public class SortArrayByParityII {
    public static void main(String[] args) {
        int[] nums = {4,2,5,7};
        System.out.println(Arrays.toString(sortArrayByParityII(nums)));
    }
    public static int[] sortArrayByParityII(int[] nums) {
        int n = nums.length;
        int i=0;
        int j=1;
        while(i<n && j<n){
            if(nums[i]%2==0 ){
                i+=2;
            }
            else if(nums[j]%2 == 1){
                j+=2;
            }
            else{
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i+=2;
                j+=2;
            }
        }
        return nums;
    }
}
