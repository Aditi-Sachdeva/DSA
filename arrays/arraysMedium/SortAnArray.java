package arrays.arraysMedium;

/**
 * Problem: Sort an Array
 * Link: https://leetcode.com/problems/sort-an-array/
 * Time Complexity: O(n log n) 
 * Space Complexity: O(n) 
 */


import java.util.Arrays;

public class SortAnArray {
    public static void main(String[] args) {
        int[] nums = {5,1,1,2,0,0};
        System.out.println(Arrays.toString(sortArray(nums)));
    }
    public static int[] sortArray(int[] nums) {
        mergeSort(nums,0,nums.length-1);
        return nums;
    }

    public static void mergeSort(int[] arr, int low, int high){
        if(low >= high){
            return;
        }
        int mid = low + (high-low)/2;
        mergeSort(arr,low,mid);
        mergeSort(arr,mid+1,high);
        merge(arr,low,mid,high);
    }

    public static void merge(int[] arr, int low, int mid, int high){
        int[] temp = new int[high-low+1];
        int i=low;
        int j=mid+1;
        int k=0;
        while(i<=mid && j<=high){
            if(arr[i] <= arr[j]){
                temp[k++] = arr[i++];
            }
            else{
                temp[k++] = arr[j++];
            }
        }

        while(i <= mid){
            temp[k++] = arr[i++];
        }
        while(j<=high){
            temp[k++] = arr[j++];
        }

        for(int idx=0;idx<temp.length;idx++){
            arr[idx+low] = temp[idx];
        }
    }
}
