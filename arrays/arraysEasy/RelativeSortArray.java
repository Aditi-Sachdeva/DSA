package arrays.arraysEasy;

/**
 * Problem: Relative Sort Array
 * Link: https://leetcode.com/problems/relative-sort-array/
 * Time Complexity: O(n + k) where k = 1001
 * Space Complexity: O(k)
 */

import java.util.Arrays;

public class RelativeSortArray {
    public static void main(String[] args) {
        int[] arr1 = {2,3,1,3,2,4,6,7,9,2,19};
        int[] arr2 = {2,1,4,3,9,6};
        System.out.println(Arrays.toString(relativeSortArray(arr1, arr2)));
    }
    public static int[] relativeSortArray(int[] arr1, int[] arr2) {
        int[] freq = new int[1001];
        for(int num : arr1){
            freq[num]++;
        }

        int[] res = new int[arr1.length];
        int idx = 0;

        for(int num : arr2){
            while(freq[num] != 0){
                res[idx++] = num;
                freq[num]--;
            }
        }

        for(int num=0;num<1001;num++){
            while(freq[num] > 0){
                res[idx++] = num;
                freq[num]--;
            }
        }

        return res;
    }
}
