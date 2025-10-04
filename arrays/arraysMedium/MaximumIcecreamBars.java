package arrays.arraysMedium;

/**
 * Problem: Maximum Ice Cream Bars
 * Link: https://leetcode.com/problems/maximum-ice-cream-bars/
 * Time Complexity: O(n log n)
 * Space Complexity: O(1)
 */

 import java.util.Arrays;

public class MaximumIceCreamBars {
    public static void main(String[] args) {
        int[] costs = { 1, 3, 2, 4, 1 };
        int coins = 7;
        System.out.println(maxIceCream(costs, coins));
    }

    public static int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        int n = costs.length;
        int count = 0;
        int spent = 0;
        for (int i = 0; i < n; i++) {
            if (spent + costs[i] <= coins) {
                spent += costs[i];
                count++;
            } else {
                break;
            }
        }
        return count;
    }
}
