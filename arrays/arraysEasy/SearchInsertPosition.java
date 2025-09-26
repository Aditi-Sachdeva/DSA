package arrays.arraysEasy;

/**
 * Problem: Search Insert Position
 * Link: https://leetcode.com/problems/search-insert-position/
 * Time Complexity: O(log n)
 * Space Complexity: O(1)
 */

public class SearchInsertPosition {
    public static void main(String[] args) {
        int[] nums = {1,3,5,6};
        int target = 2;
        System.out.println(searchInsert(nums, target));
    }
    public static int searchInsert(int[] nums, int target) {
        int n = nums.length;
        int ans = n;
        int low=0;
        int high = n-1;
        while(low<=high){
            int mid = low+(high-low)/2 ;
            if(nums[mid] >= target ){
                ans = mid;
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return ans;
    }
}
