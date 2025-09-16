package arrays.arraysMedium;

/**
 * Problem: Find the Kth Missing Positive Number
 * Link: https://leetcode.com/problems/find-the-kth-missing-positive-number/
 * Time Complexity: O(log n)
 * Space Complexity: O(1)
 */

public class KthMissingPositiveNumber {
    public static void main(String[] args) {
        int[] arr = {2,3,4,7,11};
        int k = 5;
        System.out.println(findKthPositive(arr, k));
    }
    public static int findKthPositive(int[] arr, int k) {
        int low = 0;
        int high = arr.length - 1;
        while(low <= high){
            int mid = (low+high)/2;
            int missing = arr[mid] - (mid + 1);
            if(missing < k){
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }
        return high+1+k;  // high + 1 = low
    }
}




