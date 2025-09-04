package arrays;

/**
 * Problem: Create Target Array in the Given Order
 * Link: https://leetcode.com/problems/create-target-array-in-the-given-order/
 * Time Complexity: O(n²)
 * Space Complexity: O(n)
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CreateTargetArrayInGivenOrder {
    public static void main(String[] args) {
        int[] nums = {0,1,2,3,4};
        int[] index = {0,1,2,2,1};
        System.out.println(Arrays.toString(createTargetArray(nums, index)));
        
    }
    public static int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> list = new ArrayList<>();
        for(int i = 0;i<nums.length;i++){
            list.add(index[i],nums[i]);
        }
        int[] res = new int[list.size()];
        for(int i = 0;i<list.size();i++){
            res[i] = list.get(i);
        }
        return res;
    }
}
