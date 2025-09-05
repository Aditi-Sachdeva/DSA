package arrays.arraysBasic;


/**
 * Problem: Kids With the Greatest Number of Candies
 * Link: https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */

import java.util.ArrayList;
import java.util.List;

public class KidsWithTheGreatestNumberOfCandies{
    public static void main(String[] args) {
        int candies[] = {4,2,1,1,2};
        int extraCandies = 1;
        System.out.println(kidsWithCandies(candies, extraCandies));
        
    }
        public static  List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> ans = new ArrayList<>();
        int max = 0;
        for(int c : candies){
            max = Math.max(c,max);
        }
        for(int c : candies){
            ans.add(c + extraCandies >= max);
        }
        return ans;
    }
}
