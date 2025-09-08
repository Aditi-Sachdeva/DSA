package arrays.arraysEasy;

/**
 * Problem: Majority Element
 * Link: https://leetcode.com/problems/majority-element/
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 * Approach: Boyer-Moore Voting Algorithm
 */


public class MajorityElement {
    public static void main(String[] args) {
        int[] nums = {2,2,1,1,1,2,2};
        System.out.println(majorityElement(nums));
    }
    public static int majorityElement(int[] nums) {
        int n = nums.length;
        int count =0;
        int temp=0;
        for(int i=0;i<n;i++){
            if(count == 0){
                temp = nums[i];
                count++;
            }
            else if(nums[i] == temp){
                count++;
            }
            else{
                count--;
            }
        }
        return temp;
    }
}
