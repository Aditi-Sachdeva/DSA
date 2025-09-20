package arrays.arraysMedium;

/**
 * - Problem: Find First and Last Position of Element in Sorted Array
 * - Link: https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
 * - Time Complexity: O(log n)
 * - Space Complexity: O(1)
 */

import java.util.Arrays;

public class FindFirstAndLastPositionOfElementInSortedArray {
    public static void main(String[] args) {
        int[] nums = {5,7,7,8,8,10};
        int target = 8;
        System.out.println(Arrays.toString(searchRange(nums, target)));
    }
    public static int[] searchRange(int[] nums, int target) {
        int n = nums.length;
        int firstIdx = findFirstIndex(nums,target,n);
        if(firstIdx == -1){
            return new int[] {-1,-1};
        }
        int lastIdx = findLastIndex(nums,target,n);
        return new int[] {firstIdx,lastIdx};
    }

    public static int findFirstIndex(int[] arr, int target, int n){
        int first = -1;
        int low = 0;
        int high = n-1;
        while(low<=high){
            int mid = low + (high-low)/2;
            if(arr[mid] == target){
                first = mid;
                high = mid-1;
            }
            else if(arr[mid] > target){
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return first;
    }

    public static int findLastIndex(int[] arr, int target, int n){
        int last = -1;
        int low = 0;
        int high = n-1;
        while(low<=high){
            int mid = low + (high-low)/2;
            if(arr[mid] == target){
                last = mid;
                low = mid+1;
            }
            else if(arr[mid] > target){
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return last;
    }
}
