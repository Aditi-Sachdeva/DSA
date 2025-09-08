package arrays.arraysEasy;

/**
 * Problem: Intersection of Two Arrays II
 * Link: https://leetcode.com/problems/intersection-of-two-arrays-ii/
 * Time Complexity: O(n log n + m log m)
 * Space Complexity: O(k)
 */

import java.util.ArrayList;
import java.util.Arrays;

public class IntersectionOfTwoArrays2{
    public static void main(String[] args) {
        int[] nums1 = {4,9,5};
        int[] nums2 = {9,4,9,8,4};
        System.out.println(Arrays.toString(intersect(nums1, nums2)));
        
    }
    public static int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        ArrayList<Integer> list = new ArrayList<>();
        int i=0;
        int j=0;
        while(i<nums1.length && j<nums2.length){
            if(nums1[i] < nums2[j]){
                i++;
            }
            else if(nums2[j] < nums1[i]){
                j++;
            }
            else{
                list.add(nums1[i]);
                i++;
                j++;
            }
        }
        int[] res = new int[list.size()];
        for(int k=0;k<list.size();k++){
            res[k] = list.get(k);
        }
        return res;
    }
}
