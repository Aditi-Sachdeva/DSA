package arrays.arraysEasy;

/**
 * Problem: Maximum Product of Three Numbers
 * Link: https://leetcode.com/problems/maximum-product-of-three-numbers/
 * Time Complexity: O(n log n)
 * Space Complexity: O(1)
 */

import java.util.Arrays;

public class MaximumProductOfThreeNumbers {
    public static void main(String[] args) {
        int[] nums = { -1, -2, -3 };
        System.out.println(maximumProduct(nums));
    }

    public static int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int m1 = nums[0] * nums[1] * nums[n - 1];
        int m2 = nums[n - 1] * nums[n - 2] * nums[n - 3];
        return Math.max(m1, m2);
    }

    /**
     * Problem: Maximum Product of Three Numbers
     * Link: https://leetcode.com/problems/maximum-product-of-three-numbers/
     * Time Complexity: O(n)
     * Space Complexity: O(1)
     */

    // public static int maximumProduct(int[] nums) {
    // int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE, max3 =
    // Integer.MIN_VALUE;
    // int min1 = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE;

    // for (int num : nums) {
    // if (num > max1) {
    // max3 = max2;
    // max2 = max1;
    // max1 = num;
    // } else if (num > max2) {
    // max3 = max2;
    // max2 = num;
    // } else if (num > max3) {
    // max3 = num;
    // }
    // if (num < min1) {
    // min2 = min1;
    // min1 = num;
    // } else if (num < min2) {
    // min2 = num;
    // }
    // }
    // return Math.max(max1 * max2 * max3, min1 * min2 * max1);
    // }

}
