package arrays.arraysEasy;

/**
 * Problem: Minimum Absolute Difference
 * Link: https://leetcode.com/problems/minimum-absolute-difference/
 * Time Complexity: O(n log n)
 * Space Complexity: O(n)
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinimumAbsoluteDifference {
    public static void main(String[] args) {
        int[] arr = {4, 2, 1, 3};
        System.out.println(minimumAbsDifference(arr));
    }
    public static List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        List<List<Integer>> list = new ArrayList<>();
        int min = Integer.MAX_VALUE;
        for(int i=0;i<arr.length-1;i++){
            int diff = arr[i+1] - arr[i];
            if(diff < min){
                min = diff;
                list.clear();
                list.add(Arrays.asList(arr[i],arr[i+1]));
            }
            else if(diff == min){
                list.add(Arrays.asList(arr[i],arr[i+1]));
            }
        }
        return list;
    }
}
