package arrays.arraysEasy;

/**
 * Problem: Check If N and Its Double Exist
 * Link: https://leetcode.com/problems/check-if-n-and-its-double-exist/
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */

import java.util.HashSet;

public class CheckIfNAndItsDoubleExist {
    public static void main(String[] args) {
        int[] arr = {10,2,5,3};
        System.out.println(checkIfExist(arr));
    }
    public static boolean checkIfExist(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        for(int n : arr){
            if(set.contains(n*2) || (n%2==0 && set.contains(n/2))){
                return true;
            }
            set.add(n);
        }
        return false;
        // int zeroCount = 0;
        // for(int n : arr){
        //     if(n==0){
        //         zeroCount++;
        //         if(zeroCount == 2){
        //             return true;
        //         }
        //     }
        //     else{
        //         if(set.contains(2*n) || (n%2==0 && set.contains(n/2))){
        //             return true;
        //         }
        //     }
        //     set.add(n);
        // }
        // return false;
    }
}
