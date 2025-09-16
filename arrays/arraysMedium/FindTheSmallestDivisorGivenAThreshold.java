package arrays.arraysMedium;

/**
 * - Problem: Find the Smallest Divisor Given a Threshold
 * - Link: https://leetcode.com/problems/find-the-smallest-divisor-given-a-threshold/
 * - Time Complexity: O(n * log m), where n = length of nums, m = maximum in nums
 * - Space Complexity: O(1)
 */

public class FindTheSmallestDivisorGivenAThreshold {
    public static void main(String[] args) {
        int[] nums = {44,22,33,11,1};
        int threshold = 5 ;
        System.out.println(smallestDivisor(nums, threshold));
    }
    public static int smallestDivisor(int[] nums, int threshold) {
       int low = 1;
       int high = maximum(nums); 
       int ans = high;
       while(low <= high){
        int mid = (low+high)/2;
        long sum = result(nums,mid);
        if(sum <= threshold){
            ans = mid;
            high = mid-1;
        }
        else{
            low = mid+1;
        }
       }
       return ans;
    }

    public static int maximum(int[] nums){
        int max = nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i] > max){
                max = nums[i];
            }
        }
        return max;
    }

    public static long result(int[] nums, int div){
        long s = 0;
        for(int n : nums){
            s += (n+div-1)/div;
        }
        return s;
    }
}
