package arrays.arraysEasy;

/**
 * Problem: Check if Array is Sorted and Rotated
 * Link: https://leetcode.com/problems/check-if-array-is-sorted-and-rotated/
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

 
public class CheckIfArrayIsSortedAndRotated {
    public static void main(String[] args) {
        int[] nums = {3,4,5,1,2};
        System.out.println(check(nums));
    }
    public static boolean check(int[] nums) {
        int n = nums.length;
        int count=0;
        for(int i=0;i<n;i++){
            if(nums[i] > nums[(i+1)%n]){
                count++;
                if(count>1){
                    return false;
                }
            }
        }
        return true;
    }
}
