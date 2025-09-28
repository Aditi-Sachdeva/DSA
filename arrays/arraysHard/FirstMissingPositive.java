package arrays.arraysHard;

/**
 * Problem: First Missing Positive
 * Link: https://leetcode.com/problems/first-missing-positive/
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

public class FirstMissingPositive {
    public static void main(String[] args) {
        int[] nums = {1,2,0};
        System.out.println(firstMissingPositive(nums));
    }

    public static int firstMissingPositive(int[] nums) {
        int i = 0;
        int n = nums.length;
        while (i < n) {
            int correct = nums[i] - 1;
            if (nums[i] > 0 && nums[i] <= n && nums[i] != nums[correct]) {
                int temp = nums[i];
                nums[i] = nums[correct];
                nums[correct] = temp;
            } else {
                i++;
            }
        }
        for (int idx = 0; idx < n; idx++) {
            if (nums[idx] != idx + 1) {
                return idx + 1;
            }
        }
        return n + 1;
    }
}
