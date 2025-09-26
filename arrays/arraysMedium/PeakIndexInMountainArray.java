package arrays.arraysMedium;

/**
 * Problem: Peak Index in a Mountain Array
 * Link: https://leetcode.com/problems/peak-index-in-a-mountain-array/
 * Time Complexity: O(log n)
 * Space Complexity: O(1)
 */

public class PeakIndexInMountainArray {
    public static void main(String[] args) {
        int[] arr = {0,2,1,0};
        System.out.println(peakIndexInMountainArray(arr));
    }
    public static int peakIndexInMountainArray(int[] arr) {
        int low = 1;
        int high = arr.length-2;
        while(low <= high){
            int mid = low + (high-low)/2;
            if(arr[mid] > arr[mid-1] && arr[mid] > arr[mid+1]){
                return mid;
            }
            else if(arr[mid] > arr[mid+1]){
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return -1;
    }
}
