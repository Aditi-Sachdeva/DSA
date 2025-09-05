package arrays.arraysBasic;


/**
 * Problem: Count Items Matching a Rule
 * Link: https://leetcode.com/problems/count-items-matching-a-rule/
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */


import java.util.Arrays;
import java.util.List;

public class CountItemsMatchingARule {
    public static void main(String[] args) {
        List<List<String>> items = Arrays.asList(
            Arrays.asList("phone", "blue", "pixel"),
            Arrays.asList("computer", "silver", "lenovo"),
            Arrays.asList("phone", "gold", "iphone")
        );

        String ruleKey = "color";
        String ruleValue = "silver";

        System.out.println(countMatches(items, ruleKey, ruleValue));

    }
    public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count = 0;
        int idx = ruleKey.equals("type") ? 0 : ruleKey.equals("color") ? 1 : 2;
        
        for(List<String> item : items){
            if(item.get(idx).equals(ruleValue)){
                count++;
            }
        }
        return count;
    }
}
