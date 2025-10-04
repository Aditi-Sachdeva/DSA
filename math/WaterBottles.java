package math;

/**
 * Problem: Water Bottles
 * Link: https://leetcode.com/problems/water-bottles/
 * Time Complexity: O(log n)
 * Space Complexity: O(1)
 */

public class WaterBottles {
    
    public static void main(String[] args) {
        int numBottles = 15;
        int numExchange = 4;
        System.out.println(numWaterBottles(numBottles, numExchange));
    }
    public static int numWaterBottles(int numBottles, int numExchange) {
        int max = numBottles;
        int empty = numBottles;
        while(empty >= numExchange){
            int newBottles = empty/numExchange;
            max += newBottles;
            empty = empty % numExchange + newBottles ;
        }
        return max;
    }
}


