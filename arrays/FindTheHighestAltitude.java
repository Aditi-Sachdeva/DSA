package arrays;

/**
 * Problem: Find the Highest Altitude
 * Link: https://leetcode.com/problems/find-the-highest-altitude/
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */


public class FindTheHighestAltitude {
    public static void main(String[] args) {
        int[] gain = {-5,1,5,0,-7};
        System.out.println(largestAltitude(gain));
    }
    public static int largestAltitude(int[] gain) {
        int max = 0;
        int al = 0;
        for(int i =0;i<gain.length;i++){
            al += gain[i];
            max = Math.max(max,al);
        }
        return max;
    }
}
