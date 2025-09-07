package arrays.arraysEasy;

/**
 * Problem: Best Time to Buy and Sell Stock
 * Link: https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

 
public class BestTimeToBuyAndSellStock {
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        System.out.println(maxProfit(prices));
    }
    public static int maxProfit(int[] prices) {
        int min = prices[0];
        int profit = 0;
        for(int i=1;i<prices.length;i++){
            int cost = prices[i] - min;
            profit = Math.max(cost,profit);
            min = Math.min(min,prices[i]);
        }
        return profit;
    }
}
