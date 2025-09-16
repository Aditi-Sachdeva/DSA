package arrays.arraysMedium;

/**
 * Problem: Koko Eating Bananas
 * Link: https://leetcode.com/problems/koko-eating-bananas/
 * Time Complexity: O(n * log m), where n = number of piles, m = maximum pile size
 * Space Complexity: O(1)
 */

public class KokoEatingBananas {
    public static void main(String[] args) {
        int[] piles = {805306368,805306368,805306368};
        int h = 1000000000 ;
        System.out.println(minEatingSpeed(piles, h));
    }
    public static int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high = maximum(piles);
        int ans = high;
        while(low <= high){
            int mid = low + (high-low)/2;
            long totalH = totalHours(piles,mid);
            if(totalH <= h){
                ans = mid;
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return ans;
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

    public static long totalHours(int[] piles, int k){
        long hours = 0;
        for(int p : piles){
            hours += (p + k - 1) / k;
        }
        return hours;
    }
}
