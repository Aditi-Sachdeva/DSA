package arrays.arraysEasy;

/**
 * Problem: Largest Perimeter Triangle
 * Link: https://leetcode.com/problems/largest-perimeter-triangle/
 * Time Complexity: O(n log n)
 * Space Complexity: O(1)
 */

import java.util.Arrays;

public class LargestPerimeterTriangle {
    public static void main(String[] args) {
        int[] nums = {1,2,1,10};
        System.out.println(largestPerimeter(nums));
    }
    public static int largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        for(int i=n-1;i>=2;i--){
            int a = nums[i];
            int b = nums[i-1];
            int c = nums[i-2];

            if(b+c>a){
                return a+b+c;
            }
        }
        return 0;
    }
}
