package arrays.arraysBasic;


/**
 * Problem: Richest Customer Wealth
 * Link: https://leetcode.com/problems/richest-customer-wealth/
 * Time Complexity: O(m × n)
 * Space Complexity: O(1) → only uses scalar variables
 */

public class RichestCustomerWealth {
    public static void main(String[] args) {
        int[][] accounts = {
            {1,5},
            {7,3},
            {3,5}
        };

        System.out.println(maximumWealth(accounts));
    }

    public  static int maximumWealth(int[][] accounts) {
        int max = 0;
        for(int[] customer : accounts){
            int sum = sumOfArray(customer);
            max = Math.max(max,sum);
        }
        return max;
    }

    public static int sumOfArray(int[] arr){
        int sum = 0;
        for(int money  : arr){
            sum += money;
        }
        return sum;
    }
}
