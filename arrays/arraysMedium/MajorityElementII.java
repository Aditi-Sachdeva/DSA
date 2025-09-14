package arrays.arraysMedium;

/**
 * Problem: Majority Element II
 * Link: https://leetcode.com/problems/majority-element-ii/
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

import java.util.ArrayList;
import java.util.List;

public class MajorityElementII {
    public static void main(String[] args) {
        int[] nums = {3,2,3};
        System.out.println(majorityElement(nums));
    }
    public static List<Integer> majorityElement(int[] nums) {
        int c1 =0;
        int c2 = 0;
        int n = nums.length;
        int el1 = Integer.MIN_VALUE;
        int el2 = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(c1 == 0 && el2 != nums[i]){
                el1 = nums[i];
                c1 = 1;
            }
            else if(c2 == 0 && el1 != nums[i]){
                el2 = nums[i];
                c2 = 1;
            }
            else if(el1 == nums[i]){
                c1++;
            }
            else if(el2 == nums[i]){
                c2++;
            }
            else{
                c1--;
                c2--;
            }
        }

        List<Integer> list = new ArrayList<>();
        c1 = 0;
        c2 = 0;
        for(int i=0;i<n;i++){
            if(el1 == nums[i]){
                c1++;
            }
            if(el2 == nums[i]){
                c2++;
            }
        }

        int min = (int)(n/3) + 1;
        if(c1 >= min){
            list.add(el1);
        }
        if(c2 >= min){
            list.add(el2);
        }
        return list;
    }
}
