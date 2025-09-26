package arrays.arraysMedium;

/**
 * - Problem: Find Minimum in Rotated Sorted Array
 * - Link: https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/
 * - Time Complexity: O(log n)
 * - Space Complexity: O(1)
 */

public class FindMinimumInRotatedSortedArray {
    public static void main(String[] args) {
        int[] nums = {4,5,6,7,0,1,2};
        System.out.println(findMin(nums));
    }
    public static int findMin(int[] nums) {
        int n = nums.length;
        int low = 0;
        int high = n-1;
        int min = Integer.MAX_VALUE;
        while(low <= high){
            int mid = low+(high-low)/2;
            if(nums[low] <= nums[mid]){
                min = Math.min(min,nums[low]);
                low = mid+1;
            }
            else{
                min = Math.min(min,nums[mid]);
                high = mid-1;
            }
        }
        return min;
    }
}
