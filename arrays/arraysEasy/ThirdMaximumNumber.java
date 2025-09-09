package arrays.arraysEasy;

/**
 * Problem: Third Maximum Number
 * Link: https://leetcode.com/problems/third-maximum-number/
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

public class ThirdMaximumNumber {
    public static void main(String[] args) {
        int[] nums = {2,2,3,1};
        System.out.println(thirdMax(nums));
    }
    public static int thirdMax(int[] nums) {
        Long max = null;
        Long second_max = null;
        Long third_max = null;

        for (Integer num : nums) {
            long n = num;
            if ((max != null && n == max) ||
                    (second_max != null && n == second_max) ||
                    (third_max != null && n == third_max)) {
                continue;
            }

            if (max == null || n > max) {
                third_max = second_max;
                second_max = max;
                max = n;
            } else if (second_max == null || n > second_max) {
                third_max = second_max;
                second_max = n;
            } else if (third_max == null || n > third_max) {
                third_max = n;
            }
        }

        return (third_max == null) ? max.intValue() : third_max.intValue();
    }
}
