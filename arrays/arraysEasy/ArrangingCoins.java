package arrays.arraysEasy;

/**
 * - Problem: Arranging Coins
 * - Link: https://leetcode.com/problems/arranging-coins/
 * - Time Complexity: O(log n)
 * - Space Complexity: O(1)
 */

public class ArrangingCoins {
    public static void main(String[] args) {
        int n = 8;
        System.out.println(arrangeCoins(n));
    }
    public static int arrangeCoins(int n) {
        int low = 1;
        int high = n;
        int ans = 0;
        while(low <= high){
            long mid = low + (high-low)/2;
            long coinsUsed = mid*(mid+1)/2;
            if(coinsUsed <= n){
               ans = (int)mid;
               low = (int)mid+1;
            }
            else{
                high = (int) mid-1;
            }
        }
        return (int)ans;
    }
}
