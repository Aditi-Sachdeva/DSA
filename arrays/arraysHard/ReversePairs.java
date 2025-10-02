package arrays.arraysHard;

/**
- Problem: Reverse Pairs
- Link: https://leetcode.com/problems/reverse-pairs/
- Time Complexity: O(n log n)
- Space Complexity: O(n)
*/

public class ReversePairs {
    public static void main(String[] args) {
        int[] nums = {1,3,2,3,1};
        System.out.println(mergeSort(nums, 0, nums.length-1));
    }
    public static int reversePairs(int[] nums) {
        int n = nums.length;
        return mergeSort(nums,0,n-1);
    }

    public static int mergeSort(int[] arr, int low, int high){
        if(low >= high){
            return 0;
        }
        int mid = low + (high-low)/2;
        int count = 0;
        count += mergeSort(arr,low,mid);
        count += mergeSort(arr,mid+1,high);
        count += countPairs(arr,low,mid,high);
        merge(arr,low,mid,high);
        return count;
    }

    public static int countPairs(int[] arr, int low, int mid, int high){
        int right = mid+1;
        int count = 0;
        for(int i=low;i<=mid;i++){
            while(right <= high && arr[i] > (long) 2*arr[right]){
                right++;
            }
            count += (right - (mid+1));
        }
        return count;
    }

    public static void merge(int[] arr, int low, int mid, int high){
        int[] temp = new int[high-low+1];
        int left = low;
        int right = mid+1;
        int k =0;
        while(left <= mid && right <= high){
            if(arr[left] <= arr[right]){
                temp[k++] = arr[left];
                left++;
            }
            else{
                temp[k++] = arr[right];
                right++;
            }
        }
        while( left <= mid){
            temp[k++] = arr[left];
            left++;
        }

        while(right <= high){
            temp[k++] = arr[right];
            right++;
        }

        for(int i=0;i<temp.length;i++){
            arr[i+low] = temp[i];
        }
    }

    // public static void merge(int[] arr, int low, int mid, int high){
    //     ArrayList<Integer> list = new ArrayList<>();
    //     int left = low;
    //     int right = mid+1;
    //     while(left <= mid && right <= high){
    //         if(arr[left] <= arr[right]){
    //             list.add(arr[left]);
    //             left++;
    //         }
    //         else{
    //             list.add(arr[right]);
    //             right++;
    //         }
    //     }
    //     while( left <= mid){
    //         list.add(arr[left]);
    //         left++;
    //     }
    //     while(right <= high){
    //         list.add(arr[right]);
    //         right++;
    //     }
    //     for(int i=low;i<=high;i++){
    //         arr[i] = list.get(i-low);
    //     }
    // }
}
