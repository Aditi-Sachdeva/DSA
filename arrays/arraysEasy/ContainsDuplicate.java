package arrays.arraysEasy;

/**
 * Problem: Contains Duplicate
 * Link: https://leetcode.com/problems/contains-duplicate/
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */

import java.util.HashSet;

public class ContainsDuplicate {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 1 };
        System.out.println(containsDuplicate(nums));
    }

    public static boolean containsDuplicate(int[] nums) {

        HashSet<Integer> set = new HashSet<>();
        for (int n : nums) {
            if (!set.add(n)) {
                return true;
            }
        }
        return false;

    }

    // public static boolean containsDuplicate(int[] nums) {
    //     HashSet<Integer> set = new HashSet<>();
    //     for (int n : nums) {
    //         if (set.contains(n)) {
    //             return true;
    //         }
    //         set.add(n);
    //     }
    //     return false;
    // }


    /**
     * Time Complexity: O(n log n)
     * Space Complexity: O(1) if sorting in-place
    */

    // public static boolean containsDuplicate(int[] nums) {
    //         Arrays.sort(nums);
    //         for(int i=1;i<nums.length;i++){
    //             if(nums[i]-nums[i-1] == 0){
    //                 return true;
    //             }
    //         }
    //     return false;
    // }


}
