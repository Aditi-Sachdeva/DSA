package arrays.arraysMedium;

/**
- Problem: Next Permutation
- Link: https://leetcode.com/problems/next-permutation/
- Time Complexity: O(n)
- Space Complexity: O(1)
*/

import java.util.Arrays;

public class NextPermutation {
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        nextPermutation(nums);
        System.out.println(Arrays.toString(nums));
    }
    public static void nextPermutation(int[] nums) {
        int n = nums.length;
        int idx =-1;
        for(int i=n-2;i>=0;i--){
            if(nums[i] < nums[i+1]){
                idx = i;
                break;
            }
        }
        if(idx != -1){
            for(int i=n-1;i>=0;i--){
                if(nums[i] > nums[idx]){
                    swap(nums,i,idx);
                    break;
                }
            }
        }
        reverse(nums,idx+1,n-1);
    }

    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void reverse(int[] arr, int left, int right) {
        while (left < right) {
            swap(arr,left,right);
            left++;
            right--;
        }
    }
}
