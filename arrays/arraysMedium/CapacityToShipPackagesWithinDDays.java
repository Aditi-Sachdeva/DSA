package arrays.arraysMedium;

/**
 * Problem: Capacity To Ship Packages Within D Days
 * Link: https://leetcode.com/problems/capacity-to-ship-packages-within-d-days/
 * Time Complexity: O(n * log(sum(weights) - max(weights)))
 * Space Complexity: O(1)
 */

public class CapacityToShipPackagesWithinDDays {
    public static void main(String[] args) {
        int[] weights = {1,2,3,4,5,6,7,8,9,10};
        int days = 5 ;
        System.out.println(shipWithinDays(weights, days));
    }
    public static int shipWithinDays(int[] weights, int days) {
        int low = maximum(weights);
        int high = sum(weights);
        int ans = high;
        while(low <= high){
            int mid = (low+high)/2;
            int noOfDays = daysRequired(weights,mid);
            if(noOfDays <= days){
                ans = mid;
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return ans;
    }

    public static int daysRequired(int[] weights, int capacity){
        int days = 1;
        int load = 0;
        for(int w : weights){
            if(load + w > capacity){
                days += 1;
                load = w;
            } 
            else{
                load += w;
            }
        }
        return days;
    }

    public static int maximum(int[] arr){
        int max = arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }

    public static int sum(int[] arr){
        int sum = 0;
        for(int n : arr){
            sum += n;
        }
        return sum;
    }
}
