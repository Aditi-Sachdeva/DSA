package arrays.arraysMedium;

/**
 * Problem: Pascal's Triangle
 * Link: https://leetcode.com/problems/pascals-triangle/
 * Time Complexity: O(numRows^2) — each row takes O(row) time
 * Space Complexity: O(numRows^2) — storing all rows in output list
 */

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {
    public static void main(String[] args) {
        int numRows = 5;
        System.out.println(generate(numRows));
    }
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        for(int i=1;i<=numRows;i++){
            res.add(generateRow(i));
        }
        return res;
    }

    public static List<Integer> generateRow(int row){
        List<Integer> list = new ArrayList<>();
        int ans = 1;
        list.add(ans);
        for(int i=1;i<row;i++){
            ans = ans * (row-i);
            ans = ans/ i;
            list.add(ans);
        }
        return list;
    }
}
