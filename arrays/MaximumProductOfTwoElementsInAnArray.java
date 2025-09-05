package arrays;

/**
 * Problem: Maximum Product of Two Elements in an Array
 * Link: https://leetcode.com/problems/maximum-product-of-two-elements-in-an-array/
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

 
public class MaximumProductOfTwoElementsInAnArray {
    public static void main(String[] args) {
        int[] nums = {1,5,4,5};
        System.out.println(maxProduct(nums));
    }
    public static int maxProduct(int[] nums) {
        int m1 = 0;
        int m2=0;
        for(int i =0;i<nums.length;i++){
            if(nums[i] > m1){
                m2 = m1;
                m1 = nums[i];
            }
            else if(nums[i] > m2){
                m2 = nums[i];
            }
        }
        return (m1-1)*(m2-1);
    }
}
