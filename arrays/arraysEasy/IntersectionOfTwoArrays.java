package arrays.arraysEasy;

/**
 * Problem: Intersection of Two Arrays
 * Link: https://leetcode.com/problems/intersection-of-two-arrays/
 * Time Complexity: O(n log n + m log m)
 * Space Complexity: O(k) — for result list
 */

import java.util.ArrayList;
import java.util.Arrays;

public class IntersectionOfTwoArrays {
    public static void main(String[] args) {
        int[] nums1 = {1,2,2,1};   // Duplicates not allowed
        int[] nums2 = {2,2};
        System.out.println(Arrays.toString(intersection(nums1, nums2)));
    }
    public static int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        ArrayList<Integer> list = new ArrayList<>();
        int i = 0;
        int j = 0;
        while(i<nums1.length && j<nums2.length){
            if(nums1[i] == nums2[j]){
                if(list.isEmpty() || list.get(list.size()-1) != nums1[i]){
                    list.add(nums1[i]);
                }
                i++;
                j++;
            }
            else if(nums1[i] > nums2[j]){
                j++;
            }
            else{
                i++;
            }
        }

        int[] res = new int[list.size()];
        for(int k=0;k<list.size();k++){
            res[k] = list.get(k);
        }
        return res;

    }
}
