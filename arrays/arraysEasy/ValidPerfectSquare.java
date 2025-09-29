package arrays.arraysEasy;

/**
 * - Problem: Valid Perfect Square
 * - Link: https://leetcode.com/problems/valid-perfect-square/
 * - Time Complexity: O(log n)
 * - Space Complexity: O(1)
 */

public class ValidPerfectSquare {
    public static void main(String[] args) {
        int num = 14;
        System.out.println(isPerfectSquare(num));
    }
    public static boolean isPerfectSquare(int num) {
        int low = 1;
        int high = num;
        while(low <= high){
            int mid = low+(high-low)/2;
            long sq = (long) mid*mid;
            if(sq == num){
                return true;
            }
            else if(sq < num){
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
        return false;
    }
}
